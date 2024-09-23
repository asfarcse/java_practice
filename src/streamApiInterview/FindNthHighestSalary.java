package streamApiInterview;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class Worker {
	private String name;
	private int salary;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	public Worker(String name, int salary) {
		super();
		this.name = name;
		this.salary = salary;
	}
	@Override
	public String toString() {
		return "Worker [name=" + name + ", salary=" + salary + "]";
	}
	
	
}

public class FindNthHighestSalary {
	public static void main(String[] args) {
		int input = 2;
		List<Worker> workerList = Arrays.asList(new Worker("asfar",1000),
												new Worker("moazzam",500),
												new Worker("mehdi",1500));
		
		Worker worker = workerList.stream()
			.sorted(Collections.reverseOrder(Comparator.comparing(Worker::getSalary)))
				.skip(input-1).findFirst().get();
		System.out.println(worker);
		
	}
}
