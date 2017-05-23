package com.conceptoftheday.eighteen;

import java.util.ArrayList;
import java.util.LinkedHashSet;

public class RemovingDuplicateElements {

	public static void main(String[] args) {
		// Constructing An ArrayList

		ArrayList<String> listWithDuplicateElements = new ArrayList<String>();

		listWithDuplicateElements.add("JAVA");

		listWithDuplicateElements.add("J2EE");

		listWithDuplicateElements.add("JSP");

		listWithDuplicateElements.add("SERVLETS");

		listWithDuplicateElements.add("JAVA");

		listWithDuplicateElements.add("STRUTS");

		listWithDuplicateElements.add("JSP");

		// Printing listWithDuplicateElements

		System.out.print("ArrayList With Duplicate Elements :");

		System.out.println(listWithDuplicateElements);

		// Creating LinkedHashSet
		LinkedHashSet<String> set = new LinkedHashSet<>(listWithDuplicateElements);
		// Constructing listWithoutDuplicateElements using set
		ArrayList<String> listWithoutDuplicateElements = new ArrayList<>(set);
		// Printing listWithoutDuplicateElements

		System.out.print("ArrayList After Removing Duplicate Elements :");

		System.out.println(listWithoutDuplicateElements);
	}

}
