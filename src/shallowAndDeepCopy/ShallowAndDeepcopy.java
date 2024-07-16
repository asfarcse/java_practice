package shallowAndDeepCopy;

import java.util.ArrayList;
import java.util.List;

class Address {
	
    private String city;

    public Address(String city) {
        this.city = city;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

	@Override
	public String toString() {
		return "Address [city=" + city + "]";
	}
    
    
}

class Person implements Cloneable{
    private String name;
    private Address address;

    public Person(String name, Address address) {
        this.name = name;
        this.address = address;
    }

    public String getName() {
        return name;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

	@Override
	public String toString() {
		return "Person [name=" + name + ", address=" + address + "]";
	}
	
	@Override
	protected Object clone() throws CloneNotSupportedException {
		return super.clone();
	}
    
}

public class ShallowAndDeepcopy {
    public static void main(String[] args) throws CloneNotSupportedException {
    	//shallow copy
    	Address address = new Address("indore");
    	Person person = new Person("asfar", address);
    	person.getAddress().setCity("hyderabad");
    	System.out.println(person);
    	System.out.println(address);
    	
    	//Deep copy
    	Address address1 = new Address("Noida");
    	Person person1 = new Person("asfar",address1);
    	
    	person1.getAddress().setCity("gurgao");
    	System.out.println(person1);
    	System.out.println(address1);
    	
    	System.out.println("******************************************");
    	
    	/**Example2*/
    	List<Integer> list1 = new ArrayList<>();
		List<Integer> list2 = new ArrayList<>();
		List<Integer> list3 = new ArrayList<>();
		
		list1.add(1);
		list1.add(2);
		list1.add(3);
		
		/**Swallow Copy*/
		list2=list1;
		
		/**Deep Copy*/
		list3 = new ArrayList<>(list1);
				
		list1.add(4);
		
		/**swallow copying*/
		System.out.println(list1.hashCode()+" "+list2.hashCode());
		System.out.println(list1+" "+list2);
		
		/**deep copying*/
		System.out.println(list1.hashCode()+" "+list3.hashCode());
		System.out.println(list1+" "+list3);
    	
    	
    }
}
