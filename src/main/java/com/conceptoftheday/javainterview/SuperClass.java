package com.conceptoftheday.javainterview;

class SuperClass {
	public SuperClass() {
		
		System.out.println("Super Class Constructor");
	}
}

class SubClass extends SuperClass {
	public SubClass() {
		
		System.out.println("Sub Class Constructor");
	}

	void method() {
		//this(); // Compile time error

		//super(); // Compile time error
	}
}
