package trees;

import stacks.ResizeArrayQueue;

public class SearchElement {
	BinaryTreeNode root;

	public boolean searchRecursive(BinaryTreeNode node, int key) {
		if (node == null)
			return false;
		if (node.getData() == key)
			return true;
		return searchRecursive(node.getLeft(), key)
				|| searchRecursive(node.getRight(), key);
	}

	public boolean searchIterative(BinaryTreeNode node, int key) {
		ResizeArrayQueue<BinaryTreeNode> queue = new ResizeArrayQueue<BinaryTreeNode>();
		queue.enqueue(node);
		while (!queue.isEmpty()) {
			BinaryTreeNode tempNode = queue.dequeue();
			if (tempNode != null) {
				if (tempNode.getData() == key)
					return true;
				if (tempNode.getLeft() != null)
					queue.enqueue(tempNode.getLeft());
				if (tempNode.getRight() != null)
					queue.enqueue(tempNode.getRight());
			}
		}
		return false;
	}

}
