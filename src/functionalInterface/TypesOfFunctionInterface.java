package functionalInterface;

import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

class Person {
	private String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
}

public class TypesOfFunctionInterface {
	public static void main(String[] args) {
		//Predicate type---boolean result
		Predicate<String> predicate = str -> str.length()>5;
		System.out.println(predicate.test("asfarr"));
		
		//consumer--modifiesData, no output
		Person person = new Person();
		Consumer<Person> setName = t1->t1.setName("Rakuten");
		setName.accept(person);
		System.out.println(person.getName());
		
		//Function--both input and output
		Function<Integer, String> getInt = t->t*10+" data multipled by 10";
		System.out.println(getInt.apply(10));
		
		//Supplier---only output
		Supplier<Double> getRandomDuble = () -> Math.random();
		System.out.println(getRandomDuble.get());
	}
}
