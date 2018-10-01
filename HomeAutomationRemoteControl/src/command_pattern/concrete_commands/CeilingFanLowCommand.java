package command_pattern.concrete_commands;

import command_pattern.interfaces.Command;
import command_pattern.vendor_classes.CeilingFan;

public class CeilingFanLowCommand implements Command{

	private CeilingFan ceilingFan;
	private byte previuslySpeed;
	
	public CeilingFanLowCommand(CeilingFan ceilingFan) {
		this.ceilingFan = ceilingFan;
	}
	
	@Override
	public void execute() {
		previuslySpeed = ceilingFan.getSpeed();
		ceilingFan.low();
	}

	@Override
	public void undo() {
		ceilingFan.setSpeed(previuslySpeed);
	}

}