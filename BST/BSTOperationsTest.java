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

		assertFalse(bst.searchIterative(bst.root, 15));
		assertFalse(bst.searchRecursive(bst.root, 15));

		// assertFalse(bst.searchIterative(bst.delete(bst.root, 8), 8));
		// assertFalse(bst.searchRecursive(bst.delete(bst.root, 8), 8));

		bst.findPredSucc(bst.root, null, null, 8);
		LCA lca = new LCA();
		lca.root = new BSTNode(4);
		for (int i = 0; i < inpArr.length; i++) {
			bst.insertRecursive(lca.root, inpArr[i]);
		}
		BSTNode lca1 = lca.findLCA(lca.root, lca.root.getRight().getLeft(),
				lca.root.getRight().getLeft().getRight().getLeft());
		System.out.println(lca1.getData());
		assertEquals(5, lca1.getData());

		IsBST isBst = new IsBST();
		isBst.root = new BSTNode(4);
		for (int i = 0; i < inpArr.length; i++) {
			bst.insertRecursive(isBst.root, inpArr[i]);
		}
		assertTrue(isBst.isBST(isBst.root));

		ArrayToBalancedBST balBST = new ArrayToBalancedBST();
		int[] sortedArr = { 0, 2, 4, 5, 6, 7, 8, 10 };
		BSTNode rootNode = balBST.arrayToBalancedBST(sortedArr, 0,
				sortedArr.length - 1);
		System.out.println(rootNode);

		ListOfDepths depths = new ListOfDepths();
		depths.root = new BSTNode(4);
		for (int i = 0; i < inpArr.length; i++) {
			bst.insertRecursive(depths.root, inpArr[i]);
		}
		depths.createListsWrapper(depths.root);

		IsBalanced balanced = new IsBalanced();
		int[] balancedArr = { 2, 8, 1, 3, 5, 10, 0, 7, 6 };
		balanced.root = new BSTNode(4);
		for (int i = 0; i < balancedArr.length; i++) {
			bst.insertRecursive(balanced.root, balancedArr[i]);
		}
		assertFalse(balanced.checkIsBalancedWrapper(balanced.root));
	}

}
