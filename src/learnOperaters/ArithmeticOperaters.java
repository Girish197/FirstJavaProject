package learnOperaters;

public class ArithmeticOperaters {

	int num1;
	int num2;
	
	void sumOfNumbers() {
		int sum = num1 + num2;
		System.out.println("Sum of" + num1 + "and" + num2 + "is" + sum);
		
	}
	
	void differenceOfNumbers() {
		int difference = num1 - num2;
		System.out.println(" difference of" + num1 + "and" + num2 + "is" + difference);
				
	}
	
	void productOfNumbers() {
		int product = num1 * num2;
		System.out.println("product of" + num1 + "and" + num2 + "is" + product);
		
	}
	
	void divisionOfNumbers() {
		int quotient = num1 / num2;
		System.out.println("quotient of" + num1 + "and" + num2 + "is" + quotient);
		int remainder = num1 % num2;
		System.out.println("remainder of" + num1 + "and" + num2 + "is" + remainder);
		
	}
	
}
