package byte_bank_v3;

public class TestingConnection {

	public static void main(String[] args) {
		
		try (Connection connection = new Connection()) {
			
			connection.gettingData();
		} catch (IllegalStateException ex) {
			System.err.println("Erro ao estabelecer conexão!");
		}
	}
}
