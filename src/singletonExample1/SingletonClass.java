 package singletonExample1;


class Example {
	private static Example example ;
	
	private Example() {}
	
	public static Example getInstance () {
		if(example == null) {
			synchronized (Example.class) {
				if(example == null) {
					example = new Example();
				}
			}
		}
		return example;
	}
}

public class SingletonClass {
	public static void main(String[] args) {
		
		System.out.println(Example.getInstance().hashCode());
		System.out.println(Example.getInstance().hashCode());
	}
}
