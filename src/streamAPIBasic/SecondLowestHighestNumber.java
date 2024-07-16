package streamAPIBasic;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;

class Employee1 {
	private String name;
	private Integer sal;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Integer getSal() {
		return sal;
	}
	public void setSal(Integer sal) {
		this.sal = sal;
	}
	public Employee1(String name, Integer sal) {
		super();
		this.name = name;
		this.sal = sal;
	}
	public Employee1() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Employee1 [name=" + name + ", sal=" + sal + "]";
	}
	
	
}

public class SecondLowestHighestNumber {
	public static void main(String[] args) {
		List<Integer> numList = Arrays.asList(2,3,4,5,6,1,665,34,20,55,90);
		
		//second highest number
		Optional<Integer> secondHighest = numList.stream().sorted(Collections.reverseOrder()).distinct().skip(1).findFirst();
		System.out.println("secondHighest::::::"+secondHighest.get());
		
		//second lowest number
		Optional<Integer> secondLowest = numList.stream().sorted().distinct().skip(1).findFirst();
		System.out.println("secondLowest::::"+secondLowest.get());
		
		List<Employee1> empList = Arrays.asList(new Employee1("asfar", 2000),
												new Employee1("moazzam", 1500),
												new Employee1("asfar", 1200),
												new Employee1("asfar", 100));
		//second highest number
		Employee1 secondHighestt = empList.stream().sorted(Collections.reverseOrder(Comparator.comparing(Employee1::getSal))).distinct().skip(1).findFirst().get();
		System.out.println("secondHighestt:::::::::"+secondHighestt);
		
		//second lowest number
		Employee1 secondLowestt = empList.stream().sorted(Comparator.comparing(Employee1::getSal)).distinct().skip(1).findFirst().get();
		System.out.println("secondLowestt::::::"+secondLowestt);
	}
}
