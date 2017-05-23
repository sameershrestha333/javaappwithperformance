package com.conceptoftheday.collections.hashmap;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class HashMapDemo {

	public static void main(String[] args) {
		HashMap<String, Double> map = new HashMap<>();

		map.put("Ashwin", 87.55);

		map.put("Bharat", 95.65);

		map.put("Chetan", 68.13);

		map.put("Dhanjay", 74.23);

		map.put("Kartik", 65.42);

		// HashMap can have one null key and multiple null values

		map.put(null, null);

		map.put("Sandesh", null);

		// Getting the size of the map

		System.out.println("Size Of The Map : " + map.size());

		System.out.println("-----------------");

		// Displaying the elements
		System.out.println("The elements are :");
		Set<String> set = map.keySet();
		//Step 1
		/*
		 * Iterator keySetIterator = set.iterator(); while
		 * (keySetIterator.hasNext()) { Object key = keySetIterator.next();
		 * System.out.println(key + ", " + map.get(key)); }
		 */
		//Step 2
		for (String s : set) {
			System.out.println(s + ", " + map.get(s));

		}
		//step 3
		System.out.println("-----------");
		for(Map.Entry m:map.entrySet()){
			System.out.println(m.getKey()+", "+m.getValue());
		}

	}

}
