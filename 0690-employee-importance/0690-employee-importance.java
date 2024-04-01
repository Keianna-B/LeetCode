/*
// Definition for Employee.
class Employee {
    public int id;
    public int importance;
    public List<Integer> subordinates;
};
*/

class Solution {
    public int getImportance(List<Employee> employees, int id) {
        Map<Integer, Employee> employeeMap = new HashMap<>();
		
		for(Employee e : employees) {
			employeeMap.put(e.id, e);
		}
		return helper(employeeMap, id);
	}

	private static int helper(Map<Integer, Employee> employeeMap, int id) {
		int totalImportance = employeeMap.get(id).importance;
		
		for(int subId : employeeMap.get(id).subordinates) {
			totalImportance += helper(employeeMap, subId);
		}
		
		return totalImportance;
	}
}