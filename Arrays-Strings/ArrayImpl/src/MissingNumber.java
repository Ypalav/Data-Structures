public class MissingNumber {
	public int findNum(int[] inputArr) {
		int result1 = inputArr[0];
		int result2 = 0;
		int n = inputArr[inputArr.length - 1];
		for (int i = 1; i <= inputArr.length - 1; i++) {
			result1 = result1 ^ inputArr[i];
		}
		for (int i = 1; i <= n; i++) {
			result2 = result2 ^ i;
		}
		return result1 ^ result2;
	}

	public static void main(String args[]) {
		MissingNumber number = new MissingNumber();
		int inputArr[] = {  1, 2, 4, 5, 6, 7, 8, 9, 10 };
		System.out.println(number.findNum(inputArr));
	}
}
