public class RotateArr {
	public int[] rotationOfArr(int[] inpArr, int d) {
		for (int i = 0; i < d; i++) {
			leftRotate(inpArr, d);
		}
		return inpArr;
	}

	private void leftRotate(int[] iArr, int d) {
		int temp = iArr[0];
		int i = 0;
		for (i = 0; i < iArr.length - 1; i++) {
			iArr[i] = iArr[i + 1];
		}
		iArr[i] = temp;
	}

	public static void main(String args[]) {
		RotateArr rArr = new RotateArr();
		int[] inputeArr = { 1, 2, 3, 4, 5, 6, 7 };
		int[] resultArr = rArr.rotationOfArr(inputeArr, 2);
		for (int i = 0; i < resultArr.length; i++) {
			System.out.println(resultArr[i]);
		}
	}
}
