package com.yogesh.practice;

public class Palindrome {

	public boolean isPalindrome(int number) {
		if (number < 0)
			throw new IllegalArgumentException("number " + number);
		int newNumber = 0;
		int tempNumber = number;
		while (tempNumber > 0) {
			newNumber = newNumber * 10 + tempNumber % 10;
			tempNumber = tempNumber / 10;
		}

		return newNumber == number;
	}
}
