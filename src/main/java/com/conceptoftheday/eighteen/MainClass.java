package com.conceptoftheday.eighteen;

import java.util.ArrayList;

public class MainClass {
	public static void main(String[] args) {
		ArrayList<String> list = new ArrayList<String>();

		// Now 'list' can hold 10 elements (Default Initial Capacity)

		list.ensureCapacity(20);
		// Now 'list' can hold 20 elements.
	}
}
