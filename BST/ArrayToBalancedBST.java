package binarysearchtrees;

public class ArrayToBalancedBST {
	BSTNode root;

	public BSTNode arrayToBalancedBST(int[] inpArr, int startIndex, int endIndex) {
		BSTNode newNode;
		if (startIndex > endIndex)
			return null;
		int mid = startIndex + (endIndex - startIndex) / 2;
		newNode = new BSTNode(inpArr[mid]);
		newNode.setLeft(arrayToBalancedBST(inpArr, startIndex, mid - 1));
		newNode.setRight(arrayToBalancedBST(inpArr, mid + 1, endIndex));
		return newNode;
	}
}
