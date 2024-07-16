package com.chainsys.skillmatrix;

import java.util.Scanner;

public class FirstRecurringLetter {
	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the String:");
		String str=scanner.nextLine();

		char firstRecurringChar = findFirstRecurringletter(str);
		if (firstRecurringChar != '\0') {
			System.out.println("First recurring letter: "+ firstRecurringChar );
		} else {
			System.out.println("No recurring letter found.");
		}
		scanner.close();
	}

	public static char findFirstRecurringletter(String str) {
		int length = str.length();
		for (int i = 0; i < length; i++) {
			char currentChar = str.charAt(i);
			for (int j = i + 1; j < length; j++) {
				if (currentChar == str.charAt(j)) {
					return currentChar;
				}
			}
		}
		return 0; 

	}

}