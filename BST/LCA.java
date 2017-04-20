package binarysearchtrees;

public class LCA {
	BSTNode root;

	public BSTNode findLCA(BSTNode node, BSTNode node1, BSTNode node2) {
		if (node == null)
			return null;
		if (node == node1 || node == node2)
			return node;
		else if (Math.max(node1.getData(), node2.getData()) < node.getData())
			return findLCA(node.getLeft(), node1, node2);
		else if (Math.min(node1.getData(), node2.getData()) > node.getData())
			return findLCA(node.getRight(), node1, node2);
		else
			return node;
	}
}
