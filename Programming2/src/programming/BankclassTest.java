package programming;

public class BankclassTest extends CheckingAccount{
	public static void main(String args[]) {
		Superclassbank.accountCreation(); //New user prompted to create account.
		Superclassbank.accountSummary(); // Confirm account details.
		Superclassbank.constructor(); //Set balance to zero.
		Superclassbank.deposit(500.10); //User deposits $500.10.
		Superclassbank.getBalance(); //Confirm new balance.
		Superclassbank.withdrawal(510.25); //User withdraws $510.25. Which then applies Withdrawal fee.
		Superclassbank.getBalance(); //Confirm new balance.
		
		CheckingAccount.displayAccount(); 
}
	
}
