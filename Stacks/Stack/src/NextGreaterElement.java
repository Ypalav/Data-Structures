import java.util.Stack;

public class NextGreaterElement {

	public void nextGreaterElem(int[] inputArr) {
		int newResultArr[] = new int[inputArr.length];
		for (int i = 0; i < newResultArr.length; i++) {
			newResultArr[i] = -1;
		}
		for (int i = 0; i < inputArr.length; i++) {
			for (int j = i + 1; j < inputArr.length; j++) {
				if (inputArr[i] < inputArr[j]) {
					newResultArr[i] = inputArr[j];
					break;
				}
			}

		}
		for (int i = 0; i < newResultArr.length; i++) {
			System.out.println(newResultArr[i]);
		}
	}

	// using stacks
	public void nextGreater(int[] inputArr) {
		Stack<Integer> stack = new Stack<Integer>();
		int element = 0, next = 0;
		stack.push(inputArr[0]);
		for (int i = 1; i < inputArr.length; i++) {
			next = inputArr[i];
			if (!stack.isEmpty()) {
				element = stack.pop();
				while (element < next) {
					System.out.println(element + "===" + next);
					if (stack.isEmpty())
						break;
					element = stack.pop();
				}

				if (element > next)
					stack.push(element);
			}
			stack.push(next);
		}
		
		while(!stack.isEmpty()){
			element=stack.pop();
			System.out.println(element + "===" + -1);
		}
	}

	public static void main(String args[]) {
		NextGreaterElement nextGreaterElement = new NextGreaterElement();
		int arr[] = { 13, 7, 6, 12 };
		nextGreaterElement.nextGreaterElem(arr);
		nextGreaterElement.nextGreater(arr);
	}
}
