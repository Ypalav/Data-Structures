package trees;

import stacks.ResizingArrayStack;

public class InOrder {
	public void inOrderRecursive(BinaryTreeNode node) {
		if (node != null) {
			inOrderRecursive(node.getLeft());
			System.out.println(node.getData());
			inOrderRecursive(node.getRight());
		}
	}

	public void inOrderIterative(BinaryTreeNode node) {
		ResizingArrayStack<BinaryTreeNode> stack = new ResizingArrayStack<BinaryTreeNode>();
		boolean done = false;
		BinaryTreeNode currentNode = node;
		while (!done) {
			if (currentNode != null) {
				stack.push(currentNode);
				currentNode = currentNode.getLeft();
			} else {
				if (stack.isEmpty())
					done = true;
				else {
					currentNode = stack.pop();
					System.out.println(currentNode.getData());
					currentNode = currentNode.getRight();
				}
			}
		}
	}
}
