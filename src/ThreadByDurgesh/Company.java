package ThreadByDurgesh;

public class Company {
	
	int n;
	boolean flag = false;
	//false---->producer
	//true--->consumer
	synchronized public void produce_item(int n) throws InterruptedException {
		if(flag) {
			wait();
		}
		this.n = n;
		System.out.println("Produced : "+this.n);
		flag = true;
		notify();
	}
	
	synchronized public int consume_item() throws InterruptedException {
		if(!flag) {
			wait();
		}
		flag = false;
		notify();
		System.out.println("consumed : "+this.n);
		return this.n;
	}
}
