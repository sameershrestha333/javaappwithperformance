package com.conceptoftheday.collections.hashSet;

import java.util.HashSet;
import java.util.Iterator;

public class MainClass {

	public static void main(String[] args) {
		HashSet<Student> set = new HashSet<>();

		// Adding elements to HashSet

		set.add(new Student("Avinash", 121, "ECE"));

		set.add(new Student("Bharat", 101, "EEE"));

		set.add(new Student("Malini", 151, "Civil"));

		set.add(new Student("Suresh", 200, "IT"));

		set.add(new Student("Vikram", 550, "CS"));

		set.add(new Student("Bharat", 301, "IT"));

		set.add(new Student("Amit", 301, "IT")); // duplicate element

		set.add(new Student("Bhavya", 872, "ECE"));

		set.add(new Student("Naman", 301, "CS")); // duplicate element

		set.add(new Student("Samson", 565, "Civil"));
		// Iterating through HashSet
		/*
		 * System.out.println("Option 1"); Iterator<Student> iterator =
		 * set.iterator(); while (iterator.hasNext()) {
		 * System.out.println(iterator.next()); }
		 */
		set.forEach(System.out::println);

	}

}
