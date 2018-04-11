public class NF	{
	private	String	client;
	private double	amount;
	public	NF(String	client,	double	amount) {
		this.client	=	client;
		this.amount	=	amount;
	}
	public	boolean	hasValidAmount() {
		return	amount	>	0;	
	}
}

public class WSPrefeitura {

	public static void emit(NF nf) {
		try {
			System.out.println("Emitindo");
			Thread.sleep(5_000);
			System.out.println("Emitido!");
		} catch (Exception e ){
			System.out.println("Falha ao emitir NF");
		}
	}

}

NF nf = new NF("Luizinho", 50);
WSPrefeitura.emit(nf);


// ######################## REATIVO #########################
SubmissionPublisher<NF> submissionPublisher = new SubmissionPublisher<>();
submissionPublisher.consume(WSPrefeitura::emit);
System.out.println("Gerando a nota");
NF nf2 = new NF("Marcel F.", 99.9);
submissionPublisher.submit(nf)
System.out.println("Parabéns pela sua compra");
