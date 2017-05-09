package com.java.lesson.two.merge;

import java.util.Arrays;

public class MergeProblem {

	int[] merge(int[] left, int[] right) {
		int size = left.length + right.length ;
		int[] newArray = new int[size];
		int i = 0, j = 0, k = 0;
		int leftLength = left.length;
		int rightLength = right.length;

		while (i < leftLength && j < rightLength) {
			if (left[i] <= right[j]) {
				newArray[k] = left[i];
				i++;
			} else {
				newArray[k] = right[j];
				j++;
			}
			k++;
		} // end of while
		if (i < leftLength) {
			for (int p = i; p < leftLength; p++) {
				newArray[k] = left[p];
				k++;
			}
		} else {
			for (int p = j; p < rightLength; p++) {
				newArray[k] = right[p];
				k++;
			}
		}
		/*
		 * for (int k = 0; k < left.length; k++) {
		 * 
		 * if (left[i] <= right[j]) { 
		 * newArray[k] = left[i]; 
		 * i++; 
		 * } 
		 * else 
		 * { 
		 * newArray[k] = right[j]; 
		 * j++; 
		 * }
		 * 
		 * } // end of for
		 */
		/*
		 * for (int k = j + i; k < right.length + i; k++) { 
		 * newArray[k] = right[j]; 
		 * j++; 
		 * } // end of for
		 */
		return newArray;

	}

	public static void main(String[] args) {
		MergeProblem mergeProblem = new MergeProblem();
		int[] left = { 1, 4, 5, 8, 17 };
		int[] right = { 2, 4, 8, 11, 13, 21, 23, 25 };
		int[] data = mergeProblem.merge(left, right);
		System.out.println(Arrays.toString(data));

	}

}
