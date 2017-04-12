package com.yogesh.practice;

import static org.junit.Assert.*;

import org.junit.Test;

public class PalindromeStringTest {

	/*@Test(expected = NullPointerException.class)
	public void nullCheck() {
		PalindromeString str = new PalindromeString();
		fail(str.isPalindrome(null));
	}
*/
	@Test(expected = IllegalArgumentException.class)
	public void stringEmptyExceptionIsThrown() {
		PalindromeString str = new PalindromeString();
		str.isPalindrome("");
	}

	@Test
	public void test() {
		PalindromeString str = new PalindromeString();
		assertTrue(str.isPalindrome("madam"));
		assertTrue(str.isPalindrome("m"));
		assertFalse(str.isPalindrome("momo"));
		assertFalse(str.isPalindrome("momo"));
		assertTrue(str.isPalindrome("abcdcba"));
		assertTrue(str.isPalindrome("abcdcba"));
	}

}
