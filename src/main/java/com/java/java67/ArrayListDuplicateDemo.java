package com.java.java67;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

public class ArrayListDuplicateDemo {

	public static void main(String[] args) {
		// creating ArrayList with duplicate elements

		List<Integer> primes = new ArrayList<Integer>();
		primes.add(2);
		primes.add(3);
		primes.add(5);
		primes.add(7); // duplicate
		primes.add(7);
		primes.add(11); // let's print arraylist with duplicate
		System.out.println("list of prime numbers : " + primes);
		
		Set<Integer> set=new LinkedHashSet<>(primes);
		//now lets clear the old arraylist so that we can add uniuqe element from the linkedHashset
		primes.clear();
		//copying the elements from linkedHashset
		primes.addAll(set);
		System.out.println("list of prime numbers : " + primes);

	}

}
