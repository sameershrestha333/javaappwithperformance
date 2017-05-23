package com.conceptoftheday.eighteen;

import java.util.ArrayList;

public class ReplacingParticular {
	public static void main(String[] args) {
		ArrayList<Integer> list = new ArrayList<Integer>();

		list.add(111);

		list.add(222);

		list.add(333);

		list.add(444);

		System.out.println(list); // Output : [111, 222, 333, 444]

		// Replacing the element at index 1 with '000'
		
		list.set(1, 000);
		
		System.out.println(list);
	}

}
