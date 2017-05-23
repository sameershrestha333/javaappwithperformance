package com.conceptoftheday.popular60;

import java.util.HashMap;
import java.util.Map;

public class EachCharCountInString {

	public static Map<Character, Integer> characterCount(String string) {
		Map<Character, Integer> map = new HashMap<>();
		char[] strChar = string.toCharArray();

		for (Character ch : strChar) {
			if (map.containsKey(ch)) {
				map.put(ch, map.get(ch) + 1);
			} else {
				map.put(ch, 1);
			}
		}

		return map;
	}

	public static void main(String[] args) {
	System.out.println(characterCount("Java J2EE Java JSP J2EE"));
	}

}
