package trees;

import stacks.ResizingArrayStack;

public class PreOrder {
	public void preOrderRecursive(BinaryTreeNode node) {
		if (node != null) {
			System.out.println(node.getData());
			preOrderRecursive(node.getLeft());
			preOrderRecursive(node.getRight());
		}
	}

	public void preOrderIterative(BinaryTreeNode node) {
		ResizingArrayStack<BinaryTreeNode> stack = new ResizingArrayStack<BinaryTreeNode>();
		stack.push(node);
		while (!stack.isEmpty()) {
			BinaryTreeNode temp = stack.pop();
			System.out.println(temp.getData());
			BinaryTreeNode right = temp.getRight();
			BinaryTreeNode left = temp.getLeft();
			if (right != null) {
				stack.push(right);
			}
			if (left != null) {
				stack.push(left);
			}
		}
	}

}
