package reflectionExample;

import java.lang.reflect.Field;
import java.lang.reflect.Method;

class Company {
	
	private String name;
	
	public Company(String name) {
		this.name = name;
	}
	
	public String getName() {
		return name;
	}
	
	private void display() {
		System.out.println("Private method to display company name:::"+name);
	}
}

public class ReflectionExample {
	public static void main(String[] args) throws Exception {
		
		Company company = new Company("Rakuten");
		System.out.println(company.getName());
		
		
		//change name from Rakuten to Accenture
		Field nameField = Company.class.getDeclaredField("name");
		nameField.setAccessible(true);
		nameField.set(company, "Accenture");
		System.out.println(company.getName());
		
		//Invoke the private method
		Method declaredMethod = Company.class.getDeclaredMethod("display");
		declaredMethod.setAccessible(true);
		declaredMethod.invoke(company);
	}
}
