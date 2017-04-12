import java.util.Arrays;

public class FindSumPairs {
	public void findSumPairs(int[] inpArr, int sumVal) {
		Arrays.sort(inpArr);
		int left = 0;
		int right = inpArr.length - 1;

		while (left < right) {
			int sum = inpArr[left] + inpArr[right];
			if (sum == sumVal) {
				System.out.println(inpArr[left] + " " + inpArr[right]);
				left = left + 1;
				right = right - 1;
			} else if (sum < sumVal)
				left = left + 1;
			else if (sum > sumVal)	
				right = right - 1;
		}
	}

	public static void main(String args[]) {
		FindSumPairs pairs = new FindSumPairs();
		int[] inpArr = { 2, 6, 3, 9, 11 };
		pairs.findSumPairs(inpArr, 9);
	}

}
