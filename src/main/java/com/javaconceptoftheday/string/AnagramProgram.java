package com.javaconceptoftheday.string;

import java.util.Arrays;

public class AnagramProgram {

	static boolean isAnagram(String s1, String s2) {
		char[] chars1=s1.toCharArray();
		char[] chars2=s2.toCharArray();
		Arrays.sort(chars1);
		Arrays.sort(chars2);
		return Arrays.equals(chars1, chars2);
		
	}
	


	public static void main(String[] args) {
		System.out.println(isAnagram("peek", "keep"));
		System.out.println(isAnagram("peek", "keep1"));

	}

}
