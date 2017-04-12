package com.yogesh.practice;

public class PowerOf2 {
	public boolean isPowerOf2(int number) {
		if (number < 0)
			throw new IllegalArgumentException("number " + number);
		/*int i = 1;
		while (i <= number) {
			i = 2 * i;
			if (i == number)
				return true;
		}
		return false;*/
		
		return ((number & (number-1)) == 0);
	}
}
