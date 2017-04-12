package ArraysAndStrings;

public class FindIsUnique {
	public boolean isUnique(String str) {
		int checker = 0;
		String lowercaseStr = str.toLowerCase();
		for (int i = 0; i < str.length(); i++) {
			int val = lowercaseStr.charAt(i) - 'a';
			if ((checker & (1 << val)) > 0)
				return false;
			checker |= (1 << val);
		}
		return true;
	}

	public static void main(String args[]) {
		FindIsUnique unique = new FindIsUnique();
		System.out.println(unique.isUnique("Hey Howdie!!"));
	}
}
