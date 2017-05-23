package com.conceptoftheday.test;

class A {
	static void staticMethod() {
		System.out.println("Static Method");
	}
	 void noStaticMethod() {
		System.out.println("Static Method");
	}
}

public class MainClass1 {
	public static void main(String[] args) {
		A a = null;

		a.staticMethod();
		a.noStaticMethod();
	}
}
