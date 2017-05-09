package com.java.string;

public class CharAtExample {
	public static void main(String args[]) {
		try {
			String name = "javatpoint";
			/*
			 * char ch = name.charAt(4);// returns the char value at the 4th
			 * index System.out.println(ch);
			 */
			// returns the char value at 4th index
			char ch = name.charAt(40);
			System.out.println(ch);
		} catch (Exception e) {
			System.err.println("IndexOutOfBound");
		}

	}
}