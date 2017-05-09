package com.java.java67;

import java.util.Scanner;

public class ArmstrongTest {

	public static boolean isArmStrong(int num) {
		int sum = 0;
		int tem = num;
		while (num != 0) {
			int lastDigit = num % 10;
			sum += lastDigit *lastDigit*lastDigit;
			num = num / 10;
		}

		return (sum == tem);
	}

	public static void main(String[] args) {
		System.out.println("Enter the 3 digits number");
		int num = new Scanner(System.in).nextInt();
		// printing result

		if (isArmStrong(num)) {
			System.out.println("Number : " + num + " is an Armstrong number");
		} else {
			System.out.println("Number : " + num + " is no an Armstrong number");

		}
	}

}
