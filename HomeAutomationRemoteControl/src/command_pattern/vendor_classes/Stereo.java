package command_pattern.vendor_classes;

/*
 * Receiver
 * @author ayan
 *
 */
public class Stereo {
	
	private String location;
	
	public Stereo(String location) {
		this.location = location;
	}
	
	public void off() {
		System.out.println(location + " stereo is off");
	}
	
	public void on() {
		System.out.println(location + " stereo is on");
	}
	
	public void setCD() {
		System.out.println(location + " solid CD is setting");
	}
	
	public void setVolumen(byte level) {
		System.out.println(location + " stereo volumne set in " + level);
	}

}
