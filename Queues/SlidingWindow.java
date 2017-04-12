import java.util.ArrayList;
import java.util.Deque;
import java.util.LinkedList;
import java.util.List;

public class SlidingWindow {
	public int[] maxSlidingWindow(int[] nums, int k) {
		if (nums == null || nums.length == 0)
			return new int[0];

		int[] result = new int[nums.length - k + 1];

		Deque<Integer> deque = new LinkedList<Integer>();
		for (int i = 0; i < nums.length; i++) {
			if (!deque.isEmpty() && deque.peekFirst() == i - k)
				deque.poll();

			while (!deque.isEmpty() && nums[deque.peekLast()] < nums[i]) {
				deque.removeLast();
			}

			deque.offer(i);

			if (i + 1 >= k)
				result[i + 1 - k] = nums[deque.peek()];
		}

		return result;
	}

	public ArrayList<Integer> slidingMaximum(final List<Integer> a, int b) {
		if (a == null || a.size() == 0) {
			ArrayList<Integer> result = new ArrayList<Integer>();
			result.add(0);
			return result;
		}

		if (a.size() == 1) {
			ArrayList<Integer> result = new ArrayList<Integer>();
			result.add(a.get(0));
			return result;
		}
		ArrayList<Integer> result = new ArrayList<Integer>(a.size() - b + 1);
		Deque<Integer> d = new LinkedList<Integer>();
		for (int i = 0; i < a.size(); i++) {
			if (!d.isEmpty() && d.peekFirst() == i - b)
				d.poll();

			while (!d.isEmpty() && a.get(d.peekLast()) < a.get(i))
				d.removeLast();

			if (i + 1 >= b)
				result.add(i + 1 - b, a.get(d.peek()));
		}
		return result;
	}

	public static void main(String args[]) {
		int arr[] = { 12, 1, 78, 90, 57, 89, 56 };
		SlidingWindow window = new SlidingWindow();
		int[] resultArr = window.maxSlidingWindow(arr, 3);
		for (int i = 0; i < resultArr.length; i++) {
			System.out.println(resultArr[i]);
		}
		ArrayList<Integer> inp = new ArrayList<Integer>();
		inp.add(12);
		inp.add(1);
		inp.add(78);
		inp.add(90);
		inp.add(57);
		inp.add(89);
		inp.add(56);

		window.slidingMaximum(inp, 3);
	}

}
