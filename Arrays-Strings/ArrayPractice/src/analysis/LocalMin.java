package analysis;

public class LocalMin {
	public int findLocalMin(int[] inpArr) {
		int low = 0;
		int high = inpArr.length - 1;
		while (low <= high) {
			int mid = low + (high - low) / 2;
			if ((mid == 0 || inpArr[mid] < inpArr[mid - 1])
					&& (mid == inpArr.length - 1 || inpArr[mid] < inpArr[mid + 1])) {
				return inpArr[mid];
			} else if (mid > 0 && inpArr[mid] > inpArr[mid - 1]) {
				high = mid - 1;
			} else {
				low = mid + 1;
			}
		}
		return -1;
	}
}
