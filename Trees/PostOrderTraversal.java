package trees;

import stacks.ResizingArrayStack;

public class PostOrderTraversal {
	public void postOrderRecursive(BinaryTreeNode node) {
		postOrderRecursive(node.getLeft());
		postOrderRecursive(node.getRight());
		System.out.println(node.getData());
	}

	public void postOrderIterative(BinaryTreeNode node) {
		ResizingArrayStack<BinaryTreeNode> stack = new ResizingArrayStack<BinaryTreeNode>();
		stack.push(node);
		while (!stack.isEmpty()) {
			BinaryTreeNode temp = stack.peek();
			if (temp.getLeft() == null && temp.getRight() == null) {
				System.out.println(temp.getData());
			} else {
				BinaryTreeNode right = temp.getRight();
				BinaryTreeNode left = temp.getLeft();
				if (right != null) {
					stack.push(right);
					right = null;
				}
				if (left != null) {
					stack.push(left);
					left = null;
				}
			}
		}
	}
}
