import javax.swing.JPanel;
import javax.swing.BoxLayout;
import javax.swing.Box;
import javax.swing.JLabel;
import java.awt.Dimension;

public class InfoPanel extends JPanel{
	public InfoPanel(){
		this.setLayout(new BoxLayout(this, BoxLayout.X_AXIS));
		this.add(new JLabel("Name: Greater Than 7"));
		this.add(Box.createRigidArea(new Dimension(50,20)));
		this.add(new JLabel("Spec.: GreaterThan7.ltlfo"));
	}
}
