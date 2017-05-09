package com.javaconceptoftheday.string;

public class ReverseEachWord {

	static void reverseEachWordOfString(String inputString) {
		String[] charString = inputString.split("\\s");
		String output = "";

		for (String str : charString) {
			String reverse = new String(new StringBuilder(str).reverse());
			// System.out.println(reverse);
			output = output + reverse + " ";
		}
		System.out.println(inputString);
		System.out.println(output);
		System.out.println("--------------------------");

	}

	public static void main(String[] args) {
		reverseEachWordOfString("Java Concept Of The Day");

		reverseEachWordOfString("Java J2EE JSP Servlets Hibernate Struts");

		reverseEachWordOfString("I am string not reversed");

		reverseEachWordOfString("Reverse Me");

	}

}
