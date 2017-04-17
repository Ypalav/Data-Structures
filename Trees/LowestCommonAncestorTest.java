package trees;

import static org.junit.Assert.*;

import org.junit.Test;

public class LowestCommonAncestorTest {

	@Test
	public void test() {
		LowestCommonAncestor max = new LowestCommonAncestor();
		max.root = new BinaryTreeNode(1, null, null);
		max.root.setLeft(new BinaryTreeNode(2, null, null));
		max.root.setRight(new BinaryTreeNode(3, null, null));
		max.root.getLeft().setLeft(new BinaryTreeNode(4, null, null));
		max.root.getLeft().setRight(new BinaryTreeNode(5, null, null));
		max.root.getLeft().getRight()
				.setRight(new BinaryTreeNode(6, null, null));
		BinaryTreeNode node = max.findLCA(max.root, max.root.getLeft()
				.getLeft(), max.root.getLeft().getRight().getRight());
		assertEquals(2, node.getData());
	}

}
