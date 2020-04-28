package Main;

import java.util.Scanner;

/// --- Main Class --- ///
public class main {	
	public static void main(String[] args) {
		bankAccount user = new bankAccount("John Yu", 14299220);
		
		// Menu //
		user.menu();
		char choice = user.options();
		
		// Options //
		switch(choice) {
		case 'a':
		case 'A':
			user.checkBalance();
		}
	}
}

/// --- Bank Account --- ///
class bankAccount {
	private static String userName;
	private static int userID;
	private static int balance;

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
		System.out.println("Balance = " + balance);
	}
}