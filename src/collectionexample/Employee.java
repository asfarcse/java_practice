package collectionexample;

import java.util.HashMap;
import java.util.Map;

public class Employee {
	private int id;
	private String name;
	
	public Employee(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}
	
	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + "]";
	}



	public static void main(String[] args) {
		Employee emp1 = new Employee(1, "asfar");
		Employee emp2 = new Employee(2, "moazzam");
		Employee emp3 = new Employee(3, "mehdi");
		
		Map<Employee, String> map = new HashMap<>();
		map.put(emp1, "FSD");
		map.put(emp2, "DATA_ENG");
		map.put(emp3, "ANGULAR_DEV");
		System.out.println(map);
		System.out.println(map.get(emp1));
	}
	
	
}
