package com.yogesh.practice;

public class PrimeNumbers {
	public void calcPrimes(int number) {
		if (number < 2)
			throw new IllegalArgumentException("number" + number);
		boolean[] isPrime = new boolean[number + 1];
		isPrime[0] = isPrime[1] = false;
		for (int i = 2; i < isPrime.length; i++) {
			isPrime[i] = true;
		}

		for (int i = 0; i < isPrime.length; i++) {
			if (isPrime[i]) {
				for (int j = i; i * j <= number; j++) {
					isPrime[i * j] = false;
				}
			}
		}

		for (int i = 0; i < isPrime.length; i++) {
			if (isPrime[i])
				System.out.println(i);
		}
	}
}
