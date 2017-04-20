package binarysearchtrees;

public class IsBalanced {
	BSTNode root;

	public boolean checkIsBalancedWrapper(BSTNode node) {
		return checkisBalanced(node) != Integer.MIN_VALUE;
	}

	private int checkisBalanced(BSTNode node) {
		// TODO Auto-generated method stub
		if (node == null)
			return -1;
		int leftHeight = checkisBalanced(node.getLeft());
		if (leftHeight == Integer.MIN_VALUE)
			return Integer.MIN_VALUE;

		int rightHeight = checkisBalanced(node.getRight());
		if (rightHeight == Integer.MIN_VALUE)
			return Integer.MIN_VALUE;

		int heightDiff = leftHeight - rightHeight;

		if (Math.abs(heightDiff) > 1) {
			return Integer.MIN_VALUE;
		} else {
			return Math.max(leftHeight, rightHeight) + 1;
		}
	}
}
