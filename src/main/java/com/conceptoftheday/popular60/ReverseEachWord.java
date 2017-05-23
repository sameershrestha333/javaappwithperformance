package com.conceptoftheday.popular60;

public class ReverseEachWord {

	public static void reverseEachWordOfString(String inputStr) {
		// seperating each word
		String[] strArray = inputStr.split("\\s");
		String output = "";
		for (String str : strArray) {
			String reverse = new String(new StringBuffer(str).reverse());
			output =output+ reverse + " ";
		}
		System.out.println(output);
	}

	public static void main(String[] args) {
		reverseEachWordOfString("Java Concept Of The Day");

		// avaJ tpecnoC fO ehT yaD
	}

}
