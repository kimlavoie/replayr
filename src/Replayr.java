public class Replayr{
	public static void main(String argv[]){
		Unzip unZip = new Unzip();
		unZip.unZip(argv[0], ".tmp");
		MainWindow mainWindow = new MainWindow();
		Folder.delete(".tmp");
	}
}
