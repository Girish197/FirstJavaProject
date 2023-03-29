package firstJavaPackage;

public class Laptop {
	
	String brandName;
	int processor;
	String modelName;
	int ScreenSize;
	int storage;
	boolean isCameraPresent;
	
	void playGames() {
		System.out.println ("play games from" + brandName + "laptop");
		
		}
	
	void playMovies() {
		System.out.println ("play movies from" + brandName + "laptop");
		
	}
	
	void browseInternet() {
		System.out.println ("browse internet"+ brandName + "laptop");
	}

	void storeDocuments() {
		System.out.println ("store documents in" + brandName + "laptop");
				
	}
	void zoomCall(){
		System.out.println ("zoomCall if camera present. Camera is present" + isCameraPresent);
		
		
	

	}
}
