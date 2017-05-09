package com.javaconceptoftheday.string;

/**
 * Write a java program to remove all white spaces from a string.
 * 
 * @author sameer
 *
 */

public class RemoveWhiteSpaces {
	public static void removeWS(String inputString) {
		// 1. Using replaceAll() Method
		System.out.println(inputString.replaceAll("\\s", ""));
		// 2. Using without replaceAll() Method
		char[] inputChar = inputString.toCharArray();
		StringBuffer stringBuffer = new StringBuffer();
		for (Character ch : inputChar) {
			if (ch != ' ' && ch != '\t') {
					stringBuffer.append(ch);
			}
		}
		System.out.println(stringBuffer);
	}

	public static void main(String[] args) {
		String str = "  Core Java jsp servlets             jdbc struts hibernate spring  ";
		removeWS(str);
	}

}
