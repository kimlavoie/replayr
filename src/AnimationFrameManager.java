import java.util.ArrayList;
import java.util.Scanner;
import java.util.Comparator;
import java.util.Arrays;
import java.io.File;
import java.awt.Image;
import javax.imageio.ImageIO;

public class AnimationFrameManager{
	private final String DIRECTORY_PATH = ".tmp/Images";
	private Image currentImage;

	
	public Image loadFrame(int frame){
		File file = new File(DIRECTORY_PATH + "/" + String.valueOf(frame) + ".bmp");
		if(!file.exists()){
			file = new File(DIRECTORY_PATH + "/" + String.valueOf(frame) + ".jpg");
			if(!file.exists()){
				file = new File(DIRECTORY_PATH + "/" + String.valueOf(frame) + ".png");
			}
		}
		
			
		try{
			currentImage = ImageIO.read(file);
		} catch (Exception e){
			e.printStackTrace();
		}
		
		return currentImage;
	}
	
	
	public int getNumberOfFrame(){
		File dir = new File(DIRECTORY_PATH);
		File files[] = dir.listFiles();
		int max = 0;
		
		for(File file: files){
			String filename = file.getName();
			String numberString = filename.substring(0, filename.indexOf('.'));
			int tested = Integer.parseInt(numberString);
			
			if(tested > max){
				max = tested;
			}
		}
		return max;
	}
	
}
