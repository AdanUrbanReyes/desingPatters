package command_pattern.concrete_commands;

import command_pattern.interfaces.Command;
import command_pattern.vendor_classes.CeilingFan;

public class CeilingFanMediumCommand implements Command{

	private CeilingFan ceilingFan;
	private byte previuslySpeed;
	
	public CeilingFanMediumCommand(CeilingFan ceilingFan) {
		this.ceilingFan = ceilingFan;
	}
	
	@Override
	public void execute() {
		previuslySpeed = ceilingFan.getSpeed();
		ceilingFan.medium();
	}

	@Override
	public void undo() {
		ceilingFan.setSpeed(previuslySpeed);
	}

}
