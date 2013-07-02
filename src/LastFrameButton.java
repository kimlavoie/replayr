import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class LastFrameButton extends JButton implements ActionListener{
	public LastFrameButton(){
		this.setText("Last frame");
		this.setMnemonic('l');
		this.addActionListener(this);
	}
	
	public void actionPerformed(ActionEvent e){
		FrameSpinner frameSpinner = (FrameSpinner) ComponentRegistry.getRegistry().getComponent("FrameSpinner");
		frameSpinner.setValue(frameSpinner.getMax());
	}
}
