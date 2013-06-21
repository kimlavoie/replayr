import javax.swing.JSpinner;
import javax.swing.SpinnerNumberModel;

public class FPSSpinner extends JSpinner{
	private int start = 1;
	private int minimum = 1;
	private int maximum = 60;
	
	public FPSSpinner(){
		ComponentRegistry.getRegistry().registerComponent("FPSSpinner", this);
		this.setModel(new SpinnerNumberModel(start, minimum, maximum, 1));
	}
}
