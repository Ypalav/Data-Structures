import java.util.Stack;

public class SimpifyPath {

	public void simplifyPath(String a) {
		String result = "";
		String[] arr = a.split("/");
		Stack<String> stack = new Stack<String>();
		for (int i = 0; i < arr.length; i++) {
			
			stack.push(arr[i]);
		}
		String str = stack.peek();

		if (str.contains(".") && str.contains("."))
			result = "/";
		else
			result = "/" + stack.pop();
		System.out.println(result);
	}

	public void simplifyPath2(String a) {
		if (a.length() == 0 || a == null)
			return;
		Stack<String> stack = new Stack<String>();
		String result = "";
		for (int i = 0; i < a.length(); i++) {
			char c = a.charAt(i);
			if(c != '/' || c != '.')
				stack.push(Character.toString(c));
		}
		if (stack.peek() == "/") {
			String s = stack.pop();
		}
		while (stack.peek() != "/") {
			result = stack.pop() + result;
		}
		result = "/" + result;
		System.out.println(result);
	}

	public static void main(String args[]) {
		SimpifyPath path = new SimpifyPath();
		path.simplifyPath2("/./");
	}
}
