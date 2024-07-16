package methodReferenceDurgesh;

import java.util.Date;

public class Stuff {
	
	public static void doStuff() {
		System.out.println("I am doing task...");
		System.out.println("I am second line");
		System.out.println(new Date().toLocaleString());
	}
	
	public static void printEvenNumber() {
		for(int i=0;i<10;i++) {
			System.out.println(i*2);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
	
	public void printNumber() {
		for(int i=0;i<10;i++) {
			System.out.println(i);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}
