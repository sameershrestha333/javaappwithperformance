package com.conceptoftheday.popular60;

import java.util.ArrayList;
import java.util.Collections;

public class Collectionsorting {

	public static void main(String[] args) {
		// Create a list of strings
		ArrayList<String> al = new ArrayList<String>();
		al.add("Geeks For Geeks");
		al.add("Friends");
		al.add("Dear");
		al.add("Is");
		al.add("Superb");

		/*
		 * Collections.sort method is sorting the elements of ArrayList in
		 * ascending order.
		 */
		Collections.sort(al);

		// Let us print the sorted list
		System.out.println("List after the use of" + " Collection.sort() :\n" + al);
		//decending 
		Collections.sort(al,Collections.reverseOrder());;
		
		System.out.println("List after the use of" + " Collection.sort() :\n" + al);

	}

}
