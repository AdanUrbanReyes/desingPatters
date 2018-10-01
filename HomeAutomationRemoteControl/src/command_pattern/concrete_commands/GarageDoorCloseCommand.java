package command_pattern.concrete_commands;

import command_pattern.interfaces.Command;
import command_pattern.vendor_classes.GarageDoor;

public class GarageDoorCloseCommand implements Command{

	private GarageDoor garageDoor;
	
	public GarageDoorCloseCommand(GarageDoor garageDoor) {
		this.garageDoor = garageDoor;
	}
	
	@Override
	public void execute() {
		garageDoor.close();
	}

	@Override
	public void undo() {
		garageDoor.open();
	}
	
}
