import java.util.Stack;

public class LongestValidString {
	public int countValidExpression(String str) {
		int count = 0;
		Stack<Character> stack = new Stack<Character>();
		for (int i = 0; i < str.length(); i++) {
			if (str.charAt(i) == ')') {
				if (!stack.isEmpty() && stack.peek() == '(') {
					count++;
					stack.pop();
				}
			} else {
				stack.push(str.charAt(i));
			}
		}
		return count * 2;
	}

	public static void main(String args[]) {
		LongestValidString str = new LongestValidString();
		System.out.println(str.countValidExpression(")()())"));
		System.out.println(str.countValidExpression("()(()))())(())))"));
		System.out.println(str.countValidExpression(" "));
	}
}
