import javax.swing.JFrame;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class MainWindow extends JFrame{
	public MainWindow(){
		this.setTitle("Replayr");
		this.setSize(1000, 600);
		this.setLocationRelativeTo(null);
		this.setContentPane(new MainPanel());
		this.setVisible(true);
		this.addWindowListener(new WindowAdapter() {
        public void windowClosing(WindowEvent winEvt) {
            Folder.delete(".tmp");
            System.exit(0);
        }
    });
	}
	
	
}
