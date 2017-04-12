package ArraysAndStrings;

/**
 * @author Yogesh
 * 
 */
public class URLify {

	public void urlify(String inpStr, int trueLength) {
		char[] charArr = inpStr.toCharArray();
		int spaces = 0;
		for (int i = 0; i < trueLength - 1; i++) {
			if (charArr[i] == ' ') {
				spaces++;
			}
		}

		int newIndex = trueLength + (spaces * 2);
		charArr[newIndex] = '\0';
		newIndex -= 1;
		for (int i = trueLength - 1; i >= 0; i--) {
			if (charArr[i] == ' ') {
				charArr[newIndex--] = '0';
				charArr[newIndex--] = '2';
				charArr[newIndex--] = '%';
			} else {
				charArr[newIndex--] = charArr[i];
			}
		}

		System.out.println(new String(charArr));
	}

	public static void main(String args[]) {
		URLify url = new URLify();
		url.urlify("Mr John Smith         ", 13);
	}

}
