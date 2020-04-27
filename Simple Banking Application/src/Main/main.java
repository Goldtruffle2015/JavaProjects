package Main;

/// --- Main Class --- ///
public class main {	
	public static void main(String[] args) {
		bankAccount user = new bankAccount("John Yu", 14299220);
		
		// Menu //
		user.menu();
	}
}

/// --- Bank Account --- ///
class bankAccount {
	private static String userName;
	private static int userID;

	// -- Attributes -- //
	
	bankAccount(String cName, int cID) {
		userName = cName;
		userID = cID;
	}
	
	public void menu() {
		System.out.println("Welcome " + userName + ".");
		System.out.println("Your ID is " + userID);
	}
}