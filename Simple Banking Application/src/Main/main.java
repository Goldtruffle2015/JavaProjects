package Main;

import java.util.Scanner;

/// --- Main Class --- ///
public class main {	
	public static void main(String[] args) {
		bankAccount user = new bankAccount("John Yu", 14299220);
		
		// Menu //
		user.menu();
		boolean run = true;
		while (run) {
			char choice = user.options();
			System.out.println(); // Blank space
			// Options //
			switch(choice) {
				case 'a':
				case 'A':
					user.checkBalance();
					System.out.println(); // Blank space
					break;
				case 'b':
				case 'B':
					user.deposit();
					break;
				case 'c':
				case 'C':
					user.withdraw();
					break;
				case 'd':
				case 'D':
					user.disp_last_transaction();
					break;
				default:
					System.out.println("Have a great day.");
					run = false;
			}
		}
	}
}

/// --- Bank Account --- ///
class bankAccount {
	private static String userName;
	private static int userID;
	private static int balance;
	private static String last_trans = "No transaction has been made";

	// -- Attributes -- //
	
	bankAccount(String cName, int cID) {
		userName = cName;
		userID = cID;
	}
	
	// -- Menu -- //
	public void menu() {
		System.out.println("Welcome " + userName + ".");
		System.out.println("Your ID is " + userID);
		System.out.println(); // Prints a blank line
	}
	
	// -- Options -- //
	public char options() {
		// Display the available options //
		System.out.println("A. Check Balance");
		System.out.println("B. Deposit");
		System.out.println("C. Withdraw");
		System.out.println("D. Previous transaction");
		System.out.println("E. Exit");
		System.out.println("Enter an option:");
		
		// Defines the user input //
		Scanner scan = new Scanner(System.in);
		while (true) {
			char user_in = scan.next().charAt(0);
			
			// Error check for invalid inputs //
			String valid_options = "aAbBcCdDeE";
			
			if (valid_options.contains(String.valueOf(user_in))) {
				return user_in;
			} else {
				System.out.println("Invalid input");
			}
		}
	}
	
	// -- Check balance -- //
	public void checkBalance() {
		System.out.println("Balance = $" + balance);
	}
	
	// -- Deposit -- //
	public void deposit() {
		System.out.println("Enter an amount to deposit:");
		Scanner scan = new Scanner(System.in);
		int amt = scan.nextInt();
		balance = balance + amt;
		System.out.println(); // Blank space
		last_trans = "Deposited: $" + amt;
	}
	
	// -- Withdraw -- //
	public void withdraw() {
		System.out.println("Enter an amount to withdraw:");
		Scanner scan = new Scanner(System.in);
		int amt = scan.nextInt();
		balance = balance - amt;
		System.out.println(); // Blank space
		last_trans = "Withdrawed: $" + amt;
	}
	
	// -- Last Transaction -- //
	public void disp_last_transaction() {
		System.out.println(last_trans);
		System.out.println(); // Blank space
	}
}