package com.conceptoftheday.JavaLinkedListProgrammingExamples;

import java.util.LinkedList;

public class ElementExitstedOrNot {

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
		
		String s = "JSP";
		boolean result=list.contains(s);
		if (result) {
		System.out.println(list.indexOf(s));
		}
		
	}

}
