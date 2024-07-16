package SerialiazationAndDeserialization;

import java.util.HashSet;
import java.util.Set;

public class CloneStudentObject {
	public static void main(String[] args) throws CloneNotSupportedException {
		Student student = new Student(1,"asfar","asfarcse@gmail.com", "indore");
		Student studentClone = (Student)student.clone();
		student.setName("mohd asfar");
		System.out.println("real object::::"+student);
		System.out.println("clone object::::"+studentClone);
		
		
		System.out.println("===================================");
		
		Set<Student> set = new HashSet<>();
		set.add(new Student(1,"asfar","asfarcse@gmail.com", "indore"));
		set.add(new Student(1,"asfar","asfarcse@gmail.com", "indore"));
		set.add(new Student(2,"moazzam","moazzam@gmail.com", "hyd"));
		
		System.out.println(set);
	}
}
