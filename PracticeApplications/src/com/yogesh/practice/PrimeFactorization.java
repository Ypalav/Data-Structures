package com.yogesh.practice;

import java.util.HashSet;
import java.util.LinkedHashSet;

public class PrimeFactorization {
	public HashSet<Integer> primeFactors(int number) {
		
		HashSet<Integer> set = new LinkedHashSet<Integer>();
		int copyOfInput = number;
		for (int i = 2; i <= copyOfInput; i++) {
			if (copyOfInput % i == 0) {
				set.add(i);
				copyOfInput = copyOfInput / i;
				i--;
			}
		}
		return set;
	}
}
