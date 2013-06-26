import java.util.Scanner;
import java.io.File;

public class XMLManager{
	private final String DIRECTORY_PATH = ".tmp/XML";
	private String currentXML;
	
	public String loadXML(int frame){
		try{
			currentXML = new Scanner( new File(DIRECTORY_PATH + "/" + String.valueOf(frame) + ".xml"), "UTF-8" ).useDelimiter("\\Z").next();
		} catch (Exception e){}
		
		return currentXML;
	}
}
