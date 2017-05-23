package com.javatpoint.Javaprograms;

import java.util.Arrays;

public class PalindromeString {

	public static boolean checkPalindromeWithStringBuffer(String str) {

		String reverseNum = new String(new StringBuffer(str).reverse()).toString();
		return str.equals(reverseNum);
	}

	public static boolean checkPalindromeWithoutStringBuffer(String str) {

		char[] strChar = str.toCharArray();
		int j = str.length() - 1;
		for (int i = 0; i < str.length(); i++) {
			if (strChar[i] != strChar[j]) {

				return false;
			}
			j--;
		}
		return true;
	}

	public static void main(String[] args) {
		System.out.println(checkPalindromeWithStringBuffer("madam"));
		System.out.println(checkPalindromeWithoutStringBuffer("madam"));

	}

}
