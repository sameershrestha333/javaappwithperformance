package com.javatpoint.Javaprograms;

import com.java.exam.CheckPrimeNumber;

public class PrimeNumber {

	public static boolean checkPrimeNumber(int num) {

		for (int i = 2; i * i <= num; i++) {
			if (num % i == 0) {
				return false;
			}
		}

		return true;
	}

	public static void main(String[] args) {
		System.out.println(checkPrimeNumber(12));
	}

}
