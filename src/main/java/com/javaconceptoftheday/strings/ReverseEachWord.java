package com.javaconceptoftheday.strings;

public class ReverseEachWord {

	public static String giveReverseWithStringBuilder(String str) {

		if (str == null || str.length() <= 0) {
			{
				throw new IllegalArgumentException("Invalid String :" + str);
			}

		}
		String reverseString = "";
		String[] word = str.split(" ");
		for (String s : word) {
			reverseString =reverseString+ new String(new StringBuilder(s).reverse()).toString()+" ";
		}

		return reverseString;
	}
	public static String giveReverseWithoutStringBuilder(String str) {

		if (str == null || str.length() <= 0) {
			{
				throw new IllegalArgumentException("Invalid String :" + str);
			}

		}
		String reverseString = "";
		String[] word = str.split(" ");
		String reverseWord="";
		for (String s : word) {
			for(int i=s.length()-1;i>=0;i--){
				reverseWord+=s.charAt(i);
			}
			reverseString=reverseString+ reverseWord +" ";
			reverseWord="";
		}

		return reverseString;
	}

	public static void main(String[] args) {
		System.out.println(giveReverseWithStringBuilder("Java Concept Of The Day"));
		System.out.println(giveReverseWithoutStringBuilder("Java Concept Of The Day"));

		// avaJ tpecnoC fO ehT yaD

	}

}
