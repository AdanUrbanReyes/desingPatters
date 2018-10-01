package command_pattern.remote_controls;

import command_pattern.concrete_commands.NoCommand;
import command_pattern.interfaces.Command;

public class RemoteControl {

	public final int devices = 8;
	private Command[] onCommands;
	private Command[] offCommands;
	private Command undoCommand;
	
	public RemoteControl() {
		int i;
		Command noCommand = new NoCommand();
		undoCommand = new NoCommand();
		onCommands = new Command[devices];
		offCommands = new Command[devices];
		for(i = 0; i < devices; i++) {
			onCommands[i] = offCommands[i] = noCommand;
		}
	}
	
	public void setCommand(int slot, Command onCommand, Command offCommand) {
		onCommands[slot] = onCommand;
		offCommands[slot] = offCommand;
	}
	
	public void onButtonWasPushed(int slot) {
		onCommands[slot].execute();
		undoCommand = onCommands[slot];
	}
	
	public void offButtonWasPushed(int slot) {
		offCommands[slot].execute();
		undoCommand = offCommands[slot];
	}
	
	public void undoButtonWasPushed() {
		undoCommand.undo();
	}
	
	@Override
	public String toString() {
		int i;
		StringBuffer stringBuffer = new StringBuffer();
		stringBuffer.append("\n------ Remote Control ------\n");
		for(i = 0; i < devices; i++) {
			stringBuffer.append("[slot ");
			stringBuffer.append(i);
			stringBuffer.append(" ] ");
			stringBuffer.append(onCommands[i].getClass().getName());
			stringBuffer.append("\t");
			stringBuffer.append(offCommands[i].getClass().getName());
			stringBuffer.append("\n");
		}
		return stringBuffer.toString();
	}
	
}
