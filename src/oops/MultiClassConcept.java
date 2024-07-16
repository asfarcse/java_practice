package oops;

class Calculation {
	public Integer sum(Integer a,Integer b) {
		return a+b;
	}
	
	public Integer sub(Integer a,Integer b) {
		return a-b;
	}
	
	public Integer mul(Integer a,Integer b) {
		return a*b;
	}
	public Integer devide(Integer a,Integer b) {
		return a/b;
	}
	public Integer rem(Integer a,Integer b) {
		return a%b;
	}
}

public class MultiClassConcept {
	public static void main(String[] args) {
		Calculation calc=new Calculation();
		System.out.println(calc.sum(2, 2)); 
		System.out.println(calc.sub(2, 2));
		System.out.println(calc.mul(2, 2));
		System.out.println(calc.devide(2, 2));
		System.out.println(calc.rem(2, 2));
	}
}
