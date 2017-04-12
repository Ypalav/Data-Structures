public class MissingNumber {
	// XOR approach
	public int findNum(int[] arr) {
		int result = arr[0];
		int result1 = arr[arr.length - 1];
		int temp = 0;
		for (int i = 1; i <= arr.length - 1; i++) {
			result = result ^ arr[i];
		}

		for (int i = 1; i <= result1; i++) {
			temp = temp ^ i;
		}
		return result ^ temp;
	}

	// n(n+1)/2
	public int findNumber(int[] arr) {
		int result = ((arr.length + 1) * (arr.length + 2)) / 2;
		int sum = 0;
		for (int i = 0; i < arr.length; i++) {
			sum += arr[i];
		}
		return result - sum;
	}

	public static void main(String args[]) {
		MissingNumber number = new MissingNumber();
		int[] inpArr = { -8, -7, -6 };
		System.out.println(number.findNum(inpArr));
		System.out.println(number.findNumber(inpArr));
	}
}
