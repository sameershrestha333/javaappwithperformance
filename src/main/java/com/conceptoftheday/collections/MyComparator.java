package com.conceptoftheday.collections;

import java.util.Comparator;

public class MyComparator implements Comparator<Employee> {

	@Override
	public int compare(Employee e1, Employee e2) {
		return e1.salary - e2.salary;
		// decending
		//return e2.salary - e1.salary;
	}
}
