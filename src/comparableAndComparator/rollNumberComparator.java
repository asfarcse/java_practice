package comparableAndComparator;

import java.util.Comparator;

public class rollNumberComparator implements Comparator<Student>{

	@Override
	public int compare(Student stu1, Student stu2) {
		return stu1.getRollNumber()-stu2.getRollNumber();
	}

}
