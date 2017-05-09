package com.java.exam;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Test {

	public static void main(String[] args) {
		List<Integer> arr = new ArrayList<Integer>();
		Random random = new Random();
		double startTime = System.currentTimeMillis();
		for (int i = 0; i < 10; i++) {
			int item = random.nextInt(50);
			arr.add(item);
		}
		double endTime = System.currentTimeMillis();
		System.out.println(arr);
		double diff = endTime - startTime;
		System.out.println("Time take in Millis : " + diff);

		ArrayList<Integer> newArr = removeDup(arr);
		System.out.println(newArr);
	}

	private static ArrayList<Integer> removeDup(List<Integer> arr) {
		ArrayList<Integer> newArr = null;// = null;

		for (Integer value : arr) {
			if (!newArr.contains(arr))
				newArr.add(value);
		}

		return newArr;
	}

}
