package method_reference;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Application {
	public static void main(String[] args) {
		
		Person a = new Person("asfar",28);
		Person b = new Person("mehdi",30);
		Person c = new Person("moazzam",32);
		Person d = new Person("hamza",20);
		
		List<Person> personList = Arrays.asList(a,b,c,d);
		//personList.forEach(System.out::println);
		personList.stream().map(person->person.getAge()).forEach(System.out::println);
		personList.stream().map(Person::getAge).forEach(System.out::println);
	}
}	
