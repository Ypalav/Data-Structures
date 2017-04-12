import java.util.HashMap;

public class FindSymmetricPairs {
	public void findSymmetricPairs(int[][] inpArr) {
		HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
		int flag = 0;
		for (int i = 0; i < inpArr.length; i++) {
			if (map.containsKey(inpArr[i][1])
					&& map.get(inpArr[i][1]) == inpArr[i][0]) {
				System.out.println("Pairs are:");
				System.out.println(inpArr[i][0] + " " + inpArr[i][1]);
				flag = 1;
			} else {
				map.put(inpArr[i][0], inpArr[i][1]);
			}
		}
		if (flag == 0)
			System.out.println("No Pairs found");
	}

	public static void main(String args[]) {
		FindSymmetricPairs pairs = new FindSymmetricPairs();
		int arr[][] = new int[5][2];
		arr[0][0] = 11;
		arr[0][1] = 20;
		arr[1][0] = 30;
		arr[1][1] = 40;
		arr[2][0] = 5;
		arr[2][1] = 10;
		arr[3][0] = 60;
		arr[3][1] = 90;
		arr[4][0] = 11;
		arr[4][1] = 5;
		pairs.findSymmetricPairs(arr);
	}
}
