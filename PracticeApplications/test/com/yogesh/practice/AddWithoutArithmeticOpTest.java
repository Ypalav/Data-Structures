package com.yogesh.practice;

import static org.junit.Assert.*;

import org.junit.Test;

public class AddWithoutArithmeticOpTest {

	@Test
	public void test() {
		AddWithoutArithmeticOp add = new AddWithoutArithmeticOp();
		assertEquals(10 + 15, add.adder(10, 15));
		assertEquals(-10 + 10, add.adder(-10, 10));
		/* assert() */
		/*String a = "abc";
		String b = a + "deal";
		String c = "abcdeal";
		System.out.println(b == c);*/
	}

}
