import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map.Entry;
import java.util.Set;

public class SortByFreq {
	public int[] sortByHashing(int[] inputArr) {
		HashMap<Integer, Integer> hMap = new LinkedHashMap<Integer, Integer>();
		int count = 0;
		for (Integer c : inputArr) {
			if (hMap.containsKey(c)) {
				hMap.put(c, hMap.get(c) + 1);
			} else {
				hMap.put(c, 1);
			}
		}
		
		return inputArr;
	}
}
