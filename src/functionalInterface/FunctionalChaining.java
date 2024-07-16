package functionalInterface;

import java.util.function.Function;

public class FunctionalChaining {
	public static void main(String[] args) {
		
		Function<Integer, Integer> square = i -> i*i;
		System.out.println("Square function " + square.apply(2));
		
		Function<Integer, Integer> cube = i -> i*i*i;
		System.out.println("Cube function " + cube.apply(2));
		
		System.out.println("First Sqauring by using apply " + square.andThen(cube).apply(2));
		System.out.println("First Cubing by using apply " + square.compose(cube).apply(2));
	}
}
