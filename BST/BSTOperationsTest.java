package binarysearchtrees;

import static org.junit.Assert.*;

import org.junit.Test;

import trees.BinaryTreeNode;
import trees.HeightOfTree;

public class BSTOperationsTest {

	@Test
	public void test() {
		BSTOperations bst = new BSTOperations();
		bst.root = new BSTNode(4);
		int[] inpArr = { 2, 8, 1, 3, 5, 10, 0, 7, 6 };
		for (int i = 0; i < inpArr.length; i++) {
			bst.insertRecursive(bst.root, inpArr[i]);
		}
		BSTNode min1 = bst.searchMinIterative(bst.root);
		BSTNode min2 = bst.searchMinRecursive(bst.root);
		assertEquals(0, min1.getData());
		assertEquals(0, min2.getData());

		BSTNode max1 = bst.searchMaxIterative(bst.root);
		BSTNode max2 = bst.searchMaxRecursive(bst.root);
		assertEquals(10, max1.getData());
		assertEquals(10, max2.getData());

		assertFalse(bst.searchIterative(bst.root, 15));
		assertFalse(bst.searchRecursive(bst.root, 15));

		// assertFalse(bst.searchIterative(bst.delete(bst.root, 8), 8));
		// assertFalse(bst.searchRecursive(bst.delete(bst.root, 8), 8));

		bst.findPredSucc(bst.root, null, null, 8);
	}
}
