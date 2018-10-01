package command_pattern.vendor_classes;

public class CeilingFan {

	public static final byte HIGH = 3;
	public static final byte MEDIUM = 2;
	public static final byte LOW = 1;
	public static final byte OFF = 0;
	
	private String location;
	private byte speed;
	
	public CeilingFan(String location) {
		this.location = location;
		speed = OFF;
	}
	
	private void printState() {
		System.out.println(location + " ceiling fan " + speed + " speed");
	}
	
	public void high() {
		speed = HIGH;
		printState();
	}
	
	public void medium() {
		speed = MEDIUM;
		printState();
	}
	
	public void low() {
		speed = LOW;
		printState();
	}
	
	public void off() {
		speed = OFF;
		printState();
	}
	
	public byte getSpeed() {
		return speed;
	}
	
	public void setSpeed(byte speed) {
		this.speed = speed;
		printState();
	}
	
}
