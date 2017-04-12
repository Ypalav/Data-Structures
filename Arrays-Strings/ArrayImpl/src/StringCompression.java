package ArraysAndStrings;

public class StringCompression {
	public void strCompr(String inpStr) {
		StringBuilder str = new StringBuilder();
		int compCount = 0;
		int compPriorLen = 3;
		if (compPriorLen * 2 < inpStr.length()) {
			for (int i = 0; i < inpStr.length(); i++) {
				
				compCount++;
				if (i + 1 >= inpStr.length()
						|| inpStr.charAt(i) != inpStr.charAt(i + 1)) {
					str.append(inpStr.charAt(i));
					str.append(compCount);
					compCount = 0;
				}
			}

			System.out.println(str);
		} else {
			System.out.println(inpStr);
		}
	}

	private int findComprPriorLen(String inpStr) {
		// TODO Auto-generated method stub
		
		return 0;
	}

	public static void main(String args[]) {
		StringCompression compre = new StringCompression();
		compre.strCompr("aabc");
	}
}
