package com.conceptoftheday.collections;

import java.util.ArrayList;
import java.util.List;

public class ArrayListIteration {

	public static void main(String[] args) {
		List<String> list = new ArrayList<String>();

		list.add("FIRST");

		list.add("SECOND");

		list.add("THIRD");
		// normal for loop
		System.out.println("------------------- Normal For Loop--------------------");
		for(int i=0;i<list.size();i++){
				System.out.print(list.get(i)+",");
		}
		System.out.println("\n------------------- Enhaced For Loop--------------------");
		for(String str:list){
			System.out.print(str+",");
		}
		
	}
}
