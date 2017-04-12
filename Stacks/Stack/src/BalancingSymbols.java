import java.util.Stack;

public class BalancingSymbols {

	public boolean isSymbolValid(String inputPattern) {
		Stack<Character> stack = new Stack<Character>();
		if (inputPattern == null || inputPattern.length() == 0)
			return true;

		for (int i = 0; i < inputPattern.length(); i++) {
			if (inputPattern.charAt(i) == ')') {
				if (!stack.isEmpty() && stack.peek() == '(')
					stack.pop();
				else
					return false;
			} else if (inputPattern.charAt(i) == '}') {
				if (!stack.isEmpty() && stack.peek() == '{')
					stack.pop();
				else
					return false;
			} else if (inputPattern.charAt(i) == ']') {
				if (!stack.isEmpty() && stack.peek() == '[')
					stack.pop();
				else
					return false;
			} else {
				stack.push(inputPattern.charAt(i));
			}
		}

		if (stack.isEmpty())
			return true;
		else
			return false;
	}

	public static void main(String args[]) {
		BalancingSymbols bSymbols = new BalancingSymbols();
		System.out.println(bSymbols.isSymbolValid("[()]{}{[()()]()}"));
	}

}
