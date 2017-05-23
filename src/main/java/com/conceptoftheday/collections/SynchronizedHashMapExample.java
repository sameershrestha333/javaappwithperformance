package com.conceptoftheday.collections;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class SynchronizedHashMapExample {

	public static void main(String[] args) {

		// Creating HashMap object which is not synchronized

		HashMap<String, Integer> map = new HashMap<String, Integer>();

		// Adding elements to map

		map.put("ONE", 1);

		map.put("TWO", 2);

		map.put("THREE", 3);

		map.put("FOUR", 4);

		map.put("FIVE", 5);

		// creating synchronized hashmap
		Map<String, Integer> synchronizedMap = Collections.synchronizedMap(map);
		//need to creating sychronized blook
		Set<String> set=synchronizedMap.keySet();
		synchronized (synchronizedMap) {
			for(String str:set){
				System.out.println(str+", "+synchronizedMap.get(str));
			}
		}

	}

}
