package com.yogesh.practice;

import static org.junit.Assert.*;

import org.junit.Test;

public class PalindromeTest {

	@Test(expected = IllegalArgumentException.class)
	public void integerLessThanZeroException() {
		Palindrome p = new Palindrome();
		p.isPalindrome(-252);
	}

	@Test
	public void test() {
		Palindrome p = new Palindrome();
		/*assertTrue(p.isPalindrome(121));
		assertTrue(p.isPalindrome(1221));
		assertTrue(p.isPalindrome(12321));
		assertFalse(p.isPalindrome(1321));*/
		assert (p.isPalindrome(121) == true);
	}

}
