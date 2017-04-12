public class DuplicatesInArr {
	public void findDup(int[] arr) {
		int result=0;
		for (int i = 0; i < arr.length; i++) {
			if (arr[Math.abs(arr[i])] >= 0)
				arr[Math.abs(arr[i])] = -arr[Math.abs(arr[i])];
			else
				result=Math.abs(arr[i]);
				//System.out.println(Math.abs(arr[i]));
		}
		System.out.println(result);
	}

	public static void main(String args[]) {
		DuplicatesInArr arr = new DuplicatesInArr();
		int inpArr[] = { 3, 4, 1, 4, 1 };
		arr.findDup(inpArr);
	}

}
