package Main;

import java.util.Scanner;
import java.util.ArrayList;

public class main {
	// -- Main -- //
	public static void main(String[] args) {
		ArrayList<employee> arr = new ArrayList<employee>(); // Array stores employee instances
		
		// Get the name of the employee //
		String[] name = getName(); // Gets the name of the new hire
		arr.add(new employee(name[0],name[1]));
		
		// Get the department //
		arr.get(arr.size()-1).setDepartment(getDepartment());
	}
	
	public static String[] getName() {
		System.out.println("Enter name:");
		Scanner scan = new Scanner(System.in);
		String name = scan.nextLine();
		return name.split(" ");
	}
	
	public static String getDepartment() {
		System.out.println("Enter department:");
		Scanner scan = new Scanner(System.in);
		String dep = scan.nextLine();
		switch(dep) {
			case "sales":
			case "development":
			case "accounting":
				return dep;
			default:
				System.out.println("Please choose sales, development, or accounting.");
				return getDepartment();
		}
	}
}
