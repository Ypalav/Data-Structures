import java.util.Stack;

public class FindingSpan {

	public int[] span(int[] inputArray) {
		int[] spans = new int[inputArray.length];
		Stack<Integer> stack = new Stack<Integer>();
		int p = 0;
		for (int i = 0; i < inputArray.length; i++) {
			while (!stack.isEmpty() && inputArray[i] > inputArray[stack.peek()]) {
				stack.pop();
			}
			if (stack.isEmpty())
				p = -1;
			else
				p = stack.peek();
			spans[i] = i - p;
			stack.push(i);
		}
		return spans;
	}

	public static void main(String args[]) {
		FindingSpan findingSpan = new FindingSpan();
		int inputArray[] = {10, 4, 5, 90, 120, 80};
		int outputArr[]=findingSpan.span(inputArray);
		for(int val:outputArr){
			System.out.println(val);
		}
	}

}
