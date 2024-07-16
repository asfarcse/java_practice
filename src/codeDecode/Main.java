package codeDecode;

import java.util.Arrays;

public class Main {
	public static void main(String[] args) {
		
		Employee[] emp = new Employee[4];
		emp[0] = new Employee(2, "a");
		emp[1] = new Employee(1, "b");
		emp[2] = new Employee(3, "c");
		emp[3] = new Employee(5, "d");
		
		Arrays.sort(emp,Employee.nameComparator);
		System.out.println(Arrays.toString(emp));
	}
}
