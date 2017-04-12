public class SearchElem {

	public int linearSearch(int[] inpArr, int searchElem) {
		for (int i = 0; i < inpArr.length; i++) {
			if (inpArr[i] == searchElem)
				return i;
		}
		return -1;
	}

	// recursive approach
	public int binarySearch(int[] inpArr, int l, int r, int searchElem) {
		if (r >= l) {
			int mid = (l + (r - l)) / 2;

			if (inpArr[mid] == searchElem)
				return mid;

			if (inpArr[mid] > searchElem)
				return binarySearch(inpArr, l, mid - 1, searchElem);
			else
				return binarySearch(inpArr, mid + 1, r, searchElem);
		}
		return -1;
	}

	public int binarySearchIterative(int[] inpArr, int l, int r, int searchElem) {
		while (r >= l) {
			int mid = (l + (r - l)) / 2;
			if (inpArr[mid] == searchElem)
				return mid;
			if (inpArr[mid] < searchElem)
				l = mid + 1;
			else
				r = mid - 1;
		}
		return -1;
	}

	public static void main(String args[]) {
		SearchElem elem = new SearchElem();
		int[] inpArr = { 2, 4, 8, 10, 40 };
		int n = inpArr.length;
		int searchElem = 4;
		// System.out.println(elem.linearSearch(inpArr, searchElem));
		// System.out.println(elem.binarySearch(inpArr, 0, n - 1, searchElem));
		System.out.println(elem.binarySearchIterative(inpArr, 0, n - 1,
				searchElem));
	}
}
