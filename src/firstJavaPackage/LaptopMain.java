package firstJavaPackage;

public class LaptopMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Laptop Dell = new Laptop();
		Dell.brandName = "Dell";
		Dell.processor = 5;
		Dell.modelName = "inspiron";
		Dell.ScreenSize = 15;
		Dell.storage = 16;
		Dell.isCameraPresent = true;
		Dell.playGames();
		Dell.playMovies();
		Dell.browseInternet();
		Dell.storeDocuments();
		Dell.zoomCall();
		
		System.out.println();
		
		
		
	}

}
