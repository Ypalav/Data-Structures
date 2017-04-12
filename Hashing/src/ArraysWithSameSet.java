import java.util.HashMap;

public class ArraysWithSameSet {
	public void checkIfArraysHaveSameSetOfElements(int[] arr1, int[] arr2) {
		HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
		for (int i = 0; i < arr1.length; i++) {
			if (!map.containsKey(arr1[i])) {
				map.put(arr1[i], 1);
			} else {
				map.put(arr1[i], map.get(arr1[i]) + 1);
			}
		}

		for (int i = 0; i < arr2.length; i++) {
			if (map.containsKey(arr2[i])) {
				map.put(arr2[i], map.get(arr1[i]) - 1);
			} else {
				System.out.println("Both Arrays are not same");
				break;
			}
		}
		int flag = 0;
		for (int i = 0; i < arr1.length; i++) {
			if (map.get(arr1[i]) > 0) {
				flag = 1;
			}
		}

		if (flag == 0)
			System.out.println("Both Arrays are same");
		else
			System.out.println("Both Arrays are not same");

	}

	public static void main(String args[]) {
		ArraysWithSameSet set = new ArraysWithSameSet();
		int[] arr1 = { 2, 5, 6, 8, 10, 2, 2 };
		int[] arr2 = { 2, 5, 2, 8, 10, 2, 6 };
		set.checkIfArraysHaveSameSetOfElements(arr1, arr2);
	}
}
