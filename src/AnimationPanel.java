import javax.swing.JPanel;
import java.awt.Graphics;
import java.awt.Image;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;

public class AnimationPanel extends JPanel{	
	public AnimationPanel(){
		ComponentRegistry.getRegistry().registerComponent("AnimationPanel", this);
	}
	
	public void paintComponent(Graphics g){
		try {
		  Image img = ImageIO.read(new File("../Images/image2.bmp"));
		  g.drawImage(img, 0, 0, this.getWidth(), this.getHeight(), this);
		} catch (IOException e) {
		  e.printStackTrace();
		}
	}
}
