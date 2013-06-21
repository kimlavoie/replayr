import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class PlayPauseButton extends JButton implements ActionListener{
	private boolean stateIsPause = true;
	Thread animationThread;
	
	public PlayPauseButton(){
		ComponentRegistry.getRegistry().registerComponent("PlayPauseButton", this);
		this.setText("Play");
		this.addActionListener(this);
	}
	
	public void animationFinished(){
		animationThread.interrupt();
		this.setText("Play");
		stateIsPause = true;
	}
	
	public void actionPerformed(ActionEvent e){
		// TODO
		if(stateIsPause){
			this.setText("Pause");
			stateIsPause = false;
			animationThread = new Thread(new PlayAnimation());
			animationThread.start();
		}
		else{
			this.setText("Play");
			stateIsPause = true;
			animationThread.interrupt();
		}
	}
}
