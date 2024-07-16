package interviewAsked;

class Dada {
	public Dada() {
		System.out.println("Dada class constructor");
	}
}

class Parent extends Dada{
	public Parent() {
		System.out.println("parent class constructor");
	}
	
	public Parent(int x) {
		this();
		System.out.println("parent class constructor with args x as:::"+x);
	}
}

class Child extends Parent{
	public Child() {
		System.out.println("child class constructor");
	}
	
	public Child(int x) {
//		super(x);
		this();
		System.out.println("child class constructor with args x as:::"+x);
	}
}

public class ThisAndSuperExample {
	public static void main(String[] args) {
		Child child = new Child(5);
	}
}
