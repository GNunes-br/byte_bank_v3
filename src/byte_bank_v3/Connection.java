package byte_bank_v3;

public class Connection implements AutoCloseable {

	public Connection() {
		System.out.println("Abrindo conex�o");
	}
	
	public void gettingData() {
		System.out.println("Recebendo Dados");
		throw new IllegalStateException();
	}
	
	@Override
	public void close() {
		System.out.println("Fechando conex�o");
	}
}
