import javax.swing.JScrollPane;
import java.awt.Graphics;
import java.awt.Image;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;

public class XMLPanel extends JScrollPane{
	public XMLPanel(){
		ComponentRegistry.getRegistry().registerComponent("XMLPanel", this);
	}
}
