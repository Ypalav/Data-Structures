package UnionFind;

import static org.junit.Assert.*;

import org.junit.Test;

public class QuickFindTest {

	@Test
	public void test() {
		QuickFind find = new QuickFind(10);
		assertFalse(find.isConnected(0, 5));
		find.union(0, 5);
		assertTrue(find.isConnected(0, 5));
		/*
		 * assertFalse(find.isConnected(0, 5)); assertFalse(find.isConnected(0,
		 * 5)); assertFalse(find.isConnected(0, 5));
		 */

	}

}
