package com.yogesh.practice;

import java.util.Arrays;

public class AnagramString {
	public boolean isAnagram(String input1, String input2) {
		if (input1.length() != input2.length())
			return false;
		char[] charToWord = input1.toLowerCase().toCharArray();
		char[] charToWord2 = input2.toLowerCase().toCharArray();
		Arrays.sort(charToWord);
		Arrays.sort(charToWord2);
		return Arrays.equals(charToWord, charToWord2);
	}
}
