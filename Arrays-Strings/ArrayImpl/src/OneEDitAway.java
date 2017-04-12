package ArraysAndStrings;

public class OneEDitAway {
	public boolean checkEdits(String a, String b) {
		if (Math.abs(a.length() - b.length()) > 1)
			return false;

		if (a.length() == b.length())
			return checkForReplace(a, b);
		else if (a.length() + 1 == b.length())
			return checkForInsertDelete(b, a);
		else if (a.length() - 1 == b.length())
			return checkForInsertDelete(a, b);
		return true;
	}

	private boolean checkForInsertDelete(String a1, String b1) {
		// TODO Auto-generated method stub
		
		int index1 = 0;
		int index2 = 0;
		while (index1 < a1.length() && index2 < b1.length()) {
			if (a1.charAt(index1) != b1.charAt(index2)) {
				if (index1 != index2)
					return false;
				else
					index1++;
			} else {
				index1++;
				index2++;
			}
		}
		return true;
	}

	private boolean checkForReplace(String a1, String b1) {
		// TODO Auto-generated method stub
		boolean checkForRep = false;
		for (int i = 0; i < a1.length(); i++) {
			if (a1.charAt(i) != b1.charAt(i)) {
				if (checkForRep) {
					return false;
				}
				checkForRep = true;
			}
		}
		return true;
	}

	public static void main(String args[]) {
		OneEDitAway edit = new OneEDitAway();
		//System.out.println(edit.checkEdits("apple", "aple"));
		int i=50;
		System.out.println(String.valueOf(i).length());
	}

}
