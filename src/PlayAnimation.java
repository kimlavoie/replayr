import java.awt.event.ActionEvent;

public class PlayAnimation implements Runnable{
	boolean animate;
	
	public void run(){
		FrameSpinner frameSpinner = (FrameSpinner) ComponentRegistry.getRegistry().getComponent("FrameSpinner");
		FPSSpinner fpsSpinner = (FPSSpinner) ComponentRegistry.getRegistry().getComponent("FPSSpinner");
		animate = true;
		double timeBefore = System.currentTimeMillis();
		while((Integer) frameSpinner.getValue() < frameSpinner.getMax() && animate){
			double timeAfter = System.currentTimeMillis();
			double delta = timeAfter - timeBefore - (1000.0 / (double)((Integer)fpsSpinner.getValue()));
			if( delta > 0 ){
                timeBefore = System.currentTimeMillis() - delta;
				frameSpinner.setValue(((Integer) frameSpinner.getValue()) + 1);
			}
            else{
                try{
                    Thread.sleep((int) -delta);
                } catch (Exception e){
                    e.printStackTrace();
                }
            }
		}
		PlayPauseButton button = (PlayPauseButton) ComponentRegistry.getRegistry().getComponent("PlayPauseButton");
		button.animationFinished();
	}
	
	public void stopAnimation(){
		animate = false;
	}
}
