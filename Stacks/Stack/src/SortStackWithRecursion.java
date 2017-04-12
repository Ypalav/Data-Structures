import java.util.Stack;

public class SortStackWithRecursion {
	public void sort(Stack<Integer> newStack) {
		int temp = 0;
		if (!newStack.isEmpty()) {
			temp = newStack.pop();
			sort(newStack);
			sortedInsert(newStack, temp);
		}
	}

	private void sortedInsert(Stack<Integer> newStack, int temp) {
		// TODO Auto-generated method stub
		if (newStack.isEmpty() || temp > newStack.peek()) {
			newStack.push(temp);
		} else {
			int new_temp=0;
			new_temp = newStack.pop();
			sortedInsert(newStack, temp);
			newStack.push(new_temp);
		}
	}
	
	private void printStack(Stack<Integer> stack) {
		// TODO Auto-generated method stub
		if(stack.isEmpty())
			return;
		System.out.println(stack.pop());
		printStack(stack);
	}

	public static void main(String args[]) {
		SortStackWithRecursion sortStackWithRecursion = new SortStackWithRecursion();
		Stack<Integer> newStack = new Stack<Integer>();
		newStack.push(21);
		newStack.push(9);
		newStack.push(11);
		newStack.push(2);
		sortStackWithRecursion.sort(newStack);
	}
}
