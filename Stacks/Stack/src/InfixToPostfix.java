import java.util.Stack;

public class InfixToPostfix {
	public String infixToPostfix(String input) {
		String result = "";
		Stack<Character> stack = new Stack<Character>();
		for (int i = 0; i < input.length(); i++) {
			if (isOperand(input.charAt(i))) {
				result += input.charAt(i);
			} else if (input.charAt(i) == ')') {
				while (!stack.isEmpty() && stack.peek() != '(') {
					result += stack.pop();
				}if(!stack.isEmpty() && stack.peek() != '(')
					return null;
				else
					stack.pop();
			} else if (input.charAt(i) == '(') {
				stack.push(input.charAt(i));
			} else {
				while (!stack.isEmpty()
						&& prec(input.charAt(i)) <= prec(stack.peek())) {
					result += stack.pop();
				}
				stack.push(input.charAt(i));
			}
		}

		while (!stack.isEmpty()) {
			result += stack.pop();
		}
		return result;
	}

	private int prec(char ch) {
		// TODO Auto-generated method stub
		switch (ch) {
		case '+':
		case '-':
			return 1;

		case '*':
		case '/':
			return 2;

		case '^':
			return 3;

		}
		return -1;
	}

	private boolean isOperand(char ch) {
		return (ch >= 'a' && ch <= 'z') || (ch >= 'A' && ch <= 'Z');
	}

	public static void main(String args[]) {
		InfixToPostfix infixToPostfix = new InfixToPostfix();
		System.out.println(infixToPostfix.infixToPostfix("A*B-(C+D)+E"));

	}
}
