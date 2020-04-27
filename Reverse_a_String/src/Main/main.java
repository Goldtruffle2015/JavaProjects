package Main;

import java.util.Scanner; // Import the scanner class
import java.util.*;

public class main {
	public static String reverse_user_input(String input) {
		char[] ch = input.toCharArray(); // Converts user_input into character array
		int left = 0; // Sets the left index to 0
		int right = input.length()-1; // Sets the right index to rightmost element
		char temp; // Creates a temporary variable
		while (right > left) {
			temp = ch[left];
			ch[left] = ch[right];
			ch[right] = temp;
			left++;
			right--;
		}
		
		return new String(ch);
	}
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in); // Create a scanner object
		System.out.println("Enter text: ");
		String user_input = scan.nextLine(); // Reads user input
		System.out.println(reverse_user_input(user_input));
	}
}
