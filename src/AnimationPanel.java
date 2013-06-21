import javax.swing.JPanel;
import java.awt.Graphics;
import java.awt.Image;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;

public class AnimationPanel extends JPanel{
	AnimationFrameManager AniMan = new AnimationFrameManager();
	Image img;
		
	public AnimationPanel(){
		ComponentRegistry.getRegistry().registerComponent("AnimationPanel", this);
		img = AniMan.getFrame(0);
	}
	
	public void paintComponent(Graphics g){
		  g.drawImage(img, 0, 0, this.getWidth(), this.getHeight(), this);
	}
	
	public void changeFrame(int frameNumber){
		img = AniMan.getFrame(frameNumber - 1);
		this.repaint();
	}
	
	public int getNumberOfFrame(){
		return AniMan.getNumberOfFrame();
	}
}
