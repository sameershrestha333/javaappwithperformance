package com.conceptoftheday.collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class SynchronizedListExample {

	public static void main(String[] args) {
		// Creating non synchronized ArrayList object

		ArrayList<String> list = new ArrayList<String>();

		// Adding elements to list

		list.add("JAVA");

		list.add("STRUTS");

		list.add("JSP");

		list.add("SERVLETS");

		list.add("JSF");

		// Getting synchronized list
		List<String> synchronizedlist = Collections.synchronizedList(list);
		// you must use synchronized block while iterating over synchronizedList
		// you must use synchronized block while iterating over synchronizedlist
		synchronized (synchronizedlist) {
			Iterator iterator = synchronizedlist.iterator();
			while (iterator.hasNext()) {
				System.out.println(iterator.next());
			}
		}

	}

}
