package firstJavaPackage;

public class PenMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Pen StudioPen = new Pen();
		StudioPen.brandName = "Studio";
		StudioPen.modelName = "StudioInk";
		StudioPen.nibSize = 0.7;
		StudioPen.isRubberGripPresent = true;
		StudioPen.writeInPaper();
		StudioPen.writeInDifferentObjects();
		StudioPen.easyWriting();
		
		System.out.println();
		
		
			
		
		
	}

}
