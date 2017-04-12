package com.yogesh.practice;

import static org.junit.Assert.*;

import org.junit.Test;

public class SumOfDigitsTest {

	@Test
	public void test() {
		SumOfDigits sum = new SumOfDigits();
		
		assertEquals(6, sum.sumOfDigits(123));
	}

}
