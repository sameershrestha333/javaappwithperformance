package com.conceptoftheday.popular60;

import java.util.Arrays;

public class EqualityOfTwoArrays {

	public static boolean checkArray(int[] arr1, int[] arr2) {

		return Arrays.equals(arr1, arr2);
	}

	public static boolean checkArrayWithoutEquals(int[] arr1, int[] arr2) {

		for (int i = 0; i < arr1.length; i++) {

			if (arr1[i] != arr2[i]) {
				return false;
			}

		}

		return true;

	}

	public static void main(String[] args) {
		int[] arr1 = { 1, 2, 3 };
		int[] arr2 = { 1, 2, 3 };
		System.out.println(checkArray(arr1, arr2));
		System.out.println(checkArrayWithoutEquals(arr1, arr2));

	}

}
