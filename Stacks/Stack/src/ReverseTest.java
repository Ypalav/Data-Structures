package stacks;

import static org.junit.Assert.*;

import org.junit.Test;

public class ReverseTest {

	@Test
	public void testReverse() {
		Reverse rev = new Reverse();
		int resultArr[] = { 5, 4, 3, 2, 1 };
		int inputArr[] = { 1, 2, 3, 4, 5 };
		assertArrayEquals(resultArr, rev.reverse(inputArr));
	}
}
