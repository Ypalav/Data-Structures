package analysis;

public class BitonicArray {
	public boolean findVal(int[] inputArr, int key) {
		/*int[] inputArr = { 1, 2, 3, -4, -5, -6, -7 };*/
		int low = 0;
		int high = inputArr.length - 1;
		while (low <= high) {
			int mid = low + (high - low) / 2;
			if (inputArr[mid] == key)
				return true;
			else {
				if ((inputArr[mid] > low && (key < inputArr[mid] && key > low))
						|| (inputArr[mid] < low && (key > inputArr[mid] && key > low)))
					high = mid - 1;
				else
					low = mid + 1;
			}
		}
		return false;
	}
}
