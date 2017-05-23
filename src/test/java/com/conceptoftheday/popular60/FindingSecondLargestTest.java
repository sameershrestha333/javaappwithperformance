package com.conceptoftheday.popular60;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class FindingSecondLargestTest {
	private FindingSecondLargest findingSecondLargest;

	@Before
	public void setUp() throws Exception {
		new FindingSecondLargest();
	}

	@Test
	public void test() {
		int[] arr = { 47498, 14526, 74562, 42681, 75283, 45796 };
		int value = findingSecondLargest.giveSeondLargestElement(arr);
		assertEquals(value, 74562);
	}

}
