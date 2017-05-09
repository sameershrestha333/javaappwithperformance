package com.javaconceptoftheday.string;

import java.util.Scanner;

/**
 * Write a java program to count the number of words in a string?
 * 
 * @author sameer
 *
 */
public class CountTheWords {

	public static int countWords(String inputString) {
		if (inputString == null) {
			return 0;
		} else {
			// spliting words from inputString
			String[] words = inputString.split(" ");
			System.out.println(words);
			return words.length;
		}
	}

	public static void main(String[] args) {
		String input = new Scanner(System.in).nextLine();
		System.out.println("The number of words in String : " + countWords(input));
	}

}
