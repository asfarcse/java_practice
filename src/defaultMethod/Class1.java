package defaultMethod;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Class1 implements DemoInterface{

	@Override
	public void m1() {
		// TODO Auto-generated method stub
		
	}
	
	@Override
	public void m2ForClass1() {
		// TODO Auto-generated method stub
		DemoInterface.super.m2ForClass1();
	}
	
	public static void main(String[] args) {
		boolean printMsgStatic = DemoInterface.checkIntegerValue("asfar");
		System.out.println(printMsgStatic);
		
		
		List<Integer> asList = Arrays.asList(1,11,4,29,0,2);
		Integer integer = asList.stream().sorted(Collections.reverseOrder()).findFirst().get();
		System.out.println(integer);
		
	}

}
