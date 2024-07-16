package streamAPIBasic;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

class Person {
	private String name;
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getName() {
		return this.name;
	}
}

public class Practice {
	public static void main(String[] args) {
		Predicate<String> predicate = (s->s.length()>=5);
		System.out.println(predicate.test("asf"));
		
		Supplier<Double> supplier = ()->Math.random();
		System.out.println(supplier.get());
		
		Function<Integer, String> function = (t) ->t*10+"multiplied by 10";
		System.out.println(function.apply(10));
		
		Person person = new Person();
		Consumer<Person> consumer = (p)->p.setName("asfar");
		consumer.accept(person);
		System.out.println(person.getName());
	}
}
