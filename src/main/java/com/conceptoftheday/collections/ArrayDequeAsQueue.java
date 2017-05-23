package com.conceptoftheday.collections;

import java.util.ArrayDeque;

public class ArrayDequeAsQueue {

	public static void main(String[] args) {
		// Creating Array Queue
		ArrayDeque<String> arrayDeque = new ArrayDeque<>();
		arrayDeque.offer("One");

		arrayDeque.offer("Two");

		arrayDeque.offer("Three");

		arrayDeque.offer("Four");

		arrayDeque.offer("Five");
		System.out.println(arrayDeque);
		System.out.println(arrayDeque.poll());
	}

}
