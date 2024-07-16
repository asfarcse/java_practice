package codeDecode;

import java.util.Comparator;

public class Employee implements Comparable<Employee>{
	
	private int id;
	private String name;
	
	
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Employee(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}
	
	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + "]";
	}

	public int compareTo(Employee emp) {
		return this.id-emp.id;
	}
	
	public static Comparator<Employee> nameComparator = new Comparator<Employee>() {
		
		@Override
		public int compare(Employee e1, Employee e2) {
			return e1.getName().compareTo(e2.getName());
		}
	};
	
	public Employee(){
		
	}

	
	
	
	
	
}
