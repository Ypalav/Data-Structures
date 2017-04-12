import java.util.Random;

public class ShuffleArr {
	public int[] shufleArr(int[] inptArr) {
		Random random = new Random();
		int index, temp;
		for (int i = inptArr.length - 1; i > 0; i--) {
			index = random.nextInt(i + 1);
			temp = inptArr[index];
			inptArr[index] = inptArr[i];
			inptArr[i] = temp;
		}
		return inptArr;
	}

	public static void main(String args[]) {
		ShuffleArr sArr = new ShuffleArr();
		int[] inpArr = { 2, 3, 6, 77, 4, 5 };
		int[] resultArr = sArr.shufleArr(inpArr);
		for (int i = 0; i < resultArr.length; i++) {
			System.out.println(resultArr[i]);
		}
	}
}
