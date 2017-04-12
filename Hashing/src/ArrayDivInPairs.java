import java.util.HashMap;

public class ArrayDivInPairs {
	/*
	 * Input: arr[] = {92, 75, 65, 48, 45, 35}, k = 10 Output: True We can
	 * divide array into (92, 48), (75, 65) and (45, 35). Sum of all these pairs
	 * is a multiple of 10.
	 */
	public boolean canDivide(int[] inpArr, int k) {
		if (inpArr.length % 2 != 0)
			return false;
		HashMap<Integer, Integer> frequencyOfRemainders = new HashMap<Integer, Integer>();
		for (int i = 0; i < inpArr.length; i++) {
			if (!frequencyOfRemainders.containsKey(inpArr[i] % k))
				frequencyOfRemainders.put(inpArr[i] % k, 1);
			else {
				frequencyOfRemainders.put(inpArr[i] % k,
						frequencyOfRemainders.get(inpArr[i] % k) + 1);
			}
		}

		for (int i = 0; i < inpArr.length; ++i) {
			System.out.println(i);
			int rem = inpArr[i] % k;
			if (2 * rem == k) {
				if (frequencyOfRemainders.get(rem) % 2 != 0)
					return false;
			} else if (rem == 0) {
				if (frequencyOfRemainders.get(rem) % 2 != 0)
					return false;
			} else if (frequencyOfRemainders.get(rem) != frequencyOfRemainders
					.get(k - rem)) {
				return false;
			}

		}

		return true;
	}

	public static void main(String args[]) {
		ArrayDivInPairs pairs = new ArrayDivInPairs();
		int arr[] = { 9, 7, 5, 3 };
		int k = 6;
		System.out.println(pairs.canDivide(arr, k));
	}

}
