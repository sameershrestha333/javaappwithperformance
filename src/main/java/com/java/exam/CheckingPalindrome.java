package com.java.exam;

public class CheckingPalindrome {

	public boolean check(String inputstr) {
		char[] str = inputstr.toCharArray();
		int j = inputstr.length()-1;
		for (int i = 0; i < str.length; i++) {
			if (str[i] != str[j])
				return false;
			j--;
		}
		return true;
	}

	public static void main(String[] args) {
		System.out.println(new CheckingPalindrome().check("madam1"));
	}
}
