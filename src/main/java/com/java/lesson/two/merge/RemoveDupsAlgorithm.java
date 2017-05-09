package com.java.lesson.two.merge;

import java.util.ArrayList;
import java.util.List;

public class RemoveDupsAlgorithm {

	public List<Integer> removeDups(int[] arr) {
		List<Integer> list = new ArrayList<Integer>();

		for (int i = 0; i < arr.length; i++) {
			if (!list.contains(arr[i])) {
				list.add(arr[i]);
			}
		} // end of for

		return list;
	}

	public static void main(String[] args) {
		RemoveDupsAlgorithm obj = new RemoveDupsAlgorithm();
		int[] data = { 1, 2,2, 3, 3 };
		System.out.println(obj.removeDups(data));
	}

}
