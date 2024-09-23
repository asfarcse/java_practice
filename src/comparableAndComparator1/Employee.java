package comparableAndComparator1;

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
	public Employee() {
		super();
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
	
	@Override
	public int compareTo(Employee emp) {
//		return this.getName().compareTo(emp.getName());
		if(emp.getId() == this.getId()) {
			return emp.getName().compareTo(this.getName());
		} else {
			return this.getId()-emp.getId();
		}
	}
	
	
	
	public static Comparator<Employee> nameComparator= new Comparator<Employee>() {

		@Override
		public int compare(Employee o1, Employee o2) {
			return o1.getName().compareTo(o2.getName());
		}
		
	};
	
	public static Comparator<Employee> idComparator= new Comparator<Employee>() {

		@Override
		public int compare(Employee o1, Employee o2) {
			return o1.getId() - o2.getId();
		}
		
	};
	
	
}
