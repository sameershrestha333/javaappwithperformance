package com.java.lesson.one.cgd;

public class CGD {

	public int findCGD(int m, int n) {

		if (n == 0)
			return m;
		else
			return findCGD(n, m % n);

	}

	public static void main(String[] args) {
		CGD obj1 = new CGD();
		double startTime = System.currentTimeMillis();
		System.out.println(startTime);
		System.out.println("The CGD is :" + obj1.findCGD(8, 12));
		double diff = System.currentTimeMillis() - startTime;
		System.out.println("Time taken: " + diff+ "Milis");
	}
}
