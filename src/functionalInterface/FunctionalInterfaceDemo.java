package functionalInterface;

import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

class Person1 {
	
	private String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
}

public class FunctionalInterfaceDemo {
	public static void main(String[] args) {
		
		// Predicate: Takes one argument and returns a boolean
		Predicate<String> predicate = (str) -> str.length()>5;
		System.out.println(predicate.test("asfarr"));
		
		// Supplier: Takes no arguments and produces a result
		Supplier<Double> supplier = () -> Math.random();
		System.out.println(supplier.get());
		
		// Consumer: Takes one argument and performs an action (no return value)
		Person1 person = new Person1();
		Consumer<Person1> setName = p -> p.setName("asfar");
		setName.accept(person);
		System.out.println(person.getName());
		
		// Function: Takes one argument and produces a result
		Function<Integer, String> getInt = (t)->t*10+" multiplied by 10";
		System.out.println(getInt.apply(10));
		
	}
}
