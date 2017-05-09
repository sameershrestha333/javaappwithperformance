package com.javaconceptoftheday.string;

import java.util.Arrays;

public class ReverseString {

	public static void reverseByStringBuilder(String inpuString) {
		String reverseString = new StringBuffer(inpuString).reverse().toString();
		System.out.println("Reverse : " + reverseString);

	}

	public static void reverseWithoutStringBulder(String inpuString) {
		char[] inputChar = inpuString.toCharArray();

		for (int i = 0; i < inpuString.length() / 2; i++) {
			char temp = inputChar[i];
			inputChar[i] = inputChar[inpuString.length() - 1 - i];
			inputChar[inpuString.length() - 1 - i] = temp;
		}
		String reverseString = String.valueOf(inputChar);
		System.out.println("Reverse : " + reverseString);
	}

	public static String reverseRecurcively(String inpuString) {

		if ((null == inpuString) || (inpuString.length() <= 1)) {
			return inpuString;
		}

		return reverseRecurcively(inpuString.substring(1)) + inpuString.charAt(0);
	}

	public static void main(String[] args) {
		reverseByStringBuilder("Sameer");
		reverseWithoutStringBulder("Sameer");
		System.out.println("Reverse : " +reverseRecurcively("Sameer"));

	}

}
