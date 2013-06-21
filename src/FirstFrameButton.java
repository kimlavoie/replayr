import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class FirstFrameButton extends JButton implements ActionListener{
	public FirstFrameButton(){
		this.setText("First frame");
		this.addActionListener(this);
	}
	
	public void actionPerformed(ActionEvent e){
		FrameSpinner frameSpinner = (FrameSpinner) ComponentRegistry.getRegistry().getComponent("FrameSpinner");
		frameSpinner.setValue(frameSpinner.getMin());
	}
}
