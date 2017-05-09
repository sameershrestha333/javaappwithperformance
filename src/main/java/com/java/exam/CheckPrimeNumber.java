package com.java.exam;

public class CheckPrimeNumber {

	public boolean checkPrime(int num) {

		for (int i = 2; i * i <= num; i++) {
			if (num % i == 0) {
				return false;
			}
		}

		return true;
	}
public static void main(String[] args) {
	System.out.println(new CheckPrimeNumber().checkPrime(4));
}
	
}
