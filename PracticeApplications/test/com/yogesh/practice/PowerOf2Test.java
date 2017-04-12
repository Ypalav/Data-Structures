package com.yogesh.practice;

import static org.junit.Assert.*;

import org.junit.Test;

public class PowerOf2Test {

	@Test(expected = IllegalArgumentException.class)
	public void integerLessThanZeroException() {
		PowerOf2 p2 = new PowerOf2();
		p2.isPowerOf2(-29);
	}

	@Test
	public void test() {
		PowerOf2 p2 = new PowerOf2();
		assertTrue(p2.isPowerOf2(2));
		assertFalse(p2.isPowerOf2(6));
		assertTrue(p2.isPowerOf2(32));
	}

}
