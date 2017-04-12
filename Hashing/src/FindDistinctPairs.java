import java.util.HashMap;

public class FindDistinctPairs {
	public void findPairs(int[] inpArr) {
		HashMap<Integer, String> sumPairs = new HashMap<Integer, String>();
		int flag = 0;
		for (int i = 0; i < inpArr.length; i++) {
			for (int j = i + 1; j < inpArr.length; j++) {
				if (sumPairs.containsKey(inpArr[i] + inpArr[j])) {
					System.out.println("Pairs are:");
					System.out.println(sumPairs.get(inpArr[i] + inpArr[j])
							+ " & " + inpArr[i] + " + " + inpArr[j]);
					flag = 1;
					break;
				} else {
					sumPairs.put(inpArr[i] + inpArr[j], inpArr[i] + " + "
							+ inpArr[j]);
				}
			}
			if(flag==1)
				break;
		}
		if (flag == 0)
			System.out.println("No Pairs");
	}

	public static void main(String args[]) {
		int arr[] = { 3, 4, 7, 1, 2, 9, 8};
		FindDistinctPairs pairs = new FindDistinctPairs();
		pairs.findPairs(arr);
	}

}
