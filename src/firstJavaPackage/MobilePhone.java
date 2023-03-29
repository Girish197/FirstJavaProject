package firstJavaPackage;

public class MobilePhone {
	
	String brandName;
	
	int modelNumber;
	
	String operatingSysytem;
	
	int ram;
	
	int storageCapacity;
	
	double screenSize;
	
	boolean isCameraPresent;
	
	void makeCall() {
		System.out.println ("making calls from" + brandName + " mobile");
		
	}

	void sendText() {
		System.out.println ("send text from" + brandName + "mobile");
		
	}
	
	void takePhoto() {
		System.out.println ("photo can be taken if camera is present. Camara is present:" + isCameraPresent);
		
	}
	
}
