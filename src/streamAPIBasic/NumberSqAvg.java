package streamAPIBasic;

import java.util.Arrays;
import java.util.List;

/**squared the number and find avg if number if greator than 100*/
public class NumberSqAvg {
	public static void main(String[] args) {
		List<Integer> intList = Arrays.asList(1,4,6,8,10,12,14,15);
		double average = intList
						.stream()
						.map(n->n*n)
						.filter(n->n>100)
						.peek(p->System.out.println(p))
						.mapToInt(n->n)
						.average()
						.getAsDouble();
		System.out.println("average::::"+average);
	}
}
