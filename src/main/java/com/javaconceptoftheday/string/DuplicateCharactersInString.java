package com.javaconceptoftheday.string;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/**
 * Java Program To Find Duplicate Characters In A String
 * 
 * @author sameer
 *
 */
public class DuplicateCharactersInString {

	public static void main(String[] args) {
		duplicateCharCount("JavaJ2EE");

		duplicateCharCount("Fresh Fish");

		duplicateCharCount("Better Butter");
	}

	private static void duplicateCharCount(String string) {
		// converting string in char array
		char[] inputChar=string.toCharArray();
		Map<Character, Integer> map=new  HashMap<>();
		
		for(Character ch:inputChar){
			if (map.containsKey(ch)) {
				map.put(ch, map.get(ch)+1);
			}
			else {
				map.put(ch, 1);
				
			}
		}
        //Getting a Set containing all keys of charCountMap
		Set<Character> charInputKeySet=map.keySet();
		System.out.println("List of duplicates in :"+ string);
		for(Character ch:charInputKeySet){
			if (map.get(ch)>1) {
				System.out.println(ch+ " : "+map.get(ch) );
			}
		}
		
		
		
	
	}

}
