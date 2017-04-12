package linkedlist;

public class DeleteMiddleNode {
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
		if (head == null)
			head = node;
		Node currentNode = head;
		while (currentNode.next != null) {
			currentNode = currentNode.next;
		}
		currentNode.next = node;
		node.next = null;
	}

	public void deleteMiddleNode(Node middle) throws Exception {
		if (middle == null || middle.next == null)
			throw new Exception();
		Node next = middle.next;
		middle.data = next.data;
		middle.next = next.next;
	}

}
