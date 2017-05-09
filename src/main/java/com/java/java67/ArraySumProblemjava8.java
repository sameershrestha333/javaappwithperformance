package com.java.java67;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

/**
 * Java program to find the sum of the array elements input =[1,2,4]; output =7;
 * 
 * @author sameer
 *
 */

public class ArraySumProblemjava8 {

	public static void main(String[] args) {

		System.out.println("Please enter the length of the array.");
		Scanner scanner = new Scanner(System.in);
		int size = scanner.nextInt();
		System.out.println("Please enter the array element.");

		List<Integer> list = new ArrayList<>();
		for (int i = 0; i < size; i++) {
			list.add(scanner.nextInt());
		}
		int sum = list.stream().reduce(0, Integer::sum);
		System.out.println("The total sum is : "+sum);
		scanner.close();
	}

}
