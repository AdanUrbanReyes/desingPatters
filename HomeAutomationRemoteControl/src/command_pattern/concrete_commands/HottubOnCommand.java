package command_pattern.concrete_commands;

import command_pattern.interfaces.Command;
import command_pattern.vendor_classes.Hottub;

public class HottubOnCommand implements Command{

	private Hottub hottub;
	
	public HottubOnCommand(Hottub hottub) {
		this.hottub = hottub;
	}
	
	@Override
	public void execute() {
		hottub.on();
	}

	@Override
	public void undo() {
		hottub.off();
	}

	
	
}
