package command_pattern.vendor_classes;

/*
 * Receiver
 * @author ayan
 *
 */
public class Light {

	private String location;
	
	public Light(String location) {
		this.location = location;
	}
	
	public void on() {
		System.out.println(location + " light is on");
	}
	
	public void off() {
		System.out.println(location + " light is off");
	}
	
}
