package stacks;

import java.util.Stack;

public class SortStacks {
	private Stack<Integer> stack;

	public SortStacks() {
		stack = new Stack<Integer>();
	}

	public void push(int data) {
		stack.push(data);
	}

	public int pop() {
		return stack.pop();
	}

	public void printSortedStack() {
		Stack<Integer> sortedStack = sort(stack);
		while (!sortedStack.isEmpty())
			System.out.println(sortedStack.pop());
	}

	public Stack<Integer> sort(Stack<Integer> stack) {
		Stack<Integer> helperStack = new Stack<Integer>();
		while (!stack.isEmpty()) {
			Integer topVal = stack.pop();
			while (!helperStack.isEmpty() && helperStack.peek() > topVal) {
				stack.push(helperStack.pop());
			}
			helperStack.push(topVal); 
		}
		return helperStack;
	}

}
