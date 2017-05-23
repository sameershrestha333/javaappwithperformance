package com.conceptoftheday.collections;

import java.util.PriorityQueue;

public class EmployeeTest {

	public static void main(String[] args) {

		MyComparator comparator = new MyComparator();
		PriorityQueue<Employee> pQueue = new PriorityQueue<>(comparator);
		pQueue.offer(new Employee("AAA", 15));

		pQueue.offer(new Employee("BBB", 12));

		pQueue.offer(new Employee("CCC", 75));

		pQueue.offer(new Employee("DDD", 175));

		pQueue.offer(new Employee("EEE", 215));

		pQueue.offer(new Employee("FFF", 29));

		pQueue.offer(new Employee("GGG", 143));
		// System.out.println(pQueue);
		// pQueue.forEach(System.out::print);
		
		System.out.println(pQueue.poll()); // Output --> CCC : 7500

		System.out.println(pQueue.poll()); // Output --> BBB : 12000

		System.out.println(pQueue.poll()); // Output --> GGG : 14300

		System.out.println(pQueue.poll()); // Output --> AAA : 15000

		System.out.println(pQueue.poll()); // Output --> DDD : 17500

		System.out.println(pQueue.poll()); // Output --> EEE : 21500

		System.out.println(pQueue.poll());
	}

}
