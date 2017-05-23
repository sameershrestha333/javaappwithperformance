package com.conceptoftheday.popular60;

import java.util.HashSet;
import java.util.Iterator;

public class Student {
	private String name;
	private int rollNo;
	private String deparment;

	public Student(String name, int rollNo, String deparment) {
		this.name = name;
		this.rollNo = rollNo;
		this.deparment = deparment;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + rollNo;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Student other = (Student) obj;
		if (rollNo != other.rollNo)
			return false;
		return true;
	}

	@Override
	public String toString() {
		return name + " , " + rollNo + " , " + deparment;
	}

	public static void main(String[] args) {

		HashSet<Student> set = new HashSet<>();

		set.add(new Student("Avinash", 121, "ECE"));

		set.add(new Student("Bharat", 101, "EEE"));

		set.add(new Student("Malini", 151, "Civil"));

		set.add(new Student("Suresh", 200, "IT"));

		set.add(new Student("Vikram", 550, "CS"));

		set.add(new Student("Bharat", 301, "IT"));

		set.add(new Student("Amit", 301, "IT")); // duplicate element

		set.add(new Student("Bhavya", 872, "ECE"));

		set.add(new Student("Naman", 301, "CS")); // duplicate element

		set.add(new Student("Samson", 565, "Civil"));
		Iterator<Student> iterator=set.iterator();
		while(iterator.hasNext()){
			System.out.println(iterator.next());
		}
		set.forEach(System.out::println);

	}

}
