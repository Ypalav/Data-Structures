package trees;

public class InorderNPreorder {

	BinaryTreeNode root;

	public BinaryTreeNode buildTree(int[] preOrder, int[] inOrder) {
		if (preOrder == null || inOrder == null
				|| preOrder.length != inOrder.length)
			return null;
		return buildBTree(preOrder, 0, preOrder.length - 1, inOrder, 0,
				inOrder.length - 1);
	}

	private BinaryTreeNode buildBTree(int[] preOrder, int preStart, int preEnd,
			int[] inOrder, int inStart, int inEnd) {
		// TODO Auto-generated method stub
		if (preStart > preEnd || inStart > inEnd)
			return null;
		int data = preOrder[preStart];
		BinaryTreeNode node = new BinaryTreeNode(data, null, null);
		int offset = inStart;
		for (; offset < inEnd; offset++) {
			if (inOrder[offset] == data)
				break;
		}
		node.setLeft(buildBTree(preOrder, preStart + 1, preStart + offset
				- inStart, inOrder, inStart, offset - 1));
		node.setRight(buildBTree(preOrder, preStart + offset - inStart + 1,
				preEnd, inOrder, offset + 1, inEnd));
		return node;
	}
}
