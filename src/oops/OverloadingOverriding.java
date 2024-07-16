package oops;

class Calculator {
	
	public int add(int x,int y) {
		return x+y;
	}
	
	public double add(double x,double y) {
		return x+y;
	}
}

class ScientificCalculator extends Calculator {
	
	public int add(int x,int y) {
		return x+y+2;
	}
	
	public double add(double x,double y) {
		return x+y+2.0;
	}
}

public class OverloadingOverriding {
	public static void main(String[] args) {
		Calculator sc = new ScientificCalculator();
		System.out.println(sc.add(2.0, 2.0));
	}
}
