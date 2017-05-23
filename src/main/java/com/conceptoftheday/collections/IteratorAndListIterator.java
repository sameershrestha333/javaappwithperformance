package com.conceptoftheday.collections;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

class IteratorAndListIterator {
	public static void main(String[] args) {
		List<String> list = new ArrayList<String>();

		list.add("FIRST");

		list.add("SECOND");

		list.add("THIRD");

		ListIterator<String> listIterator = list.listIterator();

		System.out.println(list); // Output : [FIRST, SECOND, THIRD]

		while (listIterator.hasNext()) {
			listIterator.next();

			// Modifying an element returned by next()
			listIterator.set("MODIFIED");
		}

		System.out.println(list); // Output : [MODIFIED, MODIFIED, MODIFIED]

		Iterator<String> iterator = list.iterator();

		while (iterator.hasNext()) {
			iterator.next();

			// Removing an element
			iterator.remove();
		}

		System.out.println(list); // Output : []
	}
}