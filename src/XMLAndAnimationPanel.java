import javax.swing.JPanel;
import javax.swing.BoxLayout;

public class XMLAndAnimationPanel extends JPanel{
	public XMLAndAnimationPanel(){
		this.setLayout(new BoxLayout(this, BoxLayout.X_AXIS));
		this.add(new AnimationPanel());
		this.add(new XMLPanel());
	}
	
	
}
