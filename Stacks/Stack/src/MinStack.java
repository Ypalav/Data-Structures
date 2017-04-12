package stacks;

public class MinStack {
	private Node head;

	private class Node {
		Node next;
		int data;
	}

	public boolean isEmpty() {
		return head == null;
	}

	public void push(int data) {
		Node newNode = new Node();
		newNode.data = data;
		if (head == null)
			head = newNode;
		newNode.next = head;
		head = newNode;
	}

	public int pop() throws Exception {
		if (isEmpty())
			throw new Exception("Is Empty");
		Node val = head;
		head = head.next;
		return val.data;
	}

	public int peek() throws Exception {
		if (isEmpty())
			throw new Exception("Is empty");
		Node node = head;
		return node.data;
	}

}
