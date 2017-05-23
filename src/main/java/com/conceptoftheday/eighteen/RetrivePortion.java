package com.conceptoftheday.eighteen;

import java.util.ArrayList;

public class RetrivePortion {

	public static void main(String[] args) {
		ArrayList<Integer> list = new ArrayList<Integer>();

		list.add(111);

		list.add(222);

		list.add(333);

		list.add(444);

		list.add(555);

		list.add(666);

		System.out.println(list); // Output : [111, 222, 333, 444, 555, 666]
		System.out.println(list.subList(1, 4));
		//Output : [222, 333, 444]
		// Retrieving a SubList
	}

}
