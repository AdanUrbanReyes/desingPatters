package command_pattern.concrete_commands;

import command_pattern.interfaces.Command;
import command_pattern.vendor_classes.Stereo;

public class StereoOnWithCDCommand implements Command{

	private Stereo stereo;
	
	public StereoOnWithCDCommand(Stereo stereo) {
		this.stereo = stereo;
	}
	
	@Override
	public void execute() {
		stereo.on();
		stereo.setCD();
		stereo.setVolumen((byte)11);
	}
	
	@Override
	public void undo() {
		stereo.off();
	}
	

}
