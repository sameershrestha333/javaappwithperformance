package com.java.exam;

import java.util.*;

class Anagram {

	public static boolean areAnagrams(String word1, String word2) {

		/*
		 * int[] wordInt1 = new int[27]; char [] str1=word1.toCharArray();
		 * 
		 * for(int i=0; i < str1.length; i++){ int index = str1[i] - 'a';
		 * wordInt1[index] = wordInt1[index] + 1; }
		 * 
		 * int[] wordInt2 = new int[27]; char [] str2=word2.toCharArray();
		 * for(int i =0; i < str2.length; i++){ int index = str2[i] - 'a';
		 * wordInt2[index] = wordInt2[index] + 1; }
		 * 
		 * return Arrays.equals(wordInt2,wordInt1);
		 */

		char[] str1 = word1.toCharArray();
		char[] str2 = word2.toCharArray();

		Arrays.sort(str1);
		// n log n
		Arrays.sort(str2);
		return Arrays.equals(str1, str2);

	}

	public static void main(String[] args) {

		System.out.println("true = " + areAnagrams("are", "ear"));
		System.out.println("false = " + areAnagrams("noa", "ana"));
	}

}