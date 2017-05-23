package com.conceptoftheday.popular60;

import java.util.Comparator;
import java.util.PriorityQueue;

class Employee {
	String name;

	int salary;

	// Constructor Of Employee

	public Employee(String name, int salary) {
		this.name = name;

		this.salary = salary;
	}

	@Override
	public String toString() {
		return name + " : " + salary;
	}
}

class myComparator implements Comparator<Employee> {
	@Override
	public int compare(Employee e1, Employee e2) {
		return e1.salary - e2.salary;
	}
}


