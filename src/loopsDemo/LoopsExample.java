package loopsDemo;

public class LoopsExample {

	int number;
	int finalNumber = number + 20;
	
	void print10SuccessiveNumbers() {
		
		while (number <= finalNumber) {
			System.out.println(number);
			number += 2;
			
		}
	}
}
