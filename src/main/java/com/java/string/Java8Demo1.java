package com.java.string;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Java Program to show How to use forEach() statement in Java8. You can loop
 * over a list, set or any collection using this method. You can even do
 * filtering and transformation and can run the loop in parallel.
 *
 * @author WINDOWS 8
 */
public class Java8Demo1 {

	public static void main(String args[]) {

		List<String> alphabets = new ArrayList<>(Arrays.asList("aa", "bbb", "cac", "dog"));
		// looping over all elements using Iterable.forEach() method
		// alphabets.forEach(s -> System.out.println(s));
		/* You can even replace lambda expression with method reference
		 because we are passing the lambda parameter as it is to the
		method*/
		//alphabets.forEach(System.out::println);
		// you can even do something with lambda parameter e.g. adding a comma
	//	alphabets.forEach(s->System.out.println(s+","));
		//alphabets.stream().filter(s->s.startsWith("a")).forEach(System.out::println);
		// let's filter out only which has length greater than 2
		alphabets.stream().filter(s->s.length()>2).forEach(System.out::println);
		// how about calculating sum of length of all string
			System.out.println(alphabets.stream().mapToInt(s -> s.length()).sum());
			System.out.println(alphabets.stream().mapToInt(s->s.length()).sum());
	}

}
