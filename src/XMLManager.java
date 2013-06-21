import java.util.ArrayList;
import java.util.Scanner;
import java.io.File;

public class XMLManager{
	private ArrayList<String> XMLList = new ArrayList<String>();
	private final String DIRECTORY_PATH = "../XML";
	
	public XMLManager(){
		loadXMLList();
	}
	
	private void loadXMLList(){
		File dir = new File(DIRECTORY_PATH);
		for(File file: dir.listFiles()){
			try{
				XMLList.add(new Scanner(file).useDelimiter("\\Z").next());
			} catch (Exception e){
				
			}
		}
	}
	
	public String getXMLString(int index){
		return XMLList.get(index);
	}
}
