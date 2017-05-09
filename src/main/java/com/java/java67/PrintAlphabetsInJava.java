package com.java.java67;

public class PrintAlphabetsInJava {

	public static void main(String[] args) {
		printAlphbetsInLowerCase();
		printAphbetsinUpperCase();
	}

	private static void printAphbetsinUpperCase() {
		System.out.println("\n\nList of Alphabets in upper case:");
		for(char ch='A';ch<='Z';ch++){
			System.out.printf("%s ",ch);
			
		}
	}

	private static void printAlphbetsInLowerCase() {
		System.out.println("List of Alphabets in lower case:");
		for (char ch = 'a'; ch <= 'z'; ch++) {
			System.out.printf("%s ", ch);
		}
	}

}
