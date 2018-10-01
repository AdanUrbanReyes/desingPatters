package command_pattern.simulators;

import command_pattern.concrete_commands.GarageDoorOpenCommand;
import command_pattern.concrete_commands.LightOnCommand;
import command_pattern.remote_controls.SimpleRemoteControl;
import command_pattern.vendor_classes.GarageDoor;
import command_pattern.vendor_classes.Light;

/*
 * Client
 * @author ayan
 *
 */
public class RemoteControlTest {

	/*
	 * THE COMMAND PATTERN
	 * Definition: Encapsulate a request as an object,
	 * thereby letting you parameterize other objects
	 * with different requests, queue or long requests,
	 * and support undoable operations	
	 * */
	/*
	public static void main(String []args) {
		SimpleRemoteControl src = new SimpleRemoteControl();
		
		src.setCommand(new LightOnCommand(new Light("Living Room")));
		src.buttonWasPressed();
		
		src.setCommand(new GarageDoorOpenCommand(new GarageDoor()));
		src.buttonWasPressed();
		
	}*/
	
}
