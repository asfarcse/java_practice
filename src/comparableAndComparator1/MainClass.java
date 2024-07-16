package comparableAndComparator1;

import java.util.Arrays;

public class MainClass {
	public static void main(String[] args) {
		int[] intArr = {5,9,1,10};
		Arrays.sort(intArr);
//		System.out.println(Arrays.toString(intArr));
		
		Employee[] employees = new Employee[5];
		employees[0] = new Employee(5,"asfar");
		employees[1] = new Employee(9,"ali");
		employees[2] = new Employee(1,"moazzam");
		employees[3] = new Employee(10,"khurshid");
		employees[4] = new Employee(1,"ziaul");
//		Arrays.sort(employees);
		Arrays.sort(employees,Employee.nameComparator);
		System.out.println(Arrays.toString(employees));
		
	}
}
