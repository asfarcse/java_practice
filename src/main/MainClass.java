package main;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class MainClass {
	
	public static void main(String[] args)  {
		List<Employee> empList = new ArrayList<>();
		Employee employee=new Employee(); 
		employee.setId(1);
		employee.setName("asfar");
		employee.setSalary(1000000);
		
		System.out.println(employee);
//		empList.add(new Employee(1, "asfar", 6000));
//		empList.add(new Employee(2, "mehdi", 7000));
//		empList.add(new Employee(3, "moazzam", 48000));
//		System.out.println(empList);
		
		for(Employee emp:empList) {
			System.out.println(emp.getName());
		}
		
//		empList = empList.stream().filter(e->e.getId()>2).collect(Collectors.toList());
//		System.out.println(empList);
	}
}

class Employee {
	Integer id;
	String name;
	double salary;
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	public Employee(Integer id, String name, double salary) {
		super();
		this.id = id;
		this.name = name;
		this.salary = salary;
	}
	
	
	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", salary=" + salary + "]";
	}
	
	
	
	
}
