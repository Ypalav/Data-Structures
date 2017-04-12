package com.yogesh.practice;

import static org.junit.Assert.*;

import org.junit.Test;

public class AnagramStringTest {

	@Test
	public void test() {
		AnagramString anaStr = new AnagramString();
		assertTrue(anaStr.isAnagram("meat", "team"));
	}
}
