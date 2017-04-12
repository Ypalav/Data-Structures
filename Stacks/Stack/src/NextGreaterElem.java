import java.util.Stack;

public class NextGreaterElem {
	public void nextGreater(int[] inpArr) {
		Stack<Integer> stack = new Stack<Integer>();
		stack.push(inpArr[0]);
		for (int i = 1; i < inpArr.length; i++) {
			int next = inpArr[i];
			if (!stack.isEmpty()) {
				int element = stack.pop();

				while (element > next) {
					System.out.println("Next greater to " + element + " is "
							+ next);
					if (stack.isEmpty())
						break;
					element = stack.pop();
				}

				if (element < next)
					stack.push(element);
			}
			stack.push(next);
		}

		while (!stack.isEmpty()) {
			System.out.println("Next greater to " + stack.pop() + " is " + -1);
		}
	}
	
	public static void main(String args[]){
		NextGreaterElem elem = new NextGreaterElem();
		int arr[]= {4, 5, 2, 10};
		elem.nextGreater(arr);
	}
	
}
