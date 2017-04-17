package trees;

public class Ancestors {
	BinaryTreeNode root;

	public boolean printAncestors(BinaryTreeNode root, BinaryTreeNode node) {
		if (root == null)
			return false;
		if (root.getLeft() == node || root.getRight() == node
				|| printAncestors(root.getLeft(), node)
				|| printAncestors(root.getRight(), node)) {
			System.out.println(root.getData());
			return true;
		}
		return false;
	}
}
