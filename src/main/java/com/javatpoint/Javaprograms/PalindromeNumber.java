package com.javatpoint.Javaprograms;

import java.util.Arrays;

public class PalindromeNumber {

	public static boolean checkPalindromeWithStringBuffer(int number) {

		String strNum = Integer.toString(number);
		String reverseNum = new String(new StringBuffer(strNum).reverse()).toString();
		return strNum.equals(reverseNum);
	}

	public static boolean checkPalindromeWithoutStringBuffer(int number) {

		String strNum = Integer.toString(number);
		char[] strChar = strNum.toCharArray();
		int j = strNum.length() - 1;
		for (int i = 0; i < strNum.length(); i++) {
			if (strChar[i] != strChar[j]) {
				return false;
			}
			j--;
		}
		return true;
	}

	public static void main(String[] args) {
		System.out.println(checkPalindromeWithStringBuffer(15));
		System.out.println(checkPalindromeWithoutStringBuffer(15));

	}

}
