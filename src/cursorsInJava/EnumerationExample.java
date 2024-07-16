package cursorsInJava;

import java.util.Enumeration;
import java.util.Vector;

public class EnumerationExample {
	public static void main(String[] args) {
		Vector<Integer> vector = new Vector<>();
		vector.addElement(1);
		vector.addElement(3);
		vector.addElement(5);
		vector.addElement(2);
		
		Enumeration<Integer> elements = vector.elements();
		
		while(elements.hasMoreElements()) {
			Integer nextElement = elements.nextElement();
			if(nextElement%2==0) {
				System.out.println("even number::::"+nextElement);
			} else {
				System.out.println("odd number::::"+nextElement);
			}
		}
	}
}
