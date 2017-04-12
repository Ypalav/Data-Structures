import java.util.Stack;

public class RedundantBraces {
	public int checkForRedndBraces(String str) {
		Stack<Character> stack = new Stack<Character>();
		int count = 0;
		int c = 0;
		for (int i = 0; i < str.length(); i++) {
			if (str.charAt(i) == ')') {
				c = 0;
				while (stack.peek() != '(') {
					stack.pop();
					c++;
				}
				stack.pop();
				if (c < 2)
					return 1;
			} else {
				stack.push(str.charAt(i));
			}
		}
		boolean flag = true;
		while (stack.size() > 0) {
			if (stack.peek() == '(' || stack.peek() == ')') {
				flag = false;
				break;
			}
			stack.pop();
		}
		if (!flag)
			return 1;
		return 0;
	}

	public static void main(String args[]) {
		RedundantBraces braces = new RedundantBraces();
		System.out.println(braces.checkForRedndBraces("((a+b))"));
		System.out.println(braces.checkForRedndBraces("(a+(a+b))"));
		System.out.println(braces.checkForRedndBraces("(a*(a))"));
	}
}
