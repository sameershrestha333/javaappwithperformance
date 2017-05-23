package com.conceptoftheday.popular60;

import java.util.Arrays;
import java.util.Collections;

/**
 * Write a java program to find second largest number in an integer array
 * 
 * @author sameer
 *
 */
public class FindingSecondLargest {

	public static int giveSeondLargestElement(int[] arr) {
		Arrays.sort(arr);

		return arr[arr.length - 2];

	}

	public static <T> T giveSeondLargestElementGeneric(T[] arr) {
		Arrays.sort(arr);

		return arr[arr.length - 2];

	}

	public static void main(String[] args) {
		System.out.println(giveSeondLargestElement(new int[] { 47498, 14526, 74562, 42681, 75283, 45796 }));

	}

}
