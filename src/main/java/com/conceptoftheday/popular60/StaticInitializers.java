package com.conceptoftheday.popular60;

import java.util.Vector;

class A {
	static int i = 10;

	static void method() {
		System.out.println("Static Method");
	}
}

class B extends A {
}

public class StaticInitializers {
	public static void main(String[] args) {
		B.method(); // Calling inherited static method

		System.out.println(B.i); // printing inherited static field.
	}
}
