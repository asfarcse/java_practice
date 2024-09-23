package lambdaExpression;

public class LambdaDemo {
	public static void main(String[] args) {
		Runnable r1 = ()->System.out.println("Runnable-1");
		
		Runnable r2 =  ()->System.out.println("Runnable-2");
		
		Thread t1 = new Thread(r1);
		Thread t2 = new Thread(r2);
		
		t1.start();
		t2.start();
	}
}
