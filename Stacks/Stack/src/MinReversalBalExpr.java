import java.util.Stack;

public class MinReversalBalExpr {
	public int calcMinReversals(String str) {
		if (str.length() % 2 != 0)
			return -1;
		Stack<Character> stack = new Stack<Character>();
		for (int i = 0; i < str.length(); i++) {
			if (str.charAt(i) == '}' && !stack.isEmpty()) {
				if (stack.peek() == '{')
					stack.pop();
				else
					stack.push(str.charAt(i));
			} else {
				stack.push(str.charAt(i));
			}
		}
		int stack_size = stack.size();
		int n = 0;
		while (!stack.isEmpty() && stack.peek() == '{') {
			stack.pop();
			n++;
		}

		return stack_size / 2 + n % 2;
	}
	
	
	
}
