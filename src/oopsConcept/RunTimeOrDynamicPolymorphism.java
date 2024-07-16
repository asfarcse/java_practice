package oopsConcept;

class Parent {
	
	public void printMsg () {
		System.out.println("parent class method invoked");
	}
}

class Child extends Parent {
	
	public void printMsg () {
		System.out.println("child class method invoked");
	}
}

public class RunTimeOrDynamicPolymorphism {
	public static void main(String[] args) {
		Parent childObj = new Child(); //upcasting
		Child child = new Child();
		Parent parent = new Parent();
//		Child childd = new Parent(); will give error
		childObj.printMsg();
		child.printMsg();
		parent.printMsg();
	}
}
