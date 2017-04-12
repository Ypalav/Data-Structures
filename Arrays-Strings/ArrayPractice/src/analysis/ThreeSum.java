package analysis;

import java.util.Arrays;

public class ThreeSum {
	public int countZeroes(int[] inpArr) {
		int count = 0;
		Arrays.sort(inpArr);
		for (int i = 0; i < inpArr.length; i++) {
			for (int j = i + 1; j < inpArr.length; j++) {
				/*
				 * int val = Arrays.binarySearch(inpArr, -(inpArr[i] +
				 * inpArr[j]));
				 */
				int val = binarySearch(inpArr, -(inpArr[i] + inpArr[j]));
				if (val > j)
					count += 1;
			}
		}
		System.out.println(count);
		return count;
	}

	private int binarySearch(int[] inpArr, int key) {
		int low = 0;
		int high = inpArr.length - 1;
		while (low <= high) {
			int mid = low + (high - low) / 2;
			if (inpArr[mid] < key)
				low = mid + 1;
			else if (inpArr[mid] > key)
				high = mid - 1;
			else
				return mid;
		}

		return -1;
	}
}
