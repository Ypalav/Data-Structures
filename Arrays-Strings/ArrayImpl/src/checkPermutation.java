package ArraysAndStrings;

public class checkPermutation {
	public boolean checkPerm(String a, String b) {
		if (a.length() != b.length())
			return false;
		int arr[] = new int[128];
		for (int i = 0; i < a.length(); i++) {
			arr[a.charAt(i)]++;
		}
		for (int i = 0; i < b.length(); i++) {
			arr[b.charAt(i)]--;
			if (arr[b.charAt(i)] < 0)
				return false;
		}

		return true;
	}

	public static void main(String args[]) {
		checkPermutation perm = new checkPermutation();
		System.out.println(perm.checkPerm("bcab", "abbb"));
	}

}
