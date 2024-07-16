package immutableClass;

public class Address {
	
	private String city;
	private Integer pin;
	
	public Address() {
		super();
	}
	
	public Address(String city, Integer pin) {
		super();
		this.city = city;
		this.pin = pin;
	}
	
	
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public Integer getPin() {
		return pin;
	}
	public void setPin(Integer pin) {
		this.pin = pin;
	}
	
	@Override
	public String toString() {
		return "Address [city=" + city + ", pin=" + pin + "]";
	}
}
