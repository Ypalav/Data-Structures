package trees;

import stacks.ResizeArrayQueue;

public class MinDepth {
	BinaryTreeNode root;

	public int minDepthRecursive(BinaryTreeNode node) {
		if (node == null)
			return 0;
		if (node.getLeft() == null)
			return 1 + minDepthRecursive(node.getRight());
		if (node.getRight() == null)
			return 1 + minDepthRecursive(node.getLeft());
		return 1 + Math.min(minDepthRecursive(node.getLeft()),
				minDepthRecursive(node.getRight()));
	}

	public int minDepthIterative(BinaryTreeNode node) {
		ResizeArrayQueue<BinaryTreeNode> queue = new ResizeArrayQueue<BinaryTreeNode>();
		queue.enqueue(node);
		queue.enqueue(null);
		int count = 1;
		while (!queue.isEmpty()) {
			BinaryTreeNode tempNode = queue.dequeue();
			if (tempNode != null) {
				if (tempNode.getLeft() == null && tempNode.getRight() == null)
					return count;
				if (tempNode.getLeft() != null)
					queue.enqueue(tempNode.getLeft());
				if (tempNode.getRight() != null)
					queue.enqueue(tempNode.getRight());
			} else {
				if (!queue.isEmpty()) {
					count++;
					queue.enqueue(null);
				}
			}
		}
		return count;
	}
}
