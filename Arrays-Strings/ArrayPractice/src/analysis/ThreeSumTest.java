package analysis;

import static org.junit.Assert.*;

import org.junit.Test;

public class ThreeSumTest {

	@Test
	public void testCountZeroes() {
		ThreeSum sum = new ThreeSum();
		int input[] = { 30, -40, -20, -10, 40, 0, 10, 5 };
		/* assertEquals(4, ); */
		System.out.println(sum.countZeroes(input));
	}
}
