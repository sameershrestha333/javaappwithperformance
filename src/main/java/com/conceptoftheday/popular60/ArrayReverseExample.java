package com.conceptoftheday.popular60;

import java.util.ArrayList;
import java.util.Arrays;

public class ArrayReverseExample {

	public static int[] reverseArray(int[] arrayList) {
		System.out.println("Original :"+ Arrays.toString(arrayList));

		for (int i = 0; i < arrayList.length/2; i++) {
			int temp = arrayList[i];
			arrayList[i] = arrayList[arrayList.length - 1 - i];
			arrayList[arrayList.length - 1 - i] = temp;
		}
		return arrayList;

	}

	public static void main(String[] args) {
		System.out.println("Reverse :"+Arrays.toString(reverseArray(new int[] { 4, 5, 8, 9, 10 })));

		System.out.println("-------------------------");
	}

}
