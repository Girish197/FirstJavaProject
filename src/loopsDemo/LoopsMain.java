package loopsDemo;

import java.util.Scanner;

public class LoopsMain {
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//LoopsExample whileLoop = new LoopsExample();
		//whileLoop.number = 0;
		//whileLoop.print10SuccessiveNumbers();
		
		
		ForLoopExample forLoop = new ForLoopExample();
		forLoop.actualPIN = 1234;
		
		forLoop.withdrawAmount = 500;
		forLoop.checkPinIsCorrect();
	}

}
