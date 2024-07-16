package comparableAndComparator;

public class Student {
	
	private String name;
	private String phone;
	private Integer rollNumber;
	
	
	
	public Student(String name, String phone, Integer rollNumber) {
		super();
		this.name = name;
		this.phone = phone;
		this.rollNumber = rollNumber;
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
	public Integer getRollNumber() {
		return rollNumber;
	}
	public void setRollNumber(Integer rollNumber) {
		this.rollNumber = rollNumber;
	}


	@Override
	public String toString() {
		return "Student [name=" + name + ", phone=" + phone + ", rollNumber=" + rollNumber + "]";
	}
	
	
	
}
