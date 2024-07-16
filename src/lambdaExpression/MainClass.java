package lambdaExpression;

public class MainClass {
	public static void main(String[] args) {
		
		/***old technique**/
		MyInterfaceImpl impl = new MyInterfaceImpl();
		impl.sayHello();
		
		
		MyInterface myInterface = new MyInterface() {
			
			@Override
			public void sayHello() {
				System.out.println("Saying Hii from First Anonymous Class");
			}
		};
		myInterface.sayHello(); 
		MyInterface.staticMethod();
		
		MyInterface myInterface1 = new MyInterface() {
			
			@Override
			public void sayHello() {
				System.out.println("Saying Hii from Second Anonymous Class");
			}
		};
		myInterface1.sayHello();
		
		/****using our functional interface with the help of lambda function*****/
		MyInterface obj = ()->System.out.println("Saying Hii from Anonymous using functional interface with lambda expression");
		obj.sayHello();
		
		
		SumInterface sumObj = (a,b) -> a+b;
		System.out.println(sumObj.sum(2, 3));
		System.out.println(sumObj.sum(5, 3));
		
		LengthInterface lengthInterface = str->str.length();
		System.out.println("Length is:::"+lengthInterface.getLength("asfar"));
		System.out.println("Length is:::"+lengthInterface.getLength("Rakuten"));
		
	}
}
