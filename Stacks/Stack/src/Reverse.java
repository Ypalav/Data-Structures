package stacks;

public class Reverse {
	public int[] reverse(int[] inpArr) {
		ResizingArrayStack<Integer> stack = new ResizingArrayStack<Integer>();
		for (int i = 0; i < inpArr.length; i++) {
			stack.push(inpArr[i]);
		}
		int j = 0;
		while (!stack.isEmpty()) {
			inpArr[j] = stack.pop();
			j++; 
		}
		return inpArr;
	}
}
