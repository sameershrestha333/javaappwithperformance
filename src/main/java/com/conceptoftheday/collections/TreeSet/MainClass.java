package com.conceptoftheday.collections.TreeSet;

import java.util.Iterator;
import java.util.TreeSet;

// MainClass

public class MainClass {
	public static void main(String[] args) {
		// Instantiating the myComarator;
		MyComparator myComparator = new MyComparator();

		// Creating TreeSet
		TreeSet<Student> set = new TreeSet<>(myComparator);
		// Adding elements to TreeSet

		set.add(new Student(121, "Santosh", 85));

		set.add(new Student(231, "Cherry", 71));

		set.add(new Student(417, "David", 82));

		set.add(new Student(562, "Praveen", 91));

		set.add(new Student(231, "Raj", 61)); // Duplicate element

		set.add(new Student(458, "John", 76));

		set.add(new Student(874, "Peter", 83));

		set.add(new Student(231, "Hari", 52)); // Duplicate element

		set.add(new Student(568, "Daniel", 89));

		// Iterating throght set
		Iterator<Student> iterator = set.iterator();

		while (iterator.hasNext()) {
			System.out.println(iterator.next());
		}

	}
}