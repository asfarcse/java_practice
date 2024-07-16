package customMarkerInterface;

public class CustomMarkerImpl implements ShowHelloMsg{
	public static void main(String[] args) {
		CustomMarkerImpl obj = new CustomMarkerImpl();
		if(obj instanceof ShowHelloMsg) {
			obj.Hello();
		} else {
			System.out.println("can't show hello msg...");
		}
	}
	
	public void Hello () {
		System.out.println("Hello MSG...");
	}
}
