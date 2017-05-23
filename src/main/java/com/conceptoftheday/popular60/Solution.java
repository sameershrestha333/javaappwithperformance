package com.conceptoftheday.popular60;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Set;

class Solution {
	public static void main(String args[]) throws Exception {
		String thisLine = "";
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		while ((thisLine = br.readLine()) != null) {
			thisLine = br.readLine();
			// String word=thisLine.split(" ");
			// creating the char array
			char[] strChar = thisLine.toCharArray();
			// Creating HashMap
			HashMap<Character, Integer> map = new HashMap<>();

			for (Character ch : strChar) {
				if (map.containsKey(ch)) {
					map.put(ch, map.get(ch) + 1);
				} else {
					map.put(ch, 1);
				}
			}
			Set<Character> inputString = map.keySet();

			for (Character ch : inputString) {
				if (map.get(ch) > 1) {
					System.out.println(ch + " " + map.get(ch));
				}
			}

			System.out.println(thisLine);
		}
	}
}