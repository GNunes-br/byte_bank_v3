package byte_bank_v3;

public class TestingWithdraw {

	public static void main(String[] args) {
		
		CheckingAccount checkingAccount = new CheckingAccount(123, 321);
		
		checkingAccount.deposit(200.0);
		
		try {
			checkingAccount.withdraw(210.0);			
		} catch (InsufficientBalanceException exception) {
			System.err.println(exception.getMessage());
		}
		
		System.out.println(checkingAccount.getBalance());
	}
}
