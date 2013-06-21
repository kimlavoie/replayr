import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.text.DefaultCaret;
import java.awt.Dimension;
import java.awt.Point;

public class XMLPanel extends JScrollPane{
	private XMLManager XMan = new XMLManager();
	private JTextArea text = new JTextArea();
	
	public XMLPanel(){
		ComponentRegistry.getRegistry().registerComponent("XMLPanel", this);
		text.setEditable(false);
		DefaultCaret caret = (DefaultCaret) text.getCaret();
		caret.setUpdatePolicy(DefaultCaret.NEVER_UPDATE);
		this.setPreferredSize(new Dimension(100, 300));
		this.getViewport().add(text);
		text.setText(XMan.getXMLString(0));
	}
	
	public void changeXML(int frame){
		text.setText(XMan.getXMLString(frame - 1));
	}
}
