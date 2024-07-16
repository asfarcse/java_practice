package collectionexample;

import java.util.Enumeration;
import java.util.Vector;

public class EnumerationExample {
	public static void main(String[] args) {
		Vector vector = new Vector();
		for(int i=1;i<=10;i++) {
			vector.addElement(i);
		}
		Enumeration enumeration = vector.elements();
		while(enumeration.hasMoreElements()) {
			Integer i = (Integer) enumeration.nextElement();
			{
				if(i%2 == 0) {
					System.out.print(i);
				}
			}
		}
	}
}
