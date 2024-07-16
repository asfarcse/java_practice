package enumExample;


class Student {
	
	private Integer id;
	private String name;
	private Mode mode;
	
	
	/**enum definition with method*/
	public enum Mode {
        REGULAR, PRIVATE, DISTANCE;
        
        public boolean isPrivateOrDistanceMode() {
            return this == PRIVATE || this == DISTANCE;
        }
    }

	public Student(Integer id, String name, Mode mode) {
		super();
		this.id = id;
		this.name = name;
		this.mode = mode;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Mode getMode() {
		return mode;
	}

	public void setMode(Mode mode) {
		this.mode = mode;
	}
	
	
}

public class EnumExample {
	public static void main(String[] args) {
		Student student1 = new Student(1, "Alice", Student.Mode.REGULAR);
        Student student2 = new Student(2, "Bob", Student.Mode.PRIVATE);
        
        System.out.println(student1.getMode());
        System.out.println(student2.getMode());
        
        System.out.println(student1.getMode().isPrivateOrDistanceMode());
        System.out.println(student2.getMode().isPrivateOrDistanceMode());
	}
}
