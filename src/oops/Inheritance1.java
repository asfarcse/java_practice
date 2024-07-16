package oops;

class Parent {
	public void m1() {
		System.out.println("Parent");
	}
}
class Child extends Parent{
	public void m2() {
		System.out.println("Child");
	}
}
public class Inheritance1 {
	public static void main(String[] args) {
		
		Parent p = new Parent();
		p.m1();
		
		Child c = new Child();
		c.m1();
		c.m2();
		
		Parent p1 = new Child();
		p1.m1();
		
//		Child c1 = (Child) new Parent();
//		c1.m1();
//		c1.m2();
		
	}
}
