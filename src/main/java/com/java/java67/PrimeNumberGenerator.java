package com.java.java67;

/**
 * Java Program to print prime numbers from 1 to 100
 * 
 * @author sameer
 *
 */

public class PrimeNumberGenerator {

	public static void print() {
		//since 1 is not prime number.
		for (int i = 2; i <= 100; i++) {
			if (isPrime(i)) {
				System.out.print(i+",");
			}
		}

	}

	public static boolean isPrime(int num) {

		for (int i = 2; i * i <= num; i++) {
			if (num % i == 0) {
				return false;
			}
		}

		return true;
	}

	public static void main(String[] args) {
		print();
	}

}
