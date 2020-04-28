package Main;

import java.lang.StringBuilder;

public class employee {
	// -- Attributes -- //
	private static String firstName;
	private static String lastName;
	private static String department;
	private static String email;
	private static String password;
	private static int mailboxcap;
	employee(String fName, String lName) {
		firstName = fName;
		lastName = lName;
	}
	// -- Getter -- //
	public String getPassword() {
		return password;
	}
	
	public String getName() {
		return firstName + " " + lastName;
	}
	
	public String getEmail() {
		return email;
	}
	
	public String getMailboxCap() {
		return Integer.toString(mailboxcap) + "Mb";
	}
	
	// -- Setter -- //
	public void setDepartment(String dep) {
		department = dep;
		}
	
	public void setPassword(String var) {
		password = var;
	}
	
	public void setMailboxCap(int var) {
		mailboxcap = var;
	}
	
	// -- More methods -- //
	public void generateRandomPassword(int size) {
		// String of possible characters //
		String alphaNumericString = "ABCDEFGHIJKLMNOPQRSTUVWXYZ" 
				+ "0123456789"
				+ "abcdefghijklmnopqrstuvwxyz";
		// StringBuilder //
		StringBuilder sb = new StringBuilder(size);
		
		// Generate random string //
		for (int i=0;i<size;i++) {
			int index = (int)(Math.random()*alphaNumericString.length());
			sb.append(alphaNumericString.charAt(index));
		}
		
		password = sb.toString();
	}
	
	public void generateEmail() {
		switch (department) {
			case "none":
				email = firstName + "." + lastName + "@company.com";
			case "sales":
			case "development":
			case "accounting":
				email = firstName + "." + lastName + "@" + department + ".company.com";
		}
	}
}

