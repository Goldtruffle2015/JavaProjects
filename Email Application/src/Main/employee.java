package Main;

import java.lang.StringBuilder;

public class employee {
	// -- Attributes -- //
	private static String firstName;
	private static String lastName;
	private static String department;
	private static String password;
	employee(String fName, String lName) {
		firstName = fName;
		lastName = lName;
	}
	// -- Getter -- //
	public String getPassword() {
		return password;
	}
	
	// -- Setter -- //
	public void setDepartment(String dep) {
		department = dep;
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
}

