package command_pattern.concrete_commands;

import command_pattern.interfaces.Command;

public class MacroCommand implements Command{
	
	private Command commands[];

	public MacroCommand(Command []commands) {
		this.commands = commands;
	}
	
	@Override
	public void execute() {
		int i;
		for(i = 0; i < commands.length; i++) {
			commands[i].execute();
		}
	}

	@Override
	public void undo() {
		int i;
		for(i = 0; i < commands.length; i++) {
			commands[i].undo();
		}	}

}
