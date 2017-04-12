import java.util.HashMap;

public class FindLargestSubarrayWith0Sum {
	public int findArrLen(int arr[]) {
		int len = 0;
		int sum = 0;
		HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
		for (int i = 0; i < arr.length; i++) {
			sum += arr[i];
			if (!map.containsKey(sum)) {
				map.put(sum, i);
			} else {
				int newLen = i - map.get(sum);
				if (newLen > len)
					len = newLen;
			}
		}
		return len;
	}

	public static void main(String args[]) {
		FindLargestSubarrayWith0Sum sum = new FindLargestSubarrayWith0Sum();
		int arr[] = { 1, 0, 3 };
		System.out.println(sum.findArrLen(arr));
	}
}
