package Thread;

public class RunnableInterface implements Runnable{

	@Override
	public void run() {
		for(int i=0;i<=5;i++) {
			System.out.println("I am executed by a child thread");
		}
	}
	
	public static void main(String[] args) {
		RunnableInterface obj = new RunnableInterface();
		Thread t1= new Thread(obj);
		t1.start();
		for(int i=0;i<=5;i++) {
			System.out.println("I am executed by a main thread");
		}
	}

}
