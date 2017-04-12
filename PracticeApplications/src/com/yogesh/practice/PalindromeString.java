package com.yogesh.practice;

public class PalindromeString {
	public boolean isPalindrome(String inpString) {
		if (inpString.length() == 0 || inpString == null)
			throw new IllegalArgumentException("String is empty or null");
		for (int i = 0; i < inpString.length() / 2; i++) {
			if (inpString.charAt(i) != inpString.charAt(inpString.length() - 1
					- i))
				return false;
		}
		return true;
	}
}
