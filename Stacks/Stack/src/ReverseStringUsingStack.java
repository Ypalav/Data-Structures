import java.util.Stack;

public class ReverseStringUsingStack {

	public void reverse(String inputString) {
		Stack<Character> stack = new Stack<Character>();
		String result = "";
		for (int i = 0; i < inputString.length(); i++) {
			stack.push(inputString.charAt(i));
		}
		for (int i = 0; i < inputString.length(); i++) {
			result += stack.pop();
		}
		System.out.println(result);
	}

	// reverse without stack
	public void reverseWithoutStack(String inputString) {
		StringBuilder stringBuilder = new StringBuilder(inputString);
		System.out.println(stringBuilder.reverse());
	}

	// reverse charArray
	public void reverseWithChar(String inputString) {
		char newCharacter[] = inputString.toCharArray();
		for (int i = newCharacter.length - 1; i >= 0; i--) {
			System.out.print(newCharacter[i]);
		}

	}

	public String reverseString(String inputString) {
		String[] newArr = inputString.split("\\s+");
		for (int i = 0; i < newArr.length / 2; i++) {
			String temp = newArr[i];
			String temp2 = newArr[newArr.length - i - 1];
			newArr[i] = temp2.trim();
			newArr[newArr.length - i - 1] = temp.trim();
		}

		String returnStr = "";
		for (String str : newArr)
			returnStr = returnStr + " " + str;

		return returnStr.trim();
	}

	// with swap
	public String reverseWithSwap(String inputString) {
		char newCharacter[] = inputString.toCharArray();
		String result = "";
		int len = newCharacter.length;
		for (int i = 0; i < len / 2; i++) {
			char temp = newCharacter[i];
			newCharacter[i] = newCharacter[len - i - 1];
			newCharacter[len - i - 1] = temp;
		}

		for (char val : newCharacter) {
			result += val;
		}
		return result;
	}

	public static void main(String args[]) {
		ReverseStringUsingStack reverseStack = new ReverseStringUsingStack();
		// reverseStack.reverseWithoutStack("GeeksQuiz");
		// reverseStack.reverse("GeeksQuiz");
		// reverseStack.reverseWithChar("GeeksQuiz");
		// System.out.println(reverseStack.reverseWithSwap("GeeksQuiz"));

		String newString = reverseStack.reverseString("the      sky is blue");
		System.out.println(newString);

	}
}
