public class FindSum {
	public boolean checkSum(int[] inputArr, int k) {
		for (int i = 0; i < inputArr.length; i++) {
			if (k > inputArr[i]) {
				for (int j = i + 1; j < inputArr.length; j++)
					if (k > inputArr[j]) {
						if (k == inputArr[i] + inputArr[j])
							return true;
					}
			}
		}
		return false;
	}
	
	public static void main(String args[]){
		FindSum findSum = new FindSum();
		int[] inputArr={1, 4, 45, 6, 10, -8};
		System.out.println(findSum.checkSum(inputArr, 2));
	}
}
