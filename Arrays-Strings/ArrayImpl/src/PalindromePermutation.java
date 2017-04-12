package ArraysAndStrings;

import java.util.HashMap;

public class PalindromePermutation {
	public boolean checkPalPerm(String str) {
		HashMap<Character, Integer> map = new HashMap<Character, Integer>();
		for (int i = 0; i < str.length(); i++) {
			if (str.charAt(i) != ' ' && !map.containsKey(str.charAt(i))) {
				map.put(str.charAt(i), 1);
			} else if (str.charAt(i) != ' ' && map.containsKey(str.charAt(i))) {
				map.put(str.charAt(i), map.get(str.charAt(i)) + 1);
			}
		}
		int count = 0;
		for (int i = 0; i < str.length(); i++) {
			if (str.charAt(i) != ' ' && map.get(str.charAt(i)) % 2 != 0) {
				count++;
			}
		}
		if (count > 1)
			return false;
		return true;
	}

	public static void main(String args[]) {
		PalindromePermutation perm = new PalindromePermutation();
		System.out.println(perm.checkPalPerm("cata gtoc"));
	}
}
