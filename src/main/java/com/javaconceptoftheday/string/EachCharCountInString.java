package com.javaconceptoftheday.string;

/**
 * Write a java program to count the total number of occurrences of a given
 * character in a string without using any loop?
 * 
 * @author sameer
 *
 */

public class EachCharCountInString {

	public static int countWithLoop(String inputString, char inputch) {
		int count = 0;
		char[] inputChar = inputString.toLowerCase().toCharArray();
		for (Character ch : inputChar) {
			if (ch.equals(inputch)) {
				count++;
			}
		}

		return count;

	}

	public static int countWithOutLoop(String inputString, char inputch) {
		int count = 0;

		int totalLength = inputString.length();
		char value=inputch;
		System.out.println(inputString.replace("e", ""));
		System.out.println(totalLength);
		count = inputString.length() - inputString.replace("inputch", "").length();

		return count;

	}

	public static void main(String[] args) {
		System.out.println("The count is :" + countWithLoop("sameer", 'e'));
		System.out.println("The count is :" + countWithOutLoop("sameer", 'e'));

	}

}
