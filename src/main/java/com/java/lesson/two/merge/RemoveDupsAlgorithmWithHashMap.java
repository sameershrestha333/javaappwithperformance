package com.java.lesson.two.merge;

import java.util.Hashtable;
import java.util.Random;

public class RemoveDupsAlgorithmWithHashMap {

	public Hashtable<Integer, Integer> removeDups(int[] arr) {

		Hashtable<Integer, Integer> hashtable = new Hashtable<Integer, Integer>();
		// List<Integer> list = new ArrayList<Integer>();

		for (int i = 0; i < arr.length; i++) {
			if (!hashtable.containsKey((arr[i]))) {
				hashtable.put(arr[i], arr[i]);
			}
		} // end of for

		return hashtable;
	}

	public static void main(String[] args) {
		RemoveDupsAlgorithmWithHashMap obj = new RemoveDupsAlgorithmWithHashMap();
		Random random = new Random();
		int[] data = new int[10000];
		for (int i = 0; i < 10000; i++) {
			int item = random.nextInt(50);
			data[i] = item;
		}
		// System.out.println(Arrays.toString(data));
		System.out.println("After removing duplicates....");
		double startTime = System.currentTimeMillis();
		System.out.println(obj.removeDups(data).values());
		double endTime = System.currentTimeMillis();
		double diff = endTime - startTime;
		System.out.println("Time Taken :" + diff + " millisec");
	}

}
