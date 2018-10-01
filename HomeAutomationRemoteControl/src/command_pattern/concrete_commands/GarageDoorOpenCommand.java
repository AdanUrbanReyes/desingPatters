package command_pattern.concrete_commands;

import command_pattern.interfaces.Command;
import command_pattern.vendor_classes.GarageDoor;

public class GarageDoorOpenCommand implements Command{

	private GarageDoor garageDoor;
	
	public GarageDoorOpenCommand(GarageDoor garageDoor) {
		this.garageDoor = garageDoor;
	}

	@Override
	public void execute() {
		garageDoor.open();
	}
	
	@Override
	public void undo() {
		garageDoor.close();
	}
	
}
