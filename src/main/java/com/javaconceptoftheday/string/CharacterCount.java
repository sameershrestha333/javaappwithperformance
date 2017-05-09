package com.javaconceptoftheday.string;

import java.util.HashMap;
import java.util.Map;

/**
 * Java Program To Count Occurrences Of Each Character In String
 * 
 * @author sameer
 *
 */

public class CharacterCount {

	public static void countEachCharacter(String inputString) {
		// spliting into the char []
		char[] inputChar = inputString.toCharArray();
		Map<Character, Integer> map = new HashMap<>();

		for (Character ch : inputChar) {
			if (map.containsKey(ch)) {
				map.put(ch, map.get(ch) + 1);
			} else {
				map.put(ch, 1);
			}
		}	
		System.out.println(map);

	}

	public static void main(String[] args) {
		countEachCharacter("sameer");
	}

}
