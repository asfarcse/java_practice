package ThreadByDurgesh;

public class Consumer extends Thread {

	Company company;

	public Consumer (Company company) {
		this.company = company;
	}

	@Override
	public void run() {
		while (true) {
			try {this.company.consume_item();} catch (InterruptedException e) {e.printStackTrace();}
			try {Thread.sleep(2000);} catch (InterruptedException e) {e.printStackTrace();}
		}
	}

}
