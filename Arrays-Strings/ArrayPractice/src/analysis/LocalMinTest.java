package analysis;

import static org.junit.Assert.*;

import org.junit.Test;

public class LocalMinTest {
	@Test
	public void testFindLocalMin() {
		LocalMin min = new LocalMin();
		int[] inpArr = { -1, -2, 4, 0, 5 };
		assertEquals(-2, min.findLocalMin(inpArr));
	}
}
 