package programming;

public class BankclassTest extends CheckingAccount{
	public static void main(String args[]) {
		SuperClassBank.accountCreation(); //New user prompted to create account.
		SuperClassBank.accountSummary(); // Confirm account details.
		SuperClassBank.constructor(); //Set balance to zero.
		SuperClassBank.deposit(500.10); //User deposits $500.10.
		SuperClassBank.getBalance(); //Confirm new balance.
		SuperClassBank.withdrawal(510.25); //User withdraws $510.25. Which then applies Withdrawal fee.
		SuperClassBank.getBalance(); //Confirm new balance.
		
		CheckingAccount.displayAccount(); 
}
	
}
