package Thread;

class Hii extends Thread {
	@Override
	public void run() {
		for(int i=0;i<10;i++) {
			System.out.println("Hii");
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}

class Hello extends Thread {
	@Override
	public void run() {
		for(int i=0;i<10;i++) {
			System.out.println("Hello");
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}

public class ThreadDemo{
	
	public static void main(String[] args) {
		Hii hii = new Hii();
		Hello hello = new Hello();
		hii.start();
		hello.start();
	}

}
