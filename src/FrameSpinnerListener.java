import javax.swing.event.ChangeListener;
import javax.swing.event.ChangeEvent;
import javax.swing.JPanel;
import javax.swing.JScrollPane;

public class FrameSpinnerListener implements ChangeListener{
	private JPanel animationPanel;
	private JScrollPane xmlPanel;
	
	public FrameSpinnerListener(){
		animationPanel = (JPanel) ComponentRegistry.getRegistry().getComponent("AnimationPanel");
		xmlPanel = (JScrollPane) ComponentRegistry.getRegistry().getComponent("XMLPanel");
	}
	
	public void stateChanged(ChangeEvent e){
		//TODO
	}
}
