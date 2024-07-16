package main;

import java.util.Scanner;

public class SwitchCaseDemo {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		Integer val = sc.nextInt();
		System.out.println(callTheSwitch(val));
		
	}
	
	static String callTheSwitch(Integer str) {
		switch(str) {
			case 1:
				return "one";
			case 2:
			case 3:
				return "two or three";
			default:
				return "out of option";
		}
	}
	
//	static String callTheSwitch(String str) {
//		switch(str) {
//		case "asfar":
//			return "asfar";
//		case "demo":
//		case "test":
//			return "demo or test";
//		default:
//			return "out of opt";
//		}
//	}
}
