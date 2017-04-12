package analysis;

import static org.junit.Assert.*;

import org.junit.Test;

public class BinarySearchDuplicatesTest {

	@Test
	public void testSearchWithDups() {
		/* fail("Not yet implemented"); */
		BinarySearchDuplicates search = new BinarySearchDuplicates();
		int[] input = { 1, 2, 4, 4, 5, 6, 7, 7 };
		assertEquals(2, search.searchWithDups(input, 4));
		assertEquals(6, search.searchWithDups(input, 7));
		assertEquals(-1, search.searchWithDups(input, 3));
	}

}
