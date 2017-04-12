package com.yogesh.practice;

import static org.junit.Assert.*;

import java.util.*;

import org.junit.Before;
import org.junit.Test;

public class PrimeFactorizationTest {

	private Set<Integer> setA;

	@Test
	public void testEmptyCollection() {
		assertTrue(setA.isEmpty());
	}

	@Test
	public void test() {
		PrimeFactorization facto = new PrimeFactorization();
		// assertEquals(expecteds, actuals);
		setA.add(5);
		setA.add(7);
		assertEquals(setA, facto.primeFactors(35));
	}

	@Before
	public void setUp() {
		setA = new LinkedHashSet<Integer>();
	}
}
