import java.util.ArrayList;
import java.util.Stack;

public class NearestSmallest {

	public static void prevSmallerNumber(int[] a) {
		Stack<Integer> s = new Stack<Integer>();
		int popped = 0;

		for (int i = 0; i < a.length; i++) {
			while (!s.isEmpty() && s.peek() >= a[i]) {
				popped = s.pop();
			}
			if (s.isEmpty())
				System.out.print("-1, ");
			else
				System.out.print(s.peek() + ", ");
			s.push(a[i]);
		}
	}

	public static ArrayList<Integer> prevSmaller(ArrayList<Integer> arr) {
		Stack<Integer> s = new Stack<Integer>();
		int popped = 0;
		ArrayList<Integer> result = new ArrayList<Integer>(arr.size());
		for (int i = 0; i < arr.size(); i++) {
			while (!s.isEmpty() && s.peek() >= arr.get(i)) {
				popped = s.pop();
			}
			if (s.isEmpty())
				result.add(-1);
			else
				result.add(s.peek());
			s.push(arr.get(i));
		}
		return result;
	}

	public static void main(String[] args) {
		int[] a = { 3, 2, 1 };
		prevSmallerNumber(a);

		ArrayList<Integer> inp = new ArrayList<Integer>();
		inp.add(4);
		inp.add(5);
		inp.add(2);
		inp.add(10);
		prevSmaller(inp);
	}
}
