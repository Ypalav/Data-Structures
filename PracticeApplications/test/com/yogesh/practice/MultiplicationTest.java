package com.yogesh.practice;

import static org.junit.Assert.*;

import org.junit.Test;

public class MultiplicationTest {

	@Test(expected = IllegalArgumentException.class)
	public void testExceptionIsThrown() {
		Multiplication tester = new Multiplication();
		tester.multiply(1000, 5);
	}

	@Test
	public void test() {
		Multiplication tester = new Multiplication();
		assertEquals("10 x 5 must be 50", 50, tester.multiply(10, 5));
	}

}
