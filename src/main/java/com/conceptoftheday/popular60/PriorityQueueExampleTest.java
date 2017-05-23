package com.conceptoftheday.popular60;

import java.util.Comparator;
import java.util.PriorityQueue;

public class PriorityQueueExampleTest {
	public static void main(String[] args) {
		myComparator myComparator = new myComparator();

		// PriorityQueue<Employee> pQueue = new PriorityQueue<>(myComparator);
		PriorityQueue<Employee> pQueue = new PriorityQueue<>(new Comparator<Employee>() {

			@Override
			public int compare(Employee o1, Employee o2) {
				// TODO Auto-generated method stub
				// return o1.name - o2.name;
				return o1.name.compareTo(o2.name);
			}
		});
		pQueue.offer(new Employee("Sameer", 5));
		pQueue.offer(new Employee("Amir", 1));

		pQueue.offer(new Employee("Ram", 15));

		pQueue.offer(new Employee("Gita", 3));
		System.out.println(pQueue);

	}
}