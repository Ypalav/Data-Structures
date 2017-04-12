import java.util.ArrayList;
import java.util.List;

public class MaxSubArray {
	// kadane's algo
	public int findMax(int[] inputArr) {
		int max_so_far = 0;
		int max_here = 0;
		int[] resultArr = new int[inputArr.length];
		for (int i = 0; i < inputArr.length; i++) {
			max_here = max_here + inputArr[i];
			if (max_here < 0) {
				max_here = 0;
				resultArr = new int[inputArr.length];
			} else if (max_so_far < max_here) {
				max_so_far = max_here;
				resultArr[i] = inputArr[i];
			}

		}
		return max_so_far;
	}

	public int findMaxDP(int[] inputArr) {
		int max_so_far = inputArr[0];
		int curr_max = 0;
		for (int i = 1; i < inputArr.length; i++) {
			curr_max = Math.max(inputArr[i], curr_max + inputArr[i]);
			max_so_far = Math.max(max_so_far, curr_max);
		}
		return max_so_far;
	}

	public int maxSubArray(final List<Integer> a) {
		int max_so_far = a.get(0);
		int curr_max = 0;
		for (int i = 1; i < a.size(); i++) {
			curr_max = Math.max(a.get(i), curr_max + a.get(i));
			max_so_far = Math.max(curr_max, max_so_far);
		}
		return max_so_far;
	}

	public ArrayList<Integer> maxset(ArrayList<Integer> a) {
		int max_so_far = 0;
		int max_here = 0;
		ArrayList<Integer> resultArr = new ArrayList<Integer>();
		for (int i = 0; i < a.size(); i++) {
			max_here = max_here + a.get(i);
			if (max_here < 0) {
				max_here = 0;
				resultArr = new ArrayList<Integer>();
			} else if (max_so_far <= max_here) {
				max_so_far = max_here;
				resultArr.add(a.get(i));
			}
		}
		return resultArr;
	}

	public static void main(String args[]) {
		MaxSubArray arr = new MaxSubArray();
		int[] inputArr = { 0, 0, -1, 0 };
		ArrayList<Integer> inp = new ArrayList<Integer>();
		inp.add(0);
		inp.add(0);
		inp.add(-1);
		inp.add(0);
		System.out.println(arr.maxset(inp));
		System.out.println(arr.findMax(inputArr));
		System.out.println(arr.findMaxDP(inputArr));
	}

}
