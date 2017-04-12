public class MinMaxInArray {

	public void findMinMax(int[] inpArr) {
		int min = 0;
		int max = 0;

		if (inpArr.length == 1)
			System.out.println(inpArr[0]);

		if (inpArr[0] > inpArr[1]) {
			min = inpArr[1];
			max = inpArr[0];
		} else {
			min = inpArr[0];
			max = inpArr[1];
		}

		for (int i = 2; i < inpArr.length; i++) {
			if (inpArr[i] <= min)
				min = inpArr[i];
			else if (inpArr[i] >= max)
				max = inpArr[i];

		}
		System.out.println(min);
		System.out.println(max);
	}

	public static void main(String args[]) {
		MinMaxInArray mArray = new MinMaxInArray();
		int[] inpArr = { 1000, 11, 445, 1, 3300, 3000 };
		mArray.findMinMax(inpArr);
	}
}
