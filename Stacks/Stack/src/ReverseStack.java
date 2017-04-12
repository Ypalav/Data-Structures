import java.util.Stack;

public class ReverseStack {

	// Using recursion
	public void reverseStack(Stack<Integer> newStack, Stack<Integer> stack) {
		if (newStack.isEmpty()) {
			System.out.println();
			printStack(stack);
			return;
		}
		int val=newStack.pop();
		System.out.println(val);
		stack.push(val);
		reverseStack(newStack, stack);
	}

	private void printStack(Stack<Integer> stack) {
		// TODO Auto-generated method stub
		if(stack.isEmpty())
			return;
		System.out.println(stack.pop());
		printStack(stack);
	}

	public static void main(String args[]) {
		Stack<Integer> newStack = new Stack<Integer>();
		Stack<Integer> stack = new Stack<Integer>();
		newStack.push(2);
		newStack.push(9);
		newStack.push(11);
		newStack.push(21);
		ReverseStack reverseStack = new ReverseStack();
		reverseStack.reverseStack(newStack, stack);
	}

}
