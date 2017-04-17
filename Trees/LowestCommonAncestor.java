package trees;

public class LowestCommonAncestor {
	BinaryTreeNode root;

	public BinaryTreeNode findLCA(BinaryTreeNode node, BinaryTreeNode nodeA,
			BinaryTreeNode nodeB) {
		if (node == null)
			return null;
		if (node == nodeA || node == nodeB)
			return node;
		BinaryTreeNode left = findLCA(node.getLeft(), nodeA, nodeB);
		BinaryTreeNode right = findLCA(node.getRight(), nodeA, nodeB);
		if (left != null && right != null)
			return node;
		if (left == null)
			return right;
		else
			return left;
	}
}
