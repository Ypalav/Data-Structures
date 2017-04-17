package analysis;

public class SearchInSortedRotatedArray {

	public int searchInRotatedArray(int[] inpArr, int key) {
		int lo = 0;
		int high = inpArr.length - 1;
		while (lo <= high) {
			int mid = (lo + high) / 2;
			if (inpArr[mid] == key)
				return mid;
			if (inpArr[mid] > inpArr[lo]) {
				if (key >= inpArr[lo] && key < inpArr[mid])
					high = mid - 1;
				else
					lo = mid + 1;
			} else if (inpArr[mid] < inpArr[high]) {
				if (key > inpArr[mid] && key <= inpArr[high])
					lo = mid + 1;
				else
					high = mid - 1;
			}
		}
		return -1;
	}
}
