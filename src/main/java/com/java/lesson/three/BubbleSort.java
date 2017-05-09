package com.java.lesson.three;

import java.util.Arrays;

public class BubbleSort {
	int[] arr = new int[] { 3, 2, 8, 9, 5 };

	/**
	 * This sort perform buble sort
	 *
	 */
	public void sort() {
		int len = arr.length;
		for (int i = 0; i < len; i++) {
			for (int j = 0; j < len - 1; j++) {
				if (arr[j] > arr[j + 1])
					swap(j, j + 1);
			} // end of inner for loop
		} // end of outer for loop
		System.out.println(Arrays.toString(arr));
	}

	private void swap(int i, int j) {
		int temp = arr[i];
		arr[i] = arr[j];
		arr[j] = temp;
	}

	public static void main(String[] args) {
		new BubbleSort().sort();
	}

}
