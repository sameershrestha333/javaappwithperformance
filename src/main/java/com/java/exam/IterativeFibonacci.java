package com.java.exam;

import java.util.Arrays;

public class IterativeFibonacci {

	/**
	 * finding fibonacci using iterator method this will give running time of
	 * O(n)
	 * 
	 * @param n:
	 *            some positive interger
	 * @return : fibonacci of n
	 */
	public int[] getIterativeFibonacci(int n) {
		int fibo[] = new int[n];
		fibo[0] = 0;
		fibo[1] = 1;
		if (n < 2)
			return fibo;	
		for (int i = 2; i < n; i++) {
			fibo[i] = fibo[i - 1] + fibo[i - 2];
		}
		return fibo;

	}

	/**
	 * finding fibonacci using recursion method this will give running time of
	 * expontial ie(2 power of n)
	 * 
	 * @param n
	 * @return
	 */
	public static int getrecursiveFibonaci(int n) {
		if (n == 1 || n == 2)
			return 1;
		else
			return getrecursiveFibonaci(n - 1) + getrecursiveFibonaci(n - 2);
	}

	public static void main(String[] args) {
		int n = 30;

		System.out.println("========= Using Recursion=============");

		double startTime1 = System.currentTimeMillis();
		for (int i = 1; i <= n; i++) {
			System.out.print(getrecursiveFibonaci(i) + " ");
		}
		double diff1 = System.currentTimeMillis() - startTime1;
		System.out.println("\n Time taken: " + diff1 + "Milis");

		System.out.println("========= Using Iteration=============");

		double startTime = System.currentTimeMillis();
		System.out.println(Arrays.toString(new IterativeFibonacci().getIterativeFibonacci(n)));
		double diff = System.currentTimeMillis() - startTime;
		System.out.println("Time taken: " + diff + "Milis");

	}

}
