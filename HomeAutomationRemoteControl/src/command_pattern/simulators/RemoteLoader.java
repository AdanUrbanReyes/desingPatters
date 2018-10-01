package command_pattern.simulators;

import command_pattern.concrete_commands.CeilingFanHighCommand;
import command_pattern.concrete_commands.CeilingFanOffCommand;
import command_pattern.concrete_commands.GarageDoorCloseCommand;
import command_pattern.concrete_commands.GarageDoorOpenCommand;
import command_pattern.concrete_commands.HottubOffCommand;
import command_pattern.concrete_commands.HottubOnCommand;
import command_pattern.concrete_commands.LightOffCommand;
import command_pattern.concrete_commands.LightOnCommand;
import command_pattern.concrete_commands.MacroCommand;
import command_pattern.concrete_commands.StereoOffCommand;
import command_pattern.concrete_commands.StereoOnWithCDCommand;
import command_pattern.concrete_commands.TVOffCommand;
import command_pattern.concrete_commands.TVOnCommand;
import command_pattern.interfaces.Command;
import command_pattern.remote_controls.RemoteControl;
import command_pattern.vendor_classes.CeilingFan;
import command_pattern.vendor_classes.GarageDoor;
import command_pattern.vendor_classes.Hottub;
import command_pattern.vendor_classes.Light;
import command_pattern.vendor_classes.Stereo;
import command_pattern.vendor_classes.TV;

public class RemoteLoader {

	public static void main(String[] args) {
		RemoteControl remoteControl = new RemoteControl();
		
		Light livingRoomLight = new Light("Living Room");
		Light kitchenLight = new Light("Kitchen");
		CeilingFan ceilingFan = new CeilingFan("Living Room");
		GarageDoor garageDoor = new GarageDoor();
		Stereo stereo = new Stereo("Living Room");
		TV tv = new TV("Living Room");
		Hottub hottub = new Hottub();
		
		LightOnCommand livingRoomLightOnCommand = new LightOnCommand(livingRoomLight);
		LightOffCommand livingRoomLightOffCommand =	new LightOffCommand(livingRoomLight);
		CeilingFanHighCommand livingRoomCeilingFanHighCommand = new CeilingFanHighCommand(ceilingFan);
		CeilingFanOffCommand livingRoomCeilingFanOffCommand = new CeilingFanOffCommand(ceilingFan);
		StereoOnWithCDCommand livingRoomStereoOnWithCDCommand = new StereoOnWithCDCommand(stereo);
		StereoOffCommand liviginRoomStereoOffCommand = new StereoOffCommand(stereo);
		TVOnCommand livingRoomTVOnCommand = new TVOnCommand(tv);
		TVOffCommand livingRoomTVOffCommand =  new TVOffCommand(tv);
		HottubOnCommand hottubOnCommand = new HottubOnCommand(hottub);
		HottubOffCommand hottubOffCommand = new HottubOffCommand(hottub);
		
		MacroCommand partyOnMacro = new MacroCommand(new Command [] {livingRoomLightOnCommand, livingRoomCeilingFanHighCommand, livingRoomStereoOnWithCDCommand, livingRoomTVOnCommand, hottubOnCommand});
		MacroCommand partyOffMacro = new MacroCommand(new Command [] {livingRoomLightOffCommand, livingRoomCeilingFanOffCommand, liviginRoomStereoOffCommand, livingRoomTVOffCommand, hottubOffCommand});
		
		remoteControl.setCommand(0, livingRoomLightOnCommand, livingRoomLightOffCommand);
		remoteControl.setCommand(1, new LightOnCommand(kitchenLight), new LightOffCommand(kitchenLight));
		remoteControl.setCommand(2, livingRoomCeilingFanHighCommand, livingRoomCeilingFanOffCommand);
		remoteControl.setCommand(3, new GarageDoorOpenCommand(garageDoor), new GarageDoorCloseCommand(garageDoor));
		remoteControl.setCommand(4, livingRoomStereoOnWithCDCommand, liviginRoomStereoOffCommand);
		remoteControl.setCommand(5, livingRoomTVOnCommand, livingRoomTVOffCommand);
		remoteControl.setCommand(6, livingRoomTVOnCommand, livingRoomTVOffCommand);
		remoteControl.setCommand(7, partyOnMacro, partyOffMacro);
		
		//remoteControl.onButtonWasPushed(0);
		//remoteControl.offButtonWasPushed(0);
		//remoteControl.undoButtonWasPushed();
		remoteControl.onButtonWasPushed(7);
		remoteControl.undoButtonWasPushed();
		
		remoteControl.onButtonWasPushed(7);
		remoteControl.offButtonWasPushed(7);
		
		
		
		
	}
	
}
