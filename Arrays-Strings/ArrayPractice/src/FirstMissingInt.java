import java.util.ArrayList;

public class FirstMissingInt {
	public int firstMissingInt(ArrayList<Integer> a) {
		int len = a.size();
		int i = 0;
		while (i < len) {
			if (a.get(i) != i + 1 && a.get(i) >= 1 && a.get(i) <= len
					&& a.get(a.get(i) - 1) != a.get(i)) {
				int temp = a.get(a.get(i) - 1);
				a.set(a.get(i) - 1, a.get(i));
				a.set(i, temp);
			} else {
				i++;
			}
		}

		for (int j = 0; j < a.size(); j++) {
			if (a.get(j) != j + 1)
				return j + 1;
		}

		return a.size() + 1;
	}

	public static void main(String[] args) {
		FirstMissingInt int1 = new FirstMissingInt();
		ArrayList<Integer> A = new ArrayList<Integer>();
		A.add(-8);
		A.add(-7);
		A.add(-6);
		//A.add(1);
		System.out.println(int1.firstMissingInt(A));
	}

}
