package functionalInterface;

import java.util.function.Predicate;

public class PredicateJoining {
	public static void main(String[] args) {
		Predicate<String> checkLength = s->s.length()>5;
		System.out.println(checkLength.test("asfarr"));
		
		Predicate<String> checkEvenLength = s->s.length()%2==0;
		System.out.println(checkEvenLength.test("asfar"));
		
		System.out.println(checkLength.and(checkEvenLength).test("asfarr"));
		System.out.println(checkLength.or(checkEvenLength).test("asfar"));
		System.out.println(checkLength.negate().test("asfarr"));
	}
}
