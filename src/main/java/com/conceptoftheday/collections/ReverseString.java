package com.conceptoftheday.collections;

import java.util.ArrayDeque;
import java.util.Arrays;

public class ReverseString {

	public static String reverse(String str) {
		char[] charStr = str.toCharArray();
		ArrayDeque<Character> arrayDeque = new ArrayDeque<>();
		for (Character ch : charStr) {
			arrayDeque.push(ch);
		}
		System.out.println(arrayDeque);
		return arrayDeque.toString();
	}

	public static void main(String[] args) {
		System.out.println(reverse("sameer"));
	}

}
