package com.java.java67;

public class ReverseString {

	public static String reverseWithStringBuffer(String str) {
		if (str == null)
			return null;
		String reverseString = new String(new StringBuffer(str).reverse());
		return reverseString;

	}

	public static String reverseWithoutStringBuffer(String str) {
		if (str == null)
			return null;
		return reverser(str);

	}

	private static String reverser(String str) {
		String reverse = "";
		for (int i = str.length() - 1; i >= 0; i--) {
			reverse += str.charAt(i);
		}
		return reverse;
	}

	public static void main(String[] args) {
		System.out.println(reverseWithStringBuffer("sam"));
		System.out.println(reverseWithoutStringBuffer("sam"));

	}

}
