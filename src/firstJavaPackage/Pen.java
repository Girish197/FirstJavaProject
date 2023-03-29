package firstJavaPackage;

public class Pen {

	String brandName;
	String modelName;
	double nibSize;
	boolean isRubberGripPresent;
	
	void writeInPaper() {
		System.out.println ("write in paper" + brandName + "pen");
		
	}
	void writeInDifferentObjects() {
		System.out.println ("write in different objects" + brandName + "pen");
		
	}
	void easyWriting() {
		System.out.println ("easy writing if rubber grip is available. rubber grip present" + isRubberGripPresent);
		
	}
}
