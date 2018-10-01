package command_pattern.remote_controls;

import command_pattern.interfaces.Command;

/***
 * Invoker
 * @author ayan
 *
 */
public class SimpleRemoteControl {

	private Command slot;
	
	public SimpleRemoteControl() {
		
	}
	
	public void setCommand(Command command) {
		this.slot = command;
	}
	
	public void buttonWasPressed() {
		this.slot.execute();
	}
	
}
