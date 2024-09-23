package oops;

class Parent {
	public void m1() {
		System.out.println("Parent-1");
	}
	public void m3() {
		System.out.println("Parent-2");
	}
}
class Child extends Parent{
	public void m2() {
		System.out.println("Child-1");
	}
	public void m3() {
		System.out.println("Child-2");
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
		p1.m3();
		
//		Child c1 = (Child) new Parent();
//		c1.m1();
//		c1.m2();
		
	}
}
