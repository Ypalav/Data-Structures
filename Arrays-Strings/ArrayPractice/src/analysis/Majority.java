package analysis;

public class Majority {

	public int findMajority(int[] inputArr) {
		// call findCandidate which will return d max candidate element and pass
		// that to printmajority
		return 0;
	}

	public int printMajority() {
		// loop through the array, counting for the incoming element. if d count is gt than (array length)/2 return true
		return 0;
	}

	public int findCandidate(int[] inputArr) {
		int majorityIndex = 0;
		int count = 1;
		for (int i = 1; i < inputArr.length; i++) {
			if (inputArr[majorityIndex] == inputArr[i]) {
				count++;
			} else {
				count--;
			}
			if (count == 0) {
				majorityIndex = i;
				count = 1;
			}
		}
		return inputArr[majorityIndex];
	}
}
