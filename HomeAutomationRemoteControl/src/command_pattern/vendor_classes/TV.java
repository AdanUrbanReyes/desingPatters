package command_pattern.vendor_classes;

public class TV {

	private String location;
	
	public TV(String location) {
		this.location = location;
	} 
	
	public void on() {
		System.out.println(location + " TV is on");
	}

	public void off() {
		System.out.println(location + " TV is off");
	}
	
	public void setChannel(byte channel) {
		System.out.println(location + " TV is on " + channel + " channel");
	}
	
}
