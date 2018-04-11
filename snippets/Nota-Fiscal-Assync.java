import java.util.concurrent.*;
import static java.util.concurrent.Flow.*;

public class NFSubscriber implements Subscriber<NF> {
	
	private Subscription subscription;

	@Override
	public void onSubscribe(Subscription subscription) {
		this.subscription = subscription;
		subscription.request(1);
	}

	@Override
	public void onNext(NF nf) {
		WSPrefeitura.emit(nf);
		subscription.request(1);
	}

	@Override
	public void onError(Throwable t) {
		t.printStackTrace();
	}

	// Só é executado quando o publisher é encerrado com publisher.close()
	@Override
	public void onComplete() {
		System.out.println("Todas as notas foram emitidas");
	}
}


Publisher<NF> publisher = new SubmissionPublisher<>();
NFSubscriber subscriber = new NFSubscriber();
publisher.subscribe(subscriber);

System.out.println("Gerando a nota");
publisher.submit(new NF("Cachoeira", 999_999.99));