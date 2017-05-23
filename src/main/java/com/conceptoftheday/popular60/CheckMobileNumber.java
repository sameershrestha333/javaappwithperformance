package com.conceptoftheday.popular60;

import java.util.Scanner;

public class CheckMobileNumber {

	public static void main(String[] args) {
		System.out.println("Enter your mobile number");
		String input = new Scanner(System.in).nextLine();
		if (isNumber(input) && input.length() == 10) {
			System.out.printf("%s is the valid number", input);
		} else {
			System.out.printf("%s is not the valid number", input);

		}

	}

	private static boolean isNumber(String input) {

		try {
			// Integer.parseInt(input);
			Long.parseLong(input);
		} catch (NumberFormatException e) {
			return false;
		}

		return true;
	}

}
