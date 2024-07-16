package immutableClass;

import java.util.Arrays;
import java.util.Date;
import java.util.List;
import java.util.stream.Collectors;

public class ImmutableMain {
	public static void main(String[] args) {
		Employee emp = new Employee("asfar", new Date(),
				Arrays.stream(new String[] {"8960","2014"}).collect(Collectors.toList()),
				new Address("indore", 452010));
		
		emp.getMobile().add("8970");
		emp.getAddress().setCity("pune");
		emp.getAddress().setPin(1234);
		System.out.println(emp);
		
		final Address adr = new Address();
		adr.setCity("azam");
		adr.setPin(276305);
		System.out.println(adr);
		
		adr.setCity("smz");
		adr.setPin(276306);
		System.out.println(adr);
		
	}
}
