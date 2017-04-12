import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class FindEmployees {
	public int findEmp(HashMap<String, String> EmpMgrMap) {
		int count = 0;
		HashMap<String, List<String>> MgrEmpMap = new HashMap<String, List<String>>();
		HashMap<String, Integer> resultList = new HashMap<String, Integer>();
		for (Map.Entry<String, String> getMgrEmp : EmpMgrMap.entrySet()) {
			String emp = getMgrEmp.getKey();
			String mgr = getMgrEmp.getValue();
			if (!emp.equals(mgr)) {
				List<String> directReportList = MgrEmpMap.get(mgr);

				if (directReportList == null)
					directReportList = new ArrayList<String>();

				directReportList.add(emp);

				MgrEmpMap.put(mgr, directReportList);
			}
		}

		System.out.println(MgrEmpMap);
		return count;
	}

	public static void main(String args[]) {
		FindEmployees emp = new FindEmployees();
		HashMap<String, String> dataSet = new HashMap<String, String>();
		dataSet.put("A", "C");
		dataSet.put("B", "C");
		dataSet.put("C", "F");
		dataSet.put("D", "E");
		dataSet.put("E", "F");
		dataSet.put("F", "F");
		emp.findEmp(dataSet);
	}

}
