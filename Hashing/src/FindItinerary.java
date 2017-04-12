import java.util.HashMap;
import java.util.Map;

public class FindItinerary {
	public void findItinerary(HashMap<String, String> map) {
		HashMap<String, String> reverseMap = new HashMap<String, String>();
		for (Map.Entry<String, String> entry : map.entrySet()) {
			reverseMap.put(entry.getValue(), entry.getKey());
		}

		String start = null;

		for (Map.Entry<String, String> entry : map.entrySet()) {
			if (!reverseMap.containsKey(entry.getKey())) {
				start = entry.getKey();
				break;
			}
		}

		if (start == null)
			System.out.println("Invalid Input");

		String to = map.get(start);
		while (to != null) {
			System.out.println(start + " --->" + to);
			start = to;
			to = map.get(to);
		}

	}

	public static void main(String args[]) {
		FindItinerary find = new FindItinerary();
		HashMap<String, String> dataSet = new HashMap<String, String>();
		dataSet.put("Chennai", "Banglore");
		dataSet.put("Bombay", "Delhi");
		dataSet.put("Goa", "Chennai");
		dataSet.put("Delhi", "Goa");

		find.findItinerary(dataSet);
	}

}
