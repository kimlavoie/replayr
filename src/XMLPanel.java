import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import java.awt.Dimension;

public class XMLPanel extends JScrollPane{
	private XMLManager XMan = new XMLManager();
	private JTextArea text = new JTextArea();
	
	public XMLPanel(){
		ComponentRegistry.getRegistry().registerComponent("XMLPanel", this);
		text.setEditable(false);
		this.setPreferredSize(new Dimension(100, 300));
		this.getViewport().add(text);
		text.setText(XMan.getXMLString(1));
	}
}
