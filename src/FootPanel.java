import javax.swing.JPanel;
import javax.swing.BoxLayout;
import javax.swing.Box;
import java.awt.Dimension;

public class FootPanel extends JPanel{
	public FootPanel(){
		this.setLayout(new BoxLayout(this, BoxLayout.Y_AXIS));
		this.add(Box.createRigidArea(new Dimension(10,20)));
		this.add(new ControlPanel());
		this.add(Box.createRigidArea(new Dimension(10,20)));
		//this.add(new InfoPanel());
	}
}
