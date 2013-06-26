import javax.swing.JPanel;
import javax.swing.BoxLayout;

public class FootPanel extends JPanel{
	public FootPanel(){
		this.setLayout(new BoxLayout(this, BoxLayout.Y_AXIS));
		this.add(new ControlPanel());
		//this.add(new InfoPanel());
	}
}
