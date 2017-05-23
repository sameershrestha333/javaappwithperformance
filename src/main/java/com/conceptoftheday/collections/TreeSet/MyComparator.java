package com.conceptoftheday.collections.TreeSet;

import java.util.Comparator;

public class MyComparator implements Comparator<Student> {

	@Override
	public int compare(Student o1, Student o2) {
		if (o1.id == o2.id) {
			return 0;
		} else {
			return o2.perc_Of_Marks_Obtained - o1.perc_Of_Marks_Obtained;

		}
	}

}
