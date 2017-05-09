package com.java.exam;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class FirstRepeatedCharacter {

	public static Character FRC(String str) {

		if (str != null) {

			char[] charStr = str.toLowerCase().toCharArray();

			Map<Character, String> map = new HashMap<Character, String>();
			for (Character ch : charStr) {
				if (map.containsKey(ch)) {
					return ch;
				} else {
					map.put(ch, "a");
				}
			}

		}
		return null;
	}

	public static void findDuplicateCharacters(String str) {
		char[] characters = str.toCharArray();
		Map<Character, Integer> map = new HashMap<>();
		for (Character ch : characters) {
			if (map.containsKey(ch)) {
				map.put(ch, map.get(ch) + 1);
			} else {
				map.put(ch, 1);
			}
		}

		// Iterate through HashMap to print all duplicate characters of String
		Set<Map.Entry<Character, Integer>> entrySet = map.entrySet();
		System.out.printf("List of duplicate characters in String '%s' %n", str);
		for (Map.Entry<Character, Integer> entry : entrySet) {
			if (entry.getValue() > 1) {
				System.out.printf("%s : %d %n", entry.getKey(), entry.getValue());
			}
		}

	}

	public static void main(String[] args) {
		System.out.println(FRC("Ssaameer"));
		findDuplicateCharacters("Programming");
		findDuplicateCharacters("Combination");
		findDuplicateCharacters("Java");
	}

}
