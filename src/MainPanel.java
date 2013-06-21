import javax.swing.JPanel;
import java.awt.BorderLayout;

public class MainPanel extends JPanel{
	public MainPanel(){
		this.setLayout(new BorderLayout());
		this.add(new XMLAndAnimationPanel(), BorderLayout.CENTER);
		this.add(new FootPanel(), BorderLayout.SOUTH);
	}
	
	
}
