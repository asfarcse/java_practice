package lambdaExpression;

public class LambdaDemo {
	public static void main(String[] args) {
		Runnable helloWorld = () -> {System.out.println("Hello");};
		Runnable helloWorld1 = () -> System.out.println("Hello111");
		Thread thread = new Thread(helloWorld);
		Thread thread1 = new Thread(helloWorld1);
		thread.start();
		thread.run();
		thread1.start();
		thread1.run();
	}
}
