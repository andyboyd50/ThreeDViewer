package sc.fiji.threed.controls;

import org.scijava.plugin.Plugin;

import sc.fiji.threed.ThreeDViewer;

import org.scijava.command.Command;

@Plugin(type = Command.class, 
		menuPath = "ThreeDViewer>Controls>FPS")
public class FPSControl  implements Command {
		
	@Override
	public void run() {		
		ThreeDViewer.enableFPSControl();
		
	}

}

