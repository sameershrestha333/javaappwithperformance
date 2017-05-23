package com.conceptoftheday.collections;

import java.util.Enumeration;
import java.util.Vector;

public class VectorDemo {
	public static void main(String[] args) {
		// Creating Vector with default initial capacity of 10

		Vector<Integer> vector = new Vector<Integer>();

		// Adding elements to vector

		vector.add(10);

		vector.add(20);

		vector.add(30);

		vector.add(40);

		// Getting Enumeration object

		Enumeration<Integer> en = vector.elements();

		// traversing elements of Vector using Enumeration

		while (en.hasMoreElements()) {
			System.out.println(en.nextElement());
		}

	}
}
