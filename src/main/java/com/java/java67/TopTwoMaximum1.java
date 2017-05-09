package com.java.java67;

import java.util.Arrays;
import java.util.Scanner;

/**
 * Java program to find the Top two maximum number in array * @author sameer
 *
 */

public class TopTwoMaximum1 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Please enter the size of an array:");
		int length = scanner.nextInt();
		int[] list = new int[length];
		System.out.println("Enter the element in array");
		for (int i = 0; i < length; i++) {
			list[i] = scanner.nextInt();
		}
		int max1 = Integer.MIN_VALUE;
		int max2 = Integer.MIN_VALUE;
		for (int number : list) {
			if (number > max1) {
				max2 = max1;
				max1 = number;
			} else if (number > max2) {
				max2 = number;
			}

		}

		//System.out.println("Given integer array : " + Arrays.toString(list));
		System.out.println("Given integer array: "+ Arrays.toString(list));
		System.out.println("First maximum number is : " + max1);
		System.out.println("Second maximum number is : " + max2);

	}

}
