package Main;

import java.util.Scanner;
import java.util.ArrayList;

public class main {
	// -- Main -- //
	public static void main(String[] args) {
		ArrayList<employee> arr = new ArrayList<employee>(); // Array stores employee instances
		String[] name = getName(); // Gets the name of the new hire
		arr.add(new employee(name[0],name[1]));
	}
	
	public static String[] getName() {
		System.out.println("Enter name:");
		Scanner scan = new Scanner(System.in);
		String name = scan.nextLine();
		return name.split(" ");
	}
}
