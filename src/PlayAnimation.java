import java.awt.event.ActionEvent;

public class PlayAnimation implements Runnable{
	public void run(){
		FrameSpinner spinner = (FrameSpinner) ComponentRegistry.getRegistry().getComponent("FrameSpinner");
		while((Integer) spinner.getValue() < spinner.getMax()){
			//TODO Take account of the FPS in FPSSpinner
			spinner.setValue(((Integer) spinner.getValue()) + 1);
		}
		System.out.println("Finished");
		PlayPauseButton button = (PlayPauseButton) ComponentRegistry.getRegistry().getComponent("PlayPauseButton");
		button.animationFinished();
	}
}
