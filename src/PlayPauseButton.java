import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class PlayPauseButton extends JButton implements ActionListener{
	private boolean stateIsPause = true;
	
	public PlayPauseButton(){
		this.setText("Play");
		this.addActionListener(this);
	}
	
	public void actionPerformed(ActionEvent e){
		// TODO
		if(stateIsPause){
			this.setText("Pause");
			stateIsPause = false;
		}
		else{
			this.setText("Play");
			stateIsPause = true;
		}
	}
}
