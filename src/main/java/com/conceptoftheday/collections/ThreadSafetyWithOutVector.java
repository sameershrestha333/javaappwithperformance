package com.conceptoftheday.collections;

import java.util.ArrayList;
import java.util.Collections;

public class ThreadSafetyWithOutVector {
	public static void main(String[] args) {
		ArrayList<Integer> list = new ArrayList<Integer>();
		Collections.synchronizedList(list);
		// It returns Synchronized list backed by original list.
	}
}
