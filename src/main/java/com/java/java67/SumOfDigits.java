package com.java.java67;

import java.util.Scanner;

/**
 * Java program to find the sum of digits
 * @author sameer
 *
 */
public class SumOfDigits {

	public static void main(String[] args) {

		
		
		Scanner scanner=new Scanner(System.in);
		System.out.println("Please enter the digits");
		int input=scanner.nextInt();
		
		
		
		int sum=0;
		while(input!=0){
			int lastdigit=input%10;
			sum+=lastdigit;
			input=input/10;
		}
		System.out.println("Sum is :"+ sum);
		scanner.close();
	}

}
