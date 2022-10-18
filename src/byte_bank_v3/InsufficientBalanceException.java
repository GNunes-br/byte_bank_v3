package byte_bank_v3;

// Unchecked
// public class InsufficientBalanceException extends RuntimeException {}

// Checked
public class InsufficientBalanceException extends Exception {

	public InsufficientBalanceException() {
		super("Saldo insuficiente");
	}
	
	public InsufficientBalanceException(String message) {
		super(message);
	}
}
