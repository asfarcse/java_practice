package streamAPI;

import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.function.Function;
import java.util.stream.Collectors;

class Employee {
	private int id;
	private String name;
	private int age;
	
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
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public Employee(int id, String name, int age) {
		super();
		this.id = id;
		this.name = name;
		this.age = age;
	}
	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", age=" + age + "]";
	}
	
	
}

public class GroupByExample {
	public static void main(String[] args) {
		List<Employee> empList = Arrays.asList(new Employee(1, "asfar", 30),
											   new Employee(2, "moazzam", 40),
											   new Employee(3, "mehdi", 30));
		
		Map<Integer, List<Employee>> collect = empList.stream().collect(Collectors.groupingBy(emp->emp.getAge()));
		System.out.println(collect);
		List<String> charList= Arrays.asList("apple".split("")); 
//		Map<Employee, Long> collect = empList.stream().collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));
//		System.out.println(collect);
		Map<String, Long> collect1 = charList.stream().collect(Collectors.groupingBy(Function.identity(),LinkedHashMap::new,Collectors.counting()));
		System.out.println(collect1);
	}
}
