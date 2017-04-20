package binarysearchtrees;

class Node {
	int nodeData;
	Node next;

	public Node(int nodeData) {
		this.nodeData = nodeData;
		next = null;
	}
}

public class LinkedListToBST {
	Node head;

	public BSTNode createBST(Node node) {
		int lengthOfList = getLength(node);
		return createBST(node, 0, lengthOfList - 1);
	}

	private BSTNode createBST(Node node, int start, int end) {
		// TODO Auto-generated method stub
		if (node == null)
			return null;
		int mid = start + (end - start) / 2;
		BSTNode left = createBST(node, start, mid - 1);
		BSTNode parent = new BSTNode(node.nodeData);
		parent.setLeft(left);
		node = node.next;
		parent.setRight(createBST(node, mid + 1, end));
		return parent;
	}

	private int getLength(Node node) {
		// TODO Auto-generated method stub
		int len = 0;
		while (node.next != null) {
			node = node.next;
			len++;
		}
		return len;
	}
}
