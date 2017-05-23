package com.conceptoftheday.collections;

import java.util.ArrayDeque;

public class ArrayDequeAsStack {

	public static void main(String[] args) {

		ArrayDeque<String> arrayDeque = new ArrayDeque<>();
		arrayDeque.push("One");

		arrayDeque.push("Two");

		arrayDeque.push("Three");

		arrayDeque.push("Four");

		arrayDeque.push("Five");
		System.out.println(arrayDeque);
		
		
	}

}
