package ArraysAndStrings;

import java.util.HashMap;
import java.util.Map;

public class PalindromePerm {
	public boolean checkPermutation(String inpStr) {
		HashMap<Character, Integer> map = new HashMap<Character, Integer>();
		int count = 0;
		char[] chArr = inpStr.toCharArray();
		for (int i = 0; i < chArr.length; i++) {
			if (chArr[i] != ' ' && !map.containsKey(chArr[i]))
				map.put(chArr[i], 1);
			else
				map.put(chArr[i], map.get(chArr[i]) + 1);
		}

		for (Map.Entry<Character, Integer> m : map.entrySet()) {
			if (m.getValue() % 2 != 0) {
				count++;
				if (count > 1)
					return false;
			}
		}

		return true;
	}

	public static void main(String args[]) {
		PalindromePermutation perm = new PalindromePermutation();
		System.out.println(perm.checkPalPerm("tact ca"));
	}
}
