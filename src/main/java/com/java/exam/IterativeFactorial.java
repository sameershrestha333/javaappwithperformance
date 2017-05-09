package com.java.exam;

public class IterativeFactorial {

	/**
	 * 
	 * @param n:
	 *            some positive interger
	 * @return : factorial of n
	 */
	public int getIterativeFactorial(int n) {
		if (n == 0 || n == 1)
			return 1;
		int acc = 1;
		for (int i = 1; i <=n; i++)
			acc = acc * i;
		return acc;

	}

	public static void main(String[] args) {
		System.out.println(new IterativeFactorial().getIterativeFactorial(3));
	}

}
