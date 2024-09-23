package Thread;

public class JoinExample extends Thread{
	
	@Override
	public void run() {
		for(int i=0;i<=5;i++) {
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			System.out.println("i am in run method");
		}
	}
	
	public static void main(String[] args) throws InterruptedException {
		
		JoinExample obj = new JoinExample();
		obj.start();
		obj.join();
		
		for(int i=0;i<=5;i++) {
			System.out.println("main method thread");
		}
		
	}
}
