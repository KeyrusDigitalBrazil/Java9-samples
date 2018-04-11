public class NFFilterProcessor extends SubmissionPublisher<NF> implements Flow.Processor<NF, NF> {

	private Subscription subscription;

	@Override
	public void onSubscribe(Subscription subscription) {
		this.subscription = subscription;
		subscription.request(1);
	}

	@Override
	public void onNext(NF nf) {

		if(nf.hasValidAmount()) {
			submit(nf);
		} else {
			System.out.println("Nota com valor menor ou igual a zero");
		}

		subscription.request(1);
	}

	@Override
	public void onError(Throwable t) {
		t.printStackTrace();
	}

	// Só é executado quando o publisher é encerrado com publisher.close()
	@Override
	public void onComplete() {
		super.close();
	}

}


SubmissionPublisher<NF> publisher = new SubmissionPublisher();
NFSubscriber subscriber = new NFSubscriber();
NFFilterProcessor filter = new NFFilterProcessor();

publisher.subscribe(filter);
filter.subscribe(subscriber);

NF nf1 = new NF("Haythem", 100_000_999);
publisher.submit(nf);
NF nf2 = new NF("MDM", 0);
publisher.submit(nf2);
publisher.close();