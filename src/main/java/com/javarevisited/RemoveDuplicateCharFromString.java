package com.javarevisited;

import java.util.HashMap;

public class RemoveDuplicateCharFromString {

	public static String removeDup(String string) {
		String uniqueChar = "";
		HashMap<Character, Integer> map = new HashMap<>();

		char[] charStr = string.toCharArray();

		for (Character c : charStr) {
			if (!map.containsKey(c)) {
				map.put(c, 1);
				uniqueChar += c;
			}
		}
		return uniqueChar;
	}

	public static void main(String[] args) {
		System.out.println(removeDup("aaabb"));
	}
}
