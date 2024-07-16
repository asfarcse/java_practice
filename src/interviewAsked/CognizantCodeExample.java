package interviewAsked;

public class CognizantCodeExample {
	public static void main(String[] args) {
		Integer num1 = 100;
		Integer num2 = 100;
		Integer num3 = -128;
		Integer num4 = -128;
		Integer num5 = 555;
		Integer num6 = 555;
		//-127 to 128
		if(num1 == num2) {
			System.out.println("num1 == num2");
		} else {
			System.out.println("num1 != num2");
		}
		
		if(num3 == num4) {
			System.out.println("num3 == num4");
		} else {
			System.out.println("num3 != num4");
		}
		
		if(num5 == num6) {
			System.out.println("num5 == num6");
		} else {
			System.out.println("num5 != num6");
		}
	}
}
