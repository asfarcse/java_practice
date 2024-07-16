package SerialiazationAndDeserialization;

import java.io.Serializable;
import java.util.Objects;

public class Student implements Serializable,Cloneable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private int id;
	private String name;
	private String email;
	private String demo;
	transient private String address;
	public String hii;
	
	public Student(int id, String name, String email,String address) {
		super();
		this.id = id;
		this.name = name;
		this.email = email;
		this.address = address;
	}
	
	public Student() {
		
	}

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

//	public String getEmail() {
//		return email;
//	}
//
//	public void setEmail(String email) {
//		this.email = email;
//	}
	
	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}
	
	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name +  "]";
	}

	public void printObject() {
		System.out.println(this.id);
		System.out.println(this.name);
//		System.out.println(this.email);
		System.out.println(this.address);
	}
	
	@Override
	protected Object clone() throws CloneNotSupportedException {
		return super.clone();
	}
	
	
//	
//	@Override
//	public boolean equals(Object obj) {
//		if (this == obj)
//			return true;
//		if (obj == null)
//			return false;
//		if (getClass() != obj.getClass())
//			return false;
//		Student other = (Student) obj;
//		return Objects.equals(email, other.email) && id == other.id && Objects.equals(name, other.name);
//	}

//	@Override
//	public int hashCode() {
//		return Objects.hash(email, id, name);
//	}
	
	
}
