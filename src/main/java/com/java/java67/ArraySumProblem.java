package com.java.java67;

import java.util.Iterator;
import java.util.Scanner;

/**
 * Java program to find the sum of the array elements input =[1,2,4]; output =7;
 * 
 * @author sameer
 *
 */

public class ArraySumProblem {

	public static void main(String[] args) {

		System.out.println("Please enter the length of the array.");
		Scanner scanner = new Scanner(System.in);
		int size = scanner.nextInt();
		int[] arrayList = new int[size];
		
		System.out.println("Please enter the array elements:");
		for (int i = 0; i < size; i++) {
			arrayList[i] = scanner.nextInt();
		}
		int result = findSum(arrayList);
		System.out.println("The total sum of the array elements :"+result);
		scanner.close();
	}

	private static int findSum(int[] arrayList) {
		int sum = 0;
		for (int i : arrayList) {
			sum += i;
		}
		return sum;
	}

}
