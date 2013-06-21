import javax.swing.JPanel;
import javax.swing.BoxLayout;
import javax.swing.JLabel;
import javax.swing.JSpinner;
import javax.swing.SpinnerNumberModel;

public class FramePanel extends JPanel{
	private JSpinner spinner;
	
	public FramePanel(){
		this.setLayout(new BoxLayout(this, BoxLayout.Y_AXIS));
		this.add(new JLabel("Frame #"));
		spinner = new JSpinner(new SpinnerNumberModel(1, 1, 300,1));
		this.add(spinner);
		spinner.addChangeListener(new FrameSpinnerListener());
	}
}
