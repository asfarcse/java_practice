package Demo1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;

public class EmpMain {
	public static void main(String[] args) {
		List<Employee> empList =  new ArrayList<>();
		
		empList.add(new Employee(1,"asfar",null));
		empList.add(new Employee(2,"seema",null));
		
		Map<String, String> employeeSalaryMap = empList.stream()
	            .collect(Collectors.toMap(Employee::getName,ppp -> ppp.getSalary() == null ? "":ppp.getSalary()));
		System.out.println(employeeSalaryMap);
		employeeSalaryMap.entrySet();
		
		

	}
}
