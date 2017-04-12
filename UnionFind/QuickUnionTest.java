package UnionFind;

import static org.junit.Assert.*;

import org.junit.Test;

public class QuickUnionTest {

	@Test
	public void test() {
		QuickUnion union = new QuickUnion(10);
		assertFalse(union.isConnected(2, 5));
		union.union(2, 5);
		assertTrue(union.isConnected(2, 5));
	}
}
