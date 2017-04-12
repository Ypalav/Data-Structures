package linkedlist;

import java.util.HashSet;

public class RemoveDuplicates {
	private Node head;

	private class Node {
		int data;
		Node next;

		public Node(int data) {
			this.data = data;
			next = null;
		}
	}

	public void insertAtEnd(int data) {
		Node node = new Node(data);
		Node currentNode = head;
		while (currentNode.next != null) {
			currentNode = currentNode.next;
		}
		currentNode.next = node;
		node.next = null;
	}

	public void removeDups(Node head) {
		HashSet<Node> set = new HashSet<Node>();
		Node currentHead = head;
		set.add(currentHead);
		while (currentHead != null) {
			if (!set.contains(currentHead)) {
				set.add(currentHead);
				currentHead = currentHead.next;
			} else {
				currentHead = currentHead.next.next;
			}
		}
	}
}
