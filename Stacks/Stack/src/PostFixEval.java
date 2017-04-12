import java.util.ArrayList;
import java.util.Stack;

public class PostFixEval {
	public int evaluate(String input) {
		Stack<Integer> stack = new Stack<Integer>();
		// int result=0;
		for (int i = 0; i < input.length(); i++) {
			if (Character.isDigit(input.charAt(i))) {
				stack.push(Character.getNumericValue(input.charAt(i)));
			} else {
				int val1 = stack.pop();
				int val2 = stack.pop();
				switch (input.charAt(i)) {
				case '*':
					stack.push(val2 * val1);
					break;
				case '+':
					stack.push(val2 + val1);
					break;
				case '-':
					stack.push(val2 - val1);
					break;
				case '/':
					stack.push(val2 / val1);
					break;
				case '^':
					stack.push(val2 ^ val1);
					break;

				}
			}
		}
		return stack.pop();
	}

	public int evalRPN(ArrayList<String> a) {
		Stack<Integer> stack = new Stack<Integer>();
		for (int i = 0; i < a.size(); i++) {
			if (a.get(i) == "+") {
				int val1 = stack.pop();
				int val2 = stack.pop();
				stack.push(val1 + val2);
			} else if (a.get(i) == "-") {
				int val1 = stack.pop();
				int val2 = stack.pop();
				stack.push(val1 - val2);
			} else if (a.get(i) == "*") {
				int val1 = stack.pop();
				int val2 = stack.pop();
				stack.push(val1 * val2);
			} else if (a.get(i) == "/") {
				int val1 = stack.pop();
				int val2 = stack.pop();
				stack.push(val1 / val2);
			} else {
				stack.push(Integer.parseInt(a.get(i)));
			}
		}
		return stack.pop();
	}

	public static void main(String args[]) {
		PostFixEval postFixEval = new PostFixEval();
		System.out.println(postFixEval.evaluate("231*+9-"));
		ArrayList<String> a = new ArrayList<String>();
		/*a.add("5");
		a.add("1");
		a.add("2");
		a.add("+");*/
		a.add("4");
		a.add("13");
		a.add("5");
		a.add("/");
		a.add("+");

		System.out.println(postFixEval.evalRPN(a));

	}
}
