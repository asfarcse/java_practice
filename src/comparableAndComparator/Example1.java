package comparableAndComparator;

import java.util.ArrayList;
import java.util.Collections;

public class Example1 {
	public static void main(String[] args) {
		ArrayList<Employee> emps = new ArrayList<>();
		emps.add(new Employee("asfar","8960102014",12));
		emps.add(new Employee("moazzam","11111111",11));
		emps.add(new Employee("mehdi","22222222",10));
		
		System.out.println(emps);
		Collections.sort(emps);   
		//comparable
		System.out.println(emps);
		
		//Comparator
		System.out.println("**********************************");
		ArrayList<Student> student = new ArrayList<>();
		student.add(new Student("asfar","8960102014",12));
		student.add(new Student("moazzam","11111111",11));
		student.add(new Student("mehdi","22222222",10));
		
		System.out.println(student);
		Collections.sort(student,new rollNumberComparator());
		System.out.println(student);
		
	}
}
