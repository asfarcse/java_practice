package interviewQuestion;

import java.util.function.BiFunction;

public class AddTwoNumberUsingFunctionalInterface {
	public static void main(String[] args) {
		BiFunction<Integer, Integer, Integer> biFunction = (a,b) ->a*b;
		System.out.println(biFunction.apply(3, 3));
	}
}
