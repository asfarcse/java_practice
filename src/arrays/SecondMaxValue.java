package arrays;
import java.util.HashMap;
import java.util.Map;

class SingletonClass {
	private static SingletonClass instance = null;
	
	private SingletonClass () {
	}
	
	public static SingletonClass getInstance () {
		if(instance == null) {
			
			synchronized (SingletonClass.class) {
				if(instance == null) {
					instance = new SingletonClass();
				}
			}
		}
		return instance;
	}
}

public class SecondMaxValue {
	public static void main(String[] args) {
		System.out.println(SingletonClass.getInstance().hashCode());
		System.out.println(SingletonClass.getInstance().hashCode());
		
	}
}
