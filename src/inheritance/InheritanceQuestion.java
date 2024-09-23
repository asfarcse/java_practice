package inheritance;

class Parent {
	void m1() {
		System.out.println("m1 method of parent class...");
	}
}

class Child extends Parent{
	void m1() {
		System.out.println("m1 method of child class...");
	}
	
	void m2() {
		System.out.println("m2 method of child class...");
	}
}


public class InheritanceQuestion {
	public static void main(String[] args) {
		Parent parent = new Parent();
		parent.m1();
		System.out.println("***************************");
		Child child = new Child();
		child.m1();
		child.m2();
		System.out.println("***************************");
		Parent pt = new Child();
		pt.m1();
		

	}
}
