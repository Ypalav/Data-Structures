package trees;

import static org.junit.Assert.*;

import org.junit.Test;

public class MaxElementTest {

	@Test
	public void test() {
		MaxElement max = new MaxElement();
		max.root = new BinaryTreeNode(1, null, null);
		max.root.setLeft(new BinaryTreeNode(2, null, null));
		max.root.setRight(new BinaryTreeNode(3, null, null));
		max.root.getLeft().setLeft(new BinaryTreeNode(4, null, null));
		max.root.getLeft().setRight(new BinaryTreeNode(5, null, null));
		max.root.getLeft().getRight()
				.setLeft(new BinaryTreeNode(6, null, null));
		BinaryTreeNode node = max.findMaxRecursive(max.root);
		int node1 = max.findMaxIterative(max.root);
		assertEquals(6, node.getData());
		assertEquals(6, node1);
	}
}
