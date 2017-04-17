package trees;

import static org.junit.Assert.*;

import org.junit.Test;

public class InorderNPreorderTest {

	@Test
	public void test() {
		InorderNPreorder max = new InorderNPreorder();
		/*
		 * max.root = new BinaryTreeNode(1, null, null); max.root.setLeft(new
		 * BinaryTreeNode(2, null, null)); max.root.setRight(new
		 * BinaryTreeNode(3, null, null)); max.root.getLeft().setLeft(new
		 * BinaryTreeNode(4, null, null)); max.root.getLeft().setRight(new
		 * BinaryTreeNode(5, null, null)); max.root.getLeft().getRight()
		 * .setLeft(new BinaryTreeNode(6, null, null));
		 */
		int[] preOrder = { 1, 2, 4, 5, 6, 3 };
		int[] inOrder = { 4, 2, 5, 6, 1, 3 };
		BinaryTreeNode node = max.buildTree(preOrder, inOrder);
		System.out.println(node);
		LevelOrder level = new LevelOrder();
		level.levelOrder(node);

	}
}
