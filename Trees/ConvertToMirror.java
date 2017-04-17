package trees;

public class ConvertToMirror {
	public BinaryTreeNode convertToMirror(BinaryTreeNode node) {
		if (node != null) {
			BinaryTreeNode left = convertToMirror(node.getLeft());
			BinaryTreeNode right = convertToMirror(node.getRight());
			int temp = left.getData();
			left.setData(right.getData());
			right.setData(temp);
		}
		return null;
	}
}
