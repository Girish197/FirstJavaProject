package firstJavaPackage;

public class MobileMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MobilePhone iPhone = new MobilePhone();
		iPhone.brandName = "iPhone";
		iPhone.modelNumber = 13;
		iPhone.operatingSysytem = "ios";
		iPhone.ram = 16;
		iPhone.storageCapacity = 128;
		iPhone.screenSize = 6.1;
		iPhone.isCameraPresent = true;
		iPhone.makeCall();
		iPhone.sendText();
		iPhone.takePhoto();
		System.out.println("********************************************************");

		MobilePhone Samsung = new MobilePhone();
		Samsung.brandName = "Samsung";
		Samsung.modelNumber = 20;
		Samsung.operatingSysytem = "android";
		Samsung.ram = 16;
		Samsung.storageCapacity = 128;
		Samsung.isCameraPresent = true;
		Samsung.screenSize = 6.7;
		Samsung.makeCall();
		Samsung.sendText();
		Samsung.takePhoto();

	}

}
