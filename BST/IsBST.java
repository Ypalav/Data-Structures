package binarysearchtrees;

public class IsBST {
	BSTNode root;

	public boolean isBST(BSTNode node) {
		return isBST(node, Integer.MIN_VALUE, Integer.MAX_VALUE);
	}

	private boolean isBST(BSTNode node, int minValue, int maxValue) {
		// TODO Auto-generated method stub
		if (node == null)
			return true;
		return node.getData() > minValue && node.getData() < maxValue
				&& isBST(node.getLeft(), minValue, node.getData())
				&& isBST(node.getRight(), node.getData(), maxValue);
	}
}
