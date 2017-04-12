package analysis;

import static org.junit.Assert.*;

import org.junit.Test;

public class BitonicArrayTest {

	@Test
	public void testFindVal() {
		BitonicArray bit = new BitonicArray();
		int[] inputArr = { 1, 2, 3, -4, -5, -6, -7 };
		assertTrue(bit.findVal(inputArr, 2));
		assertFalse(bit.findVal(inputArr, 2));
	}
}
