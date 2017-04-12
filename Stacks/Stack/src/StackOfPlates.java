package stacks;

import java.util.ArrayList;
import java.util.Stack;

public class StackOfPlates {
	private ArrayList<Stack<Integer>> stacks = new ArrayList<Stack<Integer>>();
	private int capacity = 3;

	public void push(int value) {
		Stack<Integer> lastStack = getLastStack();
		if (lastStack != null && lastStack.size() < capacity)
			lastStack.push(value);
		else {
			Stack<Integer> newStack = new Stack<Integer>();
			newStack.push(value);
			stacks.add(newStack);
		}
	}

	public Integer pop() {
		Stack<Integer> lastStack = getLastStack();
		if (lastStack != null) {
			Integer val = lastStack.pop();
			if (lastStack.isEmpty())
				stacks.remove(stacks.size() - 1);
			return val;
		}
		return null;
	}

	public Integer popAt(int index) {
		if (!stacks.isEmpty()) {
			Stack<Integer> currentStack = stacks.get(index);
			if (currentStack != null) {
				Integer val = currentStack.pop();
				return val;
			}
		}
		return null;
	}

	public Stack<Integer> getLastStack() {
		if (stacks.isEmpty())
			return null;
		else
			return stacks.get(stacks.size() - 1);
	}
}
