package javaFeaureVersionWise.java9;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

/**
 * takeWhile and dropWhile: Simplify the extraction of elements based on conditions, improving readability and performance.
 * ofNullable: Provides a convenient way to handle nullable values.
 * iterate: Enables more control over iteration with termination conditions.
 * */
public class StreamApiEnhancement {
	public static void main(String[] args) {
		List<Integer> numList = Arrays.asList(2,4,6,1,5,7,8,10,9);
		/**takeWhile*/
		numList.stream().takeWhile(i->i%2==0).forEach(System.out::println);
		System.out.println("----------------------------------------------");
		/**dropWhile*/
		numList.stream().dropWhile(i->i%2==0).forEach(System.out::println);
		System.out.println("----------------------------------------------");
		/**iterate*/
		Stream.iterate(1, i->i+1).limit(10).forEach(i->System.out.println(i));
		//don't use limit, instead add a limit in iterate method
		Stream.iterate(1,i->i<=100, i->i+1).forEach(i->System.out.println(i));
		System.out.println("----------------------------------------------");
		
		/**ofNullable*/
		List<String> strList = Arrays.asList(null);
		strList.stream().forEach(System.out::println);
		Stream<String> ofNullable = Stream.ofNullable("asfar");
		ofNullable.forEach(System.out::println);
	}
}
