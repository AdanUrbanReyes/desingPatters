package command_pattern.concrete_commands;

import command_pattern.interfaces.Command;
import command_pattern.vendor_classes.TV;

public class TVOffCommand implements Command{

	private TV tv;
	
	public TVOffCommand(TV tv) {
		this.tv = tv;
	}
	
	@Override
	public void execute() {
		tv.off();
	}

	@Override
	public void undo() {
		tv.on();
	}

	
	
}
