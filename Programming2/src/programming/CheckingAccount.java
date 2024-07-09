package programming;

public class CheckingAccount extends SuperClassBank{
	
	public static void main(String args[]) { //Test 
		displayAccount();
	}
	public static void displayAccount() {
		SuperClassBank.accountSummary();
		SuperClassBank.getBalance();
	}
	public static void processWithdrawal() {
			balance = balance - 30;
			System.out.println("A $30 fee has been applied to your account and your new balance is $" + balance + ".");
	}
	
	
}
