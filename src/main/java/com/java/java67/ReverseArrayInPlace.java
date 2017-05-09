package com.java.java67;

import java.util.Arrays;

public class ReverseArrayInPlace {

	public static void main(String[] args) {
		String[] names = { "John", "Jammy", "Luke" };
		System.out.println("original array: " + Arrays.toString(names));
		//reversing array
		ReverseArray(names);
		System.out.println("Reverse array"+ Arrays.toString(names));
	}

	private static void ReverseArray(String[] names) {
		for(int i=0;i<names.length/2;i++){
			String temp=names[i];
			names[i]=names[names.length-1-i];
			names[names.length-1]=temp;
		}
	}

}
