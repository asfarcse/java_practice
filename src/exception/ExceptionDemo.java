package exception;

class Parent {
	void demo() throws Exception {
		System.out.println("parent demo");
	}
}

class Child extends Parent {
	void demo (){
		System.out.println("child demo");
		System.exit(0);
		System.out.println("Hello");
	}
}

public class ExceptionDemo {
	public static void main(String[] args) throws Exception {
		Child c = new Child();
		c.demo();
	}
}
