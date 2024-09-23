
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

class Person {

	private Integer id;
	private String name;
	private Integer age;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getAge() {
		return age;
	}

	public void setAge(Integer age) {
		this.age = age;
	}

	public Person(Integer id, String name, Integer age) {
		super();
		this.id = id;
		this.name = name;
		this.age = age;
	}

	public Person() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "Person [id=" + id + ", name=" + name + ", age=" + age + "]";
	}

}

public class Hello {
	public static void main(String[] args) {

		List<Integer> asList = Arrays.asList(1, 3, 5, 7, 98, 1, 1);

//		List<Person> collect = asList.stream().sorted(Collections.reverseOrder(Comparator.comparing(Person::getAge).thenComparing(Person::getName))).collect(Collectors.toList());
//		Map<Integer, List<Person>> collect = asList.stream().collect(Collectors.groupingBy(e->e.getAge()));
//		System.out.println(collect);

		Map<Integer, Long> collect = asList.stream().filter(p -> Collections.frequency(asList, p) > 1)
				.collect(Collectors.groupingBy(p -> p, Collectors.counting()));
		System.out.println(collect);

		Set<Integer> set = new HashSet<>();

		Set<Integer> count = asList.stream().filter(p -> !set.add(p)).collect(Collectors.toSet());
		System.out.println(count);
		System.out.println(set);

		String str = "asfar";

		List<String> asList2 = Arrays.asList(str.split(""));
		Collections.reverse(asList2);

		// Reverse each character and collect the results into a new list
		String collect2 = asList2.stream().collect(Collectors.joining());

		System.out.println(collect2);

	}

}