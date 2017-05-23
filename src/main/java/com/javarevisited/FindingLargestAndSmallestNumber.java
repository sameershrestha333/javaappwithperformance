package com.javarevisited;

import java.util.Arrays;

/**
 * find the largest and smallest number from an integer array
 * 
 * @author sameer For example, if given array is {1, 2, 3, 4, 5, 6} then your
 *         program should print the largest number as 6 and smallest number as
 *         1.
 */
public class FindingLargestAndSmallestNumber {

	/**
	 * method to find the max element in the array
	 * 
	 * @param arr
	 * @return max element from the given array
	 */

	public static int getLar(int[] arr) {

		if (arr == null || arr.length == 0) {
			throw new IllegalArgumentException("Invalid Input " + Arrays.toString(arr));
		}

		int large = arr[0];
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] > large) {
				large = arr[i];
			}
		}
		System.out.println("Largest :" + large);
		return large;
	}

	public static int getSmall(int[] arr) {

		if (arr == null || arr.length == 0) {
			throw new IllegalArgumentException("Invalid Input " + Arrays.toString(arr));
		}

		int min = arr[0];
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] < min) {
				min = arr[i];
			}
		}
		System.out.println("Smallest :" + min);
		return min;
	}

	public static void main(String[] args) {
		 System.out.println(getLar(new int[] { 1, 2, 3, 4, 5, 6 }));
		 System.out.println(getSmall(new int[] { 1, 2, 3, 4, 5, 6 }));
		//System.out.println(getLar(new int[] {}));

	}

}
