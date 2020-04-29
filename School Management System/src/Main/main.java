package Main;

import java.util.Scanner;

public class main {
	// -- Main -- //
	public static void main(String[] args) {
		menu();
	}
	
	// -- Menu -- //
	public void menu() {
		System.out.println("Welcome to the school management system.");
	}
	
	public void options() {
		System.out.println("A. Teacher");
		System.out.println("B. Student");
		System.out.println("C. Exit");
		Scanner scan = new Scanner(System.in);
		switch (scan.next().charAt(0)) {
			case 'A':
			case 'a':
				System.out.println("A. Add teacher");
			case 'B':
			case 'b':
				
			case 'c':
			case 'C':
				System.exit(1);
		}
		
	}
}
