package com.yogesh.practice;

import static org.junit.Assert.*;

import org.junit.Test;

public class PrimeNumberTest {

	@Test(expected = IllegalArgumentException.class)
	public void test() {
		PrimeNumbers pm = new PrimeNumbers();
		pm.calcPrimes(0);
		//pm.calcPrimes(1);
	}
}
