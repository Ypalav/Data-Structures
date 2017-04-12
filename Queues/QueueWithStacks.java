package stacks;

import java.util.Stack;

//implement queue using 2 stacks
public class QueueWithStacks {
	private Stack<Integer> stack1 = new Stack<Integer>();// Initialize these in
															// constructor
	private Stack<Integer> stack2 = new Stack<Integer>();

	// enqueue
	public void enqueue(int val) {
		stack1.push(val);
	}

	public int dequeue() {
		shiftStacks();
		return stack2.pop();
	}

	public int peek() {
		shiftStacks();
		return stack2.peek();
	}

	// Helper function
	public void shiftStacks() {
		if (stack2.isEmpty()) {
			while (!stack1.isEmpty()) {
				stack2.push(stack1.pop());
			}
		}
	}

}
