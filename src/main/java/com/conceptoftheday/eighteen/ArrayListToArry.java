package com.conceptoftheday.eighteen;

import java.util.ArrayList;

public class ArrayListToArry {

	public static void main(String[] args) {
		ArrayList<String> list = new ArrayList<String>();

		list.add("JAVA");

		list.add("J2EE");

		list.add("JSP");

		list.add("SERVLETS");

		list.add("STRUTS");

		System.out.println(list);
		Object[] charStr = list.toArray();
		for(Object s:charStr){
			System.out.print(s+", ");
		}
	}

}
