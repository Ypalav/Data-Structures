import java.util.Stack;

public class StockSpan {
	public void calcSpan(int[] arr) {
		Stack<Integer> stack = new Stack<Integer>();
		stack.push(0);
		int[] result = new int[arr.length];
		result[0]=1;
		for (int i = 1; i < arr.length; i++) {
			while (!stack.isEmpty() && arr[stack.peek()] <= arr[i]) {
				stack.pop();
			}
			result[i] = (stack.isEmpty() ? (i - 1) : (i - stack.peek()));
			stack.push(i);
		}
		for (int i = 0; i < result.length; i++)
			System.out.println(result[i]);
	}

	public static void main(String args[]) {
		StockSpan span = new StockSpan();
		int[] inpArr = { 100, 80, 60, 70, 60, 75, 85 };
		span.calcSpan(inpArr);
	}
}
