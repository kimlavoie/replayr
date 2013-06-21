import java.util.ArrayList;
import java.util.Scanner;
import java.io.File;
import java.util.Comparator;
import java.util.Arrays;

public class XMLManager{
	private ArrayList<String> XMLList = new ArrayList<String>();
	private final String DIRECTORY_PATH = "../XML";
	
	public XMLManager(){
		loadXMLList();
	}
	
	private void loadXMLList(){
		File dir = new File(DIRECTORY_PATH);
		File files[] = dir.listFiles();
		Arrays.sort( files, new Comparator<File>()
			{
				public int compare(File f1, File f2) {
					
					String filename1 = f1.getName();
					String numberString1 = filename1.substring(0, filename1.indexOf('.'));
					int n1 = Integer.parseInt(numberString1);
					
					String filename2 = f2.getName();
					String numberString2 = filename2.substring(0, filename2.indexOf('.'));
					int n2 = Integer.parseInt(numberString2);

					if (n1 > n2) {
						return +1;
					} else if (n1 < n2) {
						return -1;
					} else {
						return 0;
					}
				}

			});
		for(File file: files){
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
