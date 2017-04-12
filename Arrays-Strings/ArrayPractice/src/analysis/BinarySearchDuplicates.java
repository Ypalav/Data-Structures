package analysis;

public class BinarySearchDuplicates {
	public int searchWithDups(int[] inputArr, int key) {
		int low = 0;
		int high = inputArr.length - 1;
		while (low <= high) {
			int mid = low + (high - low) / 2;
			if (inputArr[mid] == key) {
				int index = findDuplicate(inputArr, mid);
				return index;
			} else if (inputArr[mid] > key)
				high = mid - 1;
			else
				low = mid + 1;
		}
		return -1;
	}

	private int findDuplicate(int[] inputArr, int mid) {
		// TODO Auto-generated method stub
		for (int i = 0; i < mid; i++) {
			if (inputArr[i] == inputArr[mid])
				return i;
		}
		return mid;
	}
}
