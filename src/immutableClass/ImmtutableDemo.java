package immutableClass;

import java.util.Objects;

public final class ImmtutableDemo {
	
	private final Integer id;
	private final String name;
	
	
	public ImmtutableDemo(Integer id, String name) {
		super();
		this.id = id;
		this.name = name;
	}
	public Integer getId() {
		return id;
	}
	public String getName() {
		return name;
	}
	
	
	
	@Override
	public int hashCode() {
		return Objects.hash(id, name);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		ImmtutableDemo other = (ImmtutableDemo) obj;
		return Objects.equals(id, other.id) && Objects.equals(name, other.name);
	}
	
	public static void main(String[] args) {
		ImmtutableDemo obj1 = new ImmtutableDemo(1, "asfar");
		System.out.println(obj1.hashCode());
		ImmtutableDemo obj2 = new ImmtutableDemo(1, "asfar");
		System.out.println(obj2.hashCode());
		
		System.out.println(obj1.equals(obj2));
	}
}
