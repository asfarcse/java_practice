package javaFeaureVersionWise.java9;

import java.lang.ProcessHandle.Info;
import java.util.stream.Stream;

public class ProcessAPI {
	public static void main(String[] args) {
		ProcessHandle ph = ProcessHandle.current();
		Info info = ph.info();
		System.out.println(info.toString());
		
		System.out.println("user info::::"+info.user().get());
		System.out.println("totalCpuDuration::::"+info.totalCpuDuration().get());
	}
}
