package stringConstantPool;

public class ScpExample {
	public static void main(String[] args) {
		
		String s1 = "Hello"; //String Pool
		String s2 = s1.concat(" world"); //heap memory
		String s3 = s1.concat(" world").intern(); //String pool
		
		
		
		String s4 = new String("Hello World");//heap memory
		
		String s5= "Hello World"; //string pool
		
		System.out.println(s3==s4);
		
		
	}
}
