package trees;

import stacks.ResizeArrayQueue;

public class MaxElement {
	BinaryTreeNode root;

	public BinaryTreeNode findMaxRecursive(BinaryTreeNode node) {
		int max = Integer.MIN_VALUE;
		if (node != null) {
			BinaryTreeNode leftMax = findMaxRecursive(node.getLeft());
			BinaryTreeNode rightMax = findMaxRecursive(node.getRight());
			if (leftMax.getData() > rightMax.getData())
				max = leftMax.getData();
			else
				max = rightMax.getData();
			if (node.getData() > max)
				max = node.getData();
		}
		return new BinaryTreeNode(max, null, null);
	}

	public int findMaxIterative(BinaryTreeNode node) {
		ResizeArrayQueue<BinaryTreeNode> queue = new ResizeArrayQueue<BinaryTreeNode>();
		queue.enqueue(node);
		int max = Integer.MIN_VALUE;
		while (!queue.isEmpty()) {
			BinaryTreeNode tempNode = queue.dequeue();
			if (tempNode != null) {
				if (max < tempNode.getData())
					max = tempNode.getData();
				if (tempNode.getLeft() != null)
					queue.enqueue(tempNode.getLeft());
				if (tempNode.getRight() != null)
					queue.enqueue(tempNode.getRight());
			}
		}
		return max;
	}

}
