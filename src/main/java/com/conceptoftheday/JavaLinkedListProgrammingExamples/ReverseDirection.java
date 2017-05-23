package com.conceptoftheday.JavaLinkedListProgrammingExamples;

import java.util.Iterator;
import java.util.LinkedList;

public class ReverseDirection {

	public static void main(String[] args) {
		LinkedList<String> list = new LinkedList<String>();

		// Adding elements at the end of the list

		list.add("JAVA");

		list.add("J2EE");

		list.add("JSP");

		list.add("SERVLETS");

		list.add("JDBC");

		// Printing the elements of list

		System.out.println(list);
		Iterator<String> iterator=list.descendingIterator();
		while (iterator.hasNext()) {
			String string = (String) iterator.next();
			System.out.println(string);
			
		}
	}

}
