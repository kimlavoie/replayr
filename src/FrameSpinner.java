import javax.swing.JSpinner;
import javax.swing.JPanel;
import javax.swing.event.ChangeListener;
import javax.swing.event.ChangeEvent;
import javax.swing.SpinnerNumberModel;

public class FrameSpinner extends JSpinner implements ChangeListener{
	private int start = 1;
	private int minimum = 1;
	private int maximum = 300;
	
	public FrameSpinner(){
		ComponentRegistry.getRegistry().registerComponent("FrameSpinner", this);
		this.setModel(new SpinnerNumberModel(start, minimum, maximum, 1));
		this.addChangeListener(this);
	}
	
	public int getMin(){return minimum;}
	public int getMax(){return maximum;}
	
	public void stateChanged(ChangeEvent e){
		AnimationPanel animationPanel = (AnimationPanel) ComponentRegistry.getRegistry().getComponent("AnimationPanel");
		animationPanel.changeFrame((Integer) this.getValue());
	}
}
