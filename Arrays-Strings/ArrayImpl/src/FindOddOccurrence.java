import java.util.HashMap;
import java.util.Set;

public class FindOddOccurrence {
	@SuppressWarnings("rawtypes")
	
	int getOddOccurrence(int ar[], int ar_size) 
	{
		int i;
		int res = 0;
		for (i = 0; i < ar_size; i++) 
		{
			res ^= ar[i];
		}
		return res;
	}
	
	public void printOddOccurrence(int[] inputArr) {
		HashMap<Integer, Integer> hs = new HashMap<Integer, Integer>();
		for (Integer c : inputArr) {
			if (hs.containsKey(c)) {
				hs.put(c, hs.get(c) + 1);
			} else {
				hs.put(c, 1);
			}
		}
		Set<Integer> key = hs.keySet();
		for (Integer c1 : key) {
			/*if (hs.get(c1) % 2 != 0 && hs.get(c1) != 1)*/
				System.out.println("Number " + c1 + " has count " + hs.get(c1));
		}
	}

	public static void main(String args[]) {
		FindOddOccurrence occ = new FindOddOccurrence();
		int[] inputArr = { 3,3,7,7,10,11,11 };
		//occ.printOddOccurrence(inputArr);
		System.out.println(occ.getOddOccurrence(inputArr, inputArr.length));
		Integer a=5;
		int b=10;
		a=b;
		
		
	}

}
