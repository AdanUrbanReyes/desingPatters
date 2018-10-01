package command_pattern.concrete_commands;

import command_pattern.interfaces.Command;
import command_pattern.vendor_classes.TV;

public class TVOnCommand implements Command{

	private TV tv;
	
	public TVOnCommand(TV tv) {
		this.tv = tv;
	}

	@Override
	public void execute() {
		tv.on();
		tv.setChannel((byte)3);
	}

	@Override
	public void undo() {
		tv.off();
	}
	
}
