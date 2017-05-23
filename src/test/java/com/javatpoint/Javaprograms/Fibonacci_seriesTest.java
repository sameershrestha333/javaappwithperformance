package com.javatpoint.Javaprograms;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class Fibonacci_seriesTest {
	private Fibonacci_series fibonacci_series;

	@Before
	public void setUp() throws Exception {
		fibonacci_series = new Fibonacci_series();
	}

	@Test
	public void test() {
		assertArrayEquals(new int[] { 0, 1, 1, 2, 3, 5, 8, 13, 21, 34 }, Fibonacci_series.findFibWithoutRecursion(10));
	}

}
