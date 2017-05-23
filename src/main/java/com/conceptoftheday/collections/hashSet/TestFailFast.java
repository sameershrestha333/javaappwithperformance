package com.conceptoftheday.collections.hashSet;

import java.util.HashSet;
import java.util.Iterator;

public class TestFailFast {

	public static void main(String[] args) {
		HashSet<Integer> set = new HashSet<>();

		set.add(1);
		set.add(2);

		set.add(3);
		Iterator<Integer> iterator=set.iterator();
			set.add(4);
		while (iterator.hasNext()) {
			System.out.println(iterator.next());
		}
	}

}
