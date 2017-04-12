public class FindUnionIntersection {
	public void findUnion(int[] arr1, int[] arr2) {
		int arr1Len = arr1.length;
		int arr2Len = arr2.length;
		int i = 0, j = 0;

		while (i < arr1Len && j < arr2Len) {
			if (arr1[i] > arr2[j]) {
				System.out.println(arr2[j++]);
			} else if (arr1[i] < arr2[j]) {
				System.out.println(arr1[i++]);
			} else {
				System.out.println(arr2[j++]);
				i++;
			}
		}

		while (i < arr1Len)
			System.out.println(arr1[i++]);
		while (j < arr2Len)
			System.out.println(arr2[j++]);
	}

	public void findIntersection(int[] arr1, int[] arr2) {
		int arr1Len = arr1.length;
		int arr2Len = arr2.length;
		int i = 0, j = 0;

		while (i < arr1Len && j < arr2Len) {
			if (arr1[i] < arr2[j])
				i++;
			else if (arr1[i] > arr2[j])
				j++;
			else {
				System.out.println(arr1[i++]);
				j++;
			}
		}
	}

	public static void main(String args[]) {
		FindUnionIntersection fUI = new FindUnionIntersection();
		int[] arr1 = { 1, 3, 4, 5, 7 };
		int[] arr2 = { 2, 3, 5, 6 };
		fUI.findUnion(arr1, arr2);
		System.out.println();
		fUI.findIntersection(arr1, arr2);
	}
}
