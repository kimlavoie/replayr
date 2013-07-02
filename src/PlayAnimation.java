import java.awt.event.ActionEvent;

public class PlayAnimation implements Runnable{
	boolean animate;
	
	public void run(){
		FrameSpinner frameSpinner = (FrameSpinner) ComponentRegistry.getRegistry().getComponent("FrameSpinner");
		FPSSpinner fpsSpinner = (FPSSpinner) ComponentRegistry.getRegistry().getComponent("FPSSpinner");
		animate = true;
		long timeBefore = System.currentTimeMillis();
		while((Integer) frameSpinner.getValue() < frameSpinner.getMax() && animate){
			long timeAfter = System.currentTimeMillis();
			long delta = timeAfter - timeBefore - (1000 / ((Integer)fpsSpinner.getValue()));
			if( delta > 0 ){
				frameSpinner.setValue(((Integer) frameSpinner.getValue()) + 1);
				timeBefore = System.currentTimeMillis() - delta;
			}
		}
		PlayPauseButton button = (PlayPauseButton) ComponentRegistry.getRegistry().getComponent("PlayPauseButton");
		button.animationFinished();
	}
	
	public void stopAnimation(){
		animate = false;
	}
}
