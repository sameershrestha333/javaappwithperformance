package com.conceptoftheday.collections;

import java.util.Iterator;
import java.util.LinkedHashSet;

public class LinkedHashSetExample {

	public static void main(String[] args) {
		// Creating LinkedHashSet
		LinkedHashSet<String> set = new LinkedHashSet<>();
		// Adding elements to LinkedHashSet
		set.add("JAVA");

		set.add("J2EE");

		set.add("STRUTS");

		set.add("JSP");

		set.add("JDBC");
		// Adding two null elements

		set.add(null);

		set.add(null);

		set.add("HIBERNATE");
		// set.forEach(s-> System.out.print(s+", "));
		// Getting Iterator object
		Iterator<String> iterator = set.iterator();

		// set.add("Sameer");
		while (iterator.hasNext()) {
			System.out.println(iterator.next());
		}
	}

}
