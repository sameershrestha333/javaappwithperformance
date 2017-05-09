package com.java.java67;

import javax.swing.text.html.HTMLDocument.HTMLReader.IsindexAction;

/**
 * Java Program to print prime numbers from 1 to 100
 * 
 * @author sameer
 *
 */

public class PrimeNumberGenerator1 {

	public static void print() {
		for (int i = 2; i <100; i++) {
			if(isP(i)){
				System.out.print(i+"-");
			}
		}

	}
	private static boolean isP(int n){
		for(int i=2;i*i<=n;i++){
			if(n%i==0)
				return false;
		}
		return true;
		
	}
	

	public static void main(String[] args) {
		print();
	}

}
