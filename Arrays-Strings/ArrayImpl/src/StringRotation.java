package ArraysAndStrings;

public class StringRotation {
	public boolean checkForRotation(String str1, String str2) {
		int len = str1.length();
		String result = "";
		if (len == str2.length() && len > 0) {
			result = str1 + str1;
			return result.contains(str2);
		}

		return false;
	}

	public static void main(String args[]) {
		StringRotation rot = new StringRotation();
		System.out.println(rot.checkForRotation("waterbottle", "erbottlewat"));
	}
}
