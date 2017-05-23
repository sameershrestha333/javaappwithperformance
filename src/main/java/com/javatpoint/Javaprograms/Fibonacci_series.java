package com.javatpoint.Javaprograms;

import static org.hamcrest.CoreMatchers.instanceOf;

import java.util.Arrays;
import java.util.Scanner;

public class Fibonacci_series {
	public static int[] findFibWithoutRecursion(int nthTerm) {
		int[] arr = new int[nthTerm];

		arr[0] = 0;
		arr[1] = 1;
		if (nthTerm < 2) {
			return arr;
		} else {
			for (int i = 2; i < nthTerm; i++) {
				arr[i] = arr[i - 2] + arr[i - 1];
			}
		}
		return arr;
	}

	public static int findFibWithRecursion(int n) {
		if (n == 1 || n == 2) {
			return 1;
		} else {
			return findFibWithRecursion(n - 1) + findFibWithRecursion(n - 2);

		}
	}

	public static void main(String[] args) {
		int nthTerm =10;// new Scanner(System.in).nextInt();
		System.out.println(Arrays.toString(findFibWithoutRecursion(nthTerm)));
		for (int i = 1; i < nthTerm; i++) {
			System.out.print(findFibWithRecursion(i) + ",");

		}

	}

}
