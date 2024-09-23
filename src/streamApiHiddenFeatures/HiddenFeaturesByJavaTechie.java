package streamApiHiddenFeatures;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

class Employee {
	private String name;
	private Integer salary;
	public Employee(String name, Integer salary) {
		super();
		this.name = name;
		this.salary = salary;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Integer getSalary() {
		return salary;
	}
	public void setSalary(Integer salary) {
		this.salary = salary;
	}
	
	
	
}

public class HiddenFeaturesByJavaTechie {
	public static void main(String[] args) {
		
		
		
		
		/**ofNullable(java9 feature)*/
//		List<String> nameList = Arrays.asList("mohd","asfar",null,"demo",null,"test");
//		nameList.stream().flatMap(Stream::ofNullable).collect(Collectors.toList());
		
		/**Stream.iterate()*/
		Stream.iterate(0, n->n+2).limit(5).forEach(System.out::println);
		
		/**Collectors.collectingAndThen*/
		List<Employee> empList = Arrays.asList(new Employee("asfar",50000),
											   new Employee("moazzam", 50000),
											   new Employee("mehdi",60000));
		
		//calculate avg salary and round up to nearest integer
		empList.stream()
			.mapToDouble(Employee::getSalary)
				.boxed()
					.collect(Collectors.collectingAndThen(null, null));
	}
}
