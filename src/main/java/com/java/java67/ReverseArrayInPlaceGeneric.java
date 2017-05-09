package com.java.java67;

import java.util.Arrays;

public class ReverseArrayInPlaceGeneric {

	public static void main(String[] args) {
		String[] names = { "John", "Jammy", "Luke" };
		System.out.println("original array: " + Arrays.toString(names));
		// reversing array
		ReverseArray(names);
		System.out.println("Reverse array" + Arrays.toString(names));
		System.out.println("Intergers: ----------");
		Integer[] namesInt = { 1, 5, 2, 9 };
		System.out.println("original array: " + Arrays.toString(namesInt));
		// reversing array
		ReverseArray(namesInt);
		System.out.println("Reverse array" + Arrays.toString(namesInt));

	}

	private static <T> void ReverseArray(T[] names) {
		if (names == null || names.length < 2) {
			return;
		}

		for (int i = 0; i < names.length / 2; i++) {
			T temp = names[i];
			names[i] = names[names.length - 1 - i];
			names[names.length - 1-i] = temp;
		}
	}

}
