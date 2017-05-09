package com.java.java67;

import java.util.ArrayList;
import java.util.Collections;

public class CollectionTest {

	public static void main(String[] args) {
		// Creating and populating ArrayList in Java for Sorting
		ArrayList<String> unsortedList = new ArrayList<String>();

		unsortedList.add("Java");
		unsortedList.add("C++");
		unsortedList.add("J2EE");

		System.err.println("unsorted ArrayList in Java : " + unsortedList);
		//Sorting ArrayList in ascending Order in Java

		Collections.sort(unsortedList);
		System.err.println("sorted ArrayList in Java : " + unsortedList);
		
		//Sorting ArrayList in decending Order in java
		Collections.sort(unsortedList, Collections.reverseOrder());
		System.err.println("sorted ArrayList in Java (Decending) : " + unsortedList);

	}

}
