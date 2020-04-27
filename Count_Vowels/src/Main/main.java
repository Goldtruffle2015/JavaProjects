package Main;

import java.util.Scanner;
import java.util.Arrays;

public class main {
	// Method that checks if element is contained in array
	public static boolean contains_char(char[] arr, char var) {
		for (int i=0; i<arr.length; i++) {
			if (arr[i] == var) {
				return true;
			}
		}
		return false;
	}
	
	// Method that counts the number of vowels
	public static int count_vowel(String in) {
		in = in.toLowerCase(); // Converts letters in input to lowercase
		char[] ch = in.toCharArray(); // Converts input to character array
		
		char[] vowels = new char[] {'a','e','i','o','u'};
		
		int count = 0; // Counts the number of vowels
		for (int i = 0; i < ch.length; i++) {
			if (contains_char(vowels, ch[i])) {
				count++;
			}
		}
		return count;
	}
	
	// Main Method
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter string: ");
		String user_in = scan.nextLine();
		System.out.println(count_vowel(user_in));
	}
}
