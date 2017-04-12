package linkedlist;

public class PartitionList {
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
	public void partitionList(int x) {
		Node list = partitionList2(head, x);
		while (list != null) {
			System.out.println(list.data);
			list = list.next;
		}
	}

	public Node partitionList(Node a, int b) {
		if (a == null)
			return null;

		Node current = a;
		Node root = new Node(0);
		Node pivot = new Node(0);
		Node rootNext = root, pivotNext = pivot;

		while (current != null) {
			if (current.data >= b) {
				pivotNext.next = current;
				pivotNext = pivotNext.next;
			} else {
				rootNext.next = current;
				rootNext = rootNext.next;
			}
			current = current.next;
		}

		pivotNext.next = null;
		rootNext.next = pivot.next;

		return root.next;
	}

	public Node partitionList2(Node a, int b) {
		Node root = a;
		Node tail = a;
		while (a != null) {
			Node next = a.next;
			if (a.data < b) {
				a.next = root;
				root = a;
			} else {
				tail.next = a;
				tail = a;
			}
			a = next;
		}
		tail.next = null;
		return root;
	}

}
