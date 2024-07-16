package streamApiJavaTechie;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * input: asfar
 * output: a=2,s=1,f=1,a=1,r=1
 * 
 * */
public class OccurenceOfEachCharacterInAString {
	public static void main(String[] args) {
		String input = "asfar";
		String[] result = input.split("");
//		Map<String, Long> collect = Arrays.stream(result).collect(Collectors.groupingBy(p->p,Collectors.counting()));
		Map<String, Long> collect = Arrays.stream(result).collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));
		System.out.println(collect);
		
		
		/**print those whose count is greater than 1*/
		Map<String, Long> collect1 = Arrays.stream(result).filter(p->Collections.frequency(Arrays.asList(result),p)>1).collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));
		System.out.println(collect1);
		
		/**print those whose count is less than 2*/
		Map<String, Long> collect2 = Arrays.stream(result).filter(p->Collections.frequency(Arrays.asList(result),p)<2).collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));
		System.out.println(collect2);
	}
}
