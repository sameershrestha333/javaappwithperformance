package com.javaconceptoftheday.string;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/**
 * Write a java program to find the duplicate words and their number of
 * occurrences in a string?
 * 
 * @author sameer
 *
 */

public class DuplicateWordsInString {

	public static void duplicateWords(String inputString) {
		// array of String or spliting in words
		String[] words = inputString.toLowerCase().split(" ");
		// creating Hashmap
		Map<String, Integer> map = new HashMap<>();

		// checking
		for (String word : words) {
			if (map.containsKey(word)) {
				// if already exits increment by 1
				map.put(word, map.get(word) + 1);
			} else {
				// if not ,then just put with 1 value
				map.put(word, 1);
			}
		}
		// extracting all keys
		Set<String> wordsInString = map.keySet();
		for (String word : wordsInString) {
			if (map.get(word) > 1) {
				System.out.println(word + ":" + map.get(word));
			}
		}

	}

	public static void main(String[] args) {
		duplicateWords("Bread butter and bread");

		duplicateWords("Java is java again java");

		duplicateWords("Super Man Bat Man Spider Man");
	}

}
