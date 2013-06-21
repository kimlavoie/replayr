import javax.swing.JFrame;

public class MainWindow extends JFrame{
	public MainWindow(){
		this.setTitle("Replayr");
		this.setSize(1000, 600);
		this.setLocationRelativeTo(null);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setContentPane(new MainPanel());
		this.setVisible(true);
	}
}
