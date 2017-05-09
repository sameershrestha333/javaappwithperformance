package com.java.lesson.two.merge;

public class ZeroCount {

	public static void main(String[] args) {
		int[] a = { 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1,
				1, 1, 1, 1, 1, 1, 1, 1, 1, 1 };
		System.out.println("Number of zeros: " + count(a, 0, a.length));
		System.out.println("Number of ones: " + (a.length - count(a, 0, a.length)));

	}

	public static int count(int[] a, int lower, int upper) {
		System.out.println("here");
		int mid = (lower + upper) / 2;
		if (a[upper - 1] == 0) {
			return upper;
		}
		if (a[lower] == 1) {
			return 0;
		}
		if (a[mid] != a[mid - 1]) {
			return mid;
		} else if (a[mid] != a[mid + 1]) {
			return mid + 1;
		} else {
			if (a[mid] == 1) {
				System.out.println("here");
				return count(a, lower, mid - 1);
			} else {
				System.out.println("here");
				return count(a, mid + 1, upper);
			}
		}

	}

}