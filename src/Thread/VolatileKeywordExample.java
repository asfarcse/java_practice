package Thread;

class SharedResources {
//	private volatile boolean flag = false;
	private boolean flag = false;
	
	public void setFlag(boolean flag) {
		this.flag = flag;
	}
	
	public boolean getFlag() {
		return flag;
	}
}

public class VolatileKeywordExample {
	public static void main(String[] args) {
		
		SharedResources resources = new SharedResources();
		
		new Thread(()->{
			System.out.println("Thread-1 started...");
			try {
				System.out.println("Thread-1 Logic Started...");
				Thread.sleep(1000);
				System.out.println("Thread-1 Logic Completed...");
				resources.setFlag(true);
				System.out.println("flag set as true by Thread-1");
			} catch (Exception e) {
				e.printStackTrace();
			}
		}).start();
		
		new Thread(()->{
			System.out.println("Thread-2 started...");
			while(!resources.getFlag()) {
				//it will run untill flag becomes true
			}
			System.out.println("Thread-2 Logic Completed...");
		}).start();
	}
}
