import javax.swing.JPanel;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.Box;
import java.awt.Dimension;

public class ControlPanel extends JPanel{
	public ControlPanel(){
		this.setLayout(new BoxLayout(this, BoxLayout.X_AXIS));
		this.add(Box.createRigidArea(new Dimension(10,20)));
		this.add(new FramePanel());
		this.add(Box.createRigidArea(new Dimension(10,20)));
		this.add(new FirstFrameButton());
		this.add(Box.createRigidArea(new Dimension(10,20)));
		this.add(new PlayPauseButton());
		this.add(Box.createRigidArea(new Dimension(10,20)));
		this.add(new LastFrameButton());
		this.add(Box.createRigidArea(new Dimension(10,20)));
		this.add(new FPSPanel());
		this.add(Box.createRigidArea(new Dimension(10,20)));
	}
}
