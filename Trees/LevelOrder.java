package trees;

import stacks.ResizeArrayQueue;

public class LevelOrder {
	BinaryTreeNode root;

	public void levelOrder(BinaryTreeNode node) {
		ResizeArrayQueue<BinaryTreeNode> queue = new ResizeArrayQueue<BinaryTreeNode>();
		queue.enqueue(node);
		// queue.enqueue(null);
		while (!queue.isEmpty()) {
			BinaryTreeNode temp = queue.dequeue();
			System.out.println(temp.getData());
			BinaryTreeNode left = temp.getLeft();
			BinaryTreeNode right = temp.getRight();
			if (left != null) {
				queue.enqueue(left);
			}
			if (right != null) {
				queue.enqueue(right);
			}
		}
	}
	
	
}
