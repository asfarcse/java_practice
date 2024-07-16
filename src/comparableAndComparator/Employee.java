package comparableAndComparator;

public class Employee implements Comparable<Employee>{
	
	private String name;
	private String phone;
	private Integer empId;
	
	@Override
	public int compareTo(Employee employee) {
		return this.empId-employee.empId;
	}
	
	public Employee(String name, String phone, Integer empId) {
		super();
		this.name = name;
		this.phone = phone;
		this.empId = empId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public Integer getEmpId() {
		return empId;
	}
	public void setEmpId(Integer empId) {
		this.empId = empId;
	}
	
	@Override
	public String toString() {
		return "Employee [name=" + name + ", phone=" + phone + ", empId=" + empId + "]";
	}
	
	
}
