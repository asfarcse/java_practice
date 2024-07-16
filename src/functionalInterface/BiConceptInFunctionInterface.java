package functionalInterface;

import java.util.function.BiPredicate;

public class BiConceptInFunctionInterface {
	public static void main(String[] args) {
		BiPredicate<String, String> biPredicate = (a,b) -> a.length()>b.length();
		System.out.println(biPredicate.test("asfarqqqqqq", "Rakuten"));
	}
}
