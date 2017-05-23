package com.conceptoftheday.popular60;

public class CheckArmstrongNumber {

	public static boolean checkArmstrongNumber(int num) {
		int sizeOfNumber = String.valueOf(num).length();
		// System.out.println(sizeOfNumber);
		int sum = 0;
		int copyNum = num;
		while (num != 0) {
			int lastDigit = num % 10;
			sum += Math.pow(lastDigit, sizeOfNumber);
			// sum += lastDigit * lastDigit * lastDigit;
			num = num / 10;

		}

		return copyNum == sum;
	}

	public static void main(String[] args) {
		System.out.println(checkArmstrongNumber(153));
	}

}
