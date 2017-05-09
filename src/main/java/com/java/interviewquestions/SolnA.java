package com.java.interviewquestions;

import java.util.Hashtable;

public class SolnA {

	public static int getFist(int[] data) {
		Hashtable<Integer, Integer> hashtable = new Hashtable<Integer, Integer>();
		for (int i = 0; i < data.length; i++) {
			hashtable.put(data[i], 0);
		}
		for (int i = 0; i < data.length; i++) {
			if (!hashtable.containsKey(data[i])) {
				return data[i];
			}
		}

		return 0;
	}

	public static void main(String[] args) {
		int[] data = { 1, 2, 4, 9, 3, 2, 1, 4, 5 };
		System.out.println(getFist(data));

	}

}
