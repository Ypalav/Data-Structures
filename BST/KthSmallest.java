package binarysearchtrees;

public class KthSmallest {
	BSTNode root;

	public BSTNode kthSmallest(BSTNode node, int k, int count) {
		if (node == null)
			return null;
		BSTNode left = kthSmallest(node.getLeft(), k, count);
		if (left != null)
			return left;
		if (++count == k)
			return node;
		return kthSmallest(node.getRight(), k, count);
	}
}
