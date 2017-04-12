import java.util.HashMap;

public class DuplicateChars {
	public void remDup(String inpString) {
		char[] strArr = inpString.toLowerCase().toCharArray();
		HashMap<Character, Integer> map = new HashMap<Character, Integer>();
		String outputStr = "";
		for (int i = 0; i < strArr.length; i++) {
			if (!map.containsKey(strArr[i])) {
				map.put(strArr[i], 1);
				outputStr += inpString.charAt(i);
			}
		}
		System.out.println(outputStr);
	}

	public static void main(String args[]) {
		DuplicateChars chars = new DuplicateChars();
		chars.remDup("Hello There");
	}
}
