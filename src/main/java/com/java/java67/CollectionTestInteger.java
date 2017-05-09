package com.java.java67;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class CollectionTestInteger {

	public static void main(String[] args) {
		// Creating and populating ArrayList in Java for Sorting
		ArrayList<Integer> unsortedList = new ArrayList<Integer>();

		unsortedList.add(100);
		unsortedList.add(800);
		unsortedList.add(700);
		unsortedList.add(1800);
		unsortedList.add(1700);
		System.err.println("unsorted ArrayList in Java : " + unsortedList);
		//Sorting ArrayList in ascending Order in Java

		Collections.sort(unsortedList);
		System.err.println("sorted ArrayList in Java : " + unsortedList);
		
		//Sorting ArrayList in decending Order in java
		Collections.sort(unsortedList, Collections.reverseOrder());
		System.err.println("sorted ArrayList in Java (Decending) : " + unsortedList);
		Iterator<Integer> iterator=unsortedList.iterator();
		int count=0;
		while(count<2&& iterator.hasNext()){
			System.out.println("The value is :"+iterator.next());
			count++;
		}
	}

}
