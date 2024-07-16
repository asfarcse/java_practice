package genericsInJava;

//Java program to demonstrate Upper Bounded Wildcards

import java.util.Arrays;
import java.util.List;

class UpperBoundedWildcard {
	public static void main(String[] args) {
		List<Integer> list1 = Arrays.asList(4, 5, 6, 7);
		System.out.println("Total sum is:" + sum(list1));

		List<Double> list2 = Arrays.asList(4.1, 5.1, 6.1);
		System.out.print("Total sum is:" + sum(list2));
		
//		Object obj = null;
//		System.out.println();
//		System.out.println(obj);
	}

	private static double sum(List<? extends Number> list) {
		double sum = 0.0;
		for (Number i : list) {
			sum += i.doubleValue();
		}
		return sum;
	}
}
