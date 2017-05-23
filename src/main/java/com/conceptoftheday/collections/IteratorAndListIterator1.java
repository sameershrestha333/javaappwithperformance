package com.conceptoftheday.collections;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Set;

class IteratorAndListIterator1 {
	public static void main(String[] args) {
		List list = new ArrayList<>();
		list.add("ONE");

		list.add("TWO");

		list.add("THREE");
		// transerving list through Iterator
		Iterator iterator = list.iterator();
		while (iterator.hasNext()) {
			System.out.print(iterator.next() + ",");
		}
		System.out.println("\n--------Queue---------");
		Queue queue = new PriorityQueue<>(list);
		Iterator iterator1 = queue.iterator();
		while (iterator1.hasNext()) {
			System.out.print(iterator1.next() + ",");
		}
		System.out.println("\n--------Set---------");
		Set set = new HashSet<>(list);
		Iterator iterator2 = set.iterator();
		while (iterator2.hasNext()) {
			System.out.print(iterator2.next() + ",");
		}
		System.out.println("\n--------listIterator---------");

		ListIterator listIterator = list.listIterator();
		while (listIterator.hasNext()) {
			System.out.print(listIterator.next() + ",");
		}
	}
}