package Main;

public class employee {
	// -- Attributes -- //
	private static String firstName;
	private static String lastName;
	private static String department;
	employee(String fName, String lName) {
		firstName = fName;
		lastName = lName;
	}
	
	public void setDepartment(String dep) {
		switch(dep) {
			case "sales":
			case "development":
			case "accounting":
				department = dep;
		}
	}
}
