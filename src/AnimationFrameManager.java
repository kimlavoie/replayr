import java.util.ArrayList;
import java.util.Scanner;
import java.util.Comparator;
import java.util.Arrays;
import java.io.File;
import java.awt.Image;
import javax.imageio.ImageIO;

public class AnimationFrameManager{
	private ArrayList<Image> frameList = new ArrayList<Image>();
	private final String DIRECTORY_PATH = "../Images";
	
	public AnimationFrameManager(){
		loadFrameList();
	}
	
	private void loadFrameList(){
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
				frameList.add(ImageIO.read(file));
				System.out.println(file.getName());
			} catch (Exception e){
				
			}
		}
	}
	
	public Image getFrame(int index){
		return frameList.get(index);
	}
}
