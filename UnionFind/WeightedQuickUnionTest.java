package UnionFind;

import static org.junit.Assert.*;

import org.junit.Test;

public class WeightedQuickUnionTest {

	@Test
	public void test() {
		WeightedQuickUnion qUnion = new WeightedQuickUnion(10);
		qUnion.union(4, 3);
		qUnion.union(3, 8);
		qUnion.union(6, 5);
		qUnion.union(9, 4);
		qUnion.union(2, 1);
		qUnion.union(8, 9);
		qUnion.union(5, 0);	
		qUnion.union(7, 2);
		qUnion.union(6, 1);
		qUnion.union(1, 0);
		qUnion.union(6, 7);
		//assertTrue(qUnion.isConnected(5, 9));
	}
}
