public class Replayr{
	public static void main(String argv[]){
		Unzip unZip = new Unzip();
		if(argv.length > 0){
			unZip.unZip(argv[0], ".tmp");
		}
		else{
			unZip.unZip("ressources.zip", ".tmp");
		}
		MainWindow mainWindow = new MainWindow();
		
	}
}
