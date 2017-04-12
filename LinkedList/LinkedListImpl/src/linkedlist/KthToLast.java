package linkedlist;

public class KthToLast {
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

	// wrapper
	public int recursiveSoln(int k) {
		return recursiveSoln(head, k);
	}

	public int recursiveSoln(Node head, int k) {
		if (head == null)
			return 0;
		int index = recursiveSoln(head.next, k) + 1;
		if (index == k)
			System.out.println(k + "th to last node is " + head.data);
		return index;
	}

	public int findkThToLast(int k) throws Exception {
		Node fastPtr = head;
		Node slowPtr = head;
		int tempK = 0;
		while (tempK < k) {
			if (fastPtr == null)
				throw new Exception("Out of bounds");
			tempK++;
			fastPtr = fastPtr.next;
		}
		while (fastPtr != null) {
			fastPtr = fastPtr.next;
			slowPtr = slowPtr.next;
		}
		return slowPtr.data;
	}

}
