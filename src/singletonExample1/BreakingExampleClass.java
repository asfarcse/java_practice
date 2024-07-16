package singletonExample1;

import java.io.Serializable;

public class BreakingExampleClass implements Serializable{
	
	private static BreakingExampleClass example;
	
	
	/**constructor*/
	private BreakingExampleClass() {
//		if(example != null) {
//			throw new RuntimeException("You're trying to break singleton pattern");
//		}
	}
	
	public static BreakingExampleClass getInstance () {
		if(example == null) {
			synchronized (BreakingExampleClass.class) {
				if(example == null) {
					example = new BreakingExampleClass();
				}
			}
		}
		return example;
	}
	
	public Object readResolve() {
		return example;
	}
}

