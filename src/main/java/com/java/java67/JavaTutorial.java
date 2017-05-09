package com.java.java67;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class JavaTutorial {

	public static void main(String[] args) {
		List<Integer> numbers = new ArrayList<Integer>();
		numbers.add(1);
		numbers.add(2);
		numbers.add(3);
		System.out.println("ArrayList contains : " + numbers);
		// Calling remove(index)
		numbers.remove(1);
		// removing object at index 1 i.e.
		// 2nd Object,
		// which is 2
		// //Calling
		// remove(object)
		// numbers.remove(3);
		System.out.println("ArrayList contains : " + numbers);
		List<Integer> numbers1 = new ArrayList<Integer>();
		numbers1.add(101);
		numbers1.add(200);
		numbers1.add(301);
		numbers1.add(400);
		System.out.println("ArrayList Before : " + numbers1);
		Iterator<Integer> iterator=numbers1.iterator();
		while (iterator.hasNext()) {
			int temp=iterator.next();
			if (temp%2==0) {
				//numbers1.remove(temp);
				iterator.remove();
			}
		}
		
        System.out.println("ArrayList After : " + numbers1);

	}

}
