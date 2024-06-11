package programming2;

import java.util.Scanner;

public class Superclassbank {
	static String firstName;
	static String lastName;
	static int accountID;
	static double balance;
	public static Scanner scnr = new Scanner(System.in);
	
	public static void constructor() {
		balance = 0.0;
	}
	public static void deposit(double userDeposit) {
		balance = balance + userDeposit;
		System.out.println("$" + userDeposit + " has been deposited.");
		
	}
	public static void withdrawal(double userWithdrawal) {
		if (balance >= userWithdrawal) {
			balance = balance - userWithdrawal;
		}
		else {
				System.out.println("This account does not have enough funds to withdraw that amount.");
		}
		
	}
	public static void accountCreation() {
		System.out.println("First Name:");
		firstName = scnr.nextLine();
		System.out.println("Last Name:");
		lastName = scnr.nextLine();
		System.out.println("Account ID:");
		accountID = scnr.nextInt();
	}
	public static void accountSummary() {
		System.out.println(firstName + " " + lastName + "'s Account:");
		System.out.println("Acc ID: " + accountID);
	}
	public static double getBalance() {
		return balance;
	}
	
}
	


