package trees;

import stacks.ResizeArrayQueue;

public class HeightOfTree {
	BinaryTreeNode root;

	public int maxHeight(BinaryTreeNode node) {
		if (node == null)
			return 0;
		int leftHeight = maxHeight(node.getLeft());
		int rightHeight = maxHeight(node.getRight());
		return (leftHeight > rightHeight) ? leftHeight + 1 : rightHeight + 1;
	}

	public int maxHeightIterative(BinaryTreeNode node) {
		ResizeArrayQueue<BinaryTreeNode> queue = new ResizeArrayQueue<BinaryTreeNode>();
		queue.enqueue(node);
		int nodeCount = 0;
		int height = 0;
		while (!queue.isEmpty()) {
			nodeCount = queue.size();
			if (nodeCount == 0)
				return height;
			height++;
			while (nodeCount > 0) {
				BinaryTreeNode tempNode = queue.peek();
				queue.dequeue();
				if (tempNode.getLeft() != null)
					queue.enqueue(tempNode.getLeft());
				if (tempNode.getRight() != null)
					queue.enqueue(tempNode.getRight());
				nodeCount--;
			}
		}
		return height;
	}

}
