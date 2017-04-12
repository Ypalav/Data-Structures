import java.util.HashMap;

public class DuplicateWithinKDist {
	public boolean findDuplicates(int arr[], int k) {
		HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
		int flag = 0;
		for (int i = 0; i < arr.length; i++) {
			if (!map.containsKey(arr[i])) {
				map.put(arr[i], i);
			} else {
				if (i - map.get(arr[i]) == k) {
					return true;
				}
			}
		}

		return false;
	}

	public static void main(String args[]) {
		DuplicateWithinKDist dup = new DuplicateWithinKDist();
		int[] inpArr = { 1, 2, 3, 1, 4, 5 };
		System.out.println(dup.findDuplicates(inpArr, 3));
	}
}
