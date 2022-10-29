package methodd;

import java.util.Scanner;
public class Calculatorwithmethod {

	public static void main(String[] args) {
		double first, second, result;
		char optr;
		
		Scanner scan = new Scanner(System.in); 
		
		System.out.print("Enter a 1st number: ");
		first = scan.nextDouble();
		System.out.print("Enter a 2nd number: ");
		second = scan.nextDouble();
		System.out.println("Choose Operator: ");
		System.out.println("[+] Add [-] Subtract [*] Multiply [/] Divide");
		System.out.print("Operator: ");
		optr = scan.next().charAt(0);
		
		result = calculate(optr, first, second);
		System.out.print("Result: "+ result);
	}
	
	static double calculate(char operator, double firstNumber, double secondNumber) {
		double result = 0.0;
		
		switch(operator) {
		case '+':
			result = add(firstNumber, secondNumber);
			break;
		case '-':
			result = subtract(firstNumber, secondNumber);
			break;
		case '*':
			result =  multiply(firstNumber, secondNumber);
			break;
		case '/':
			result =  divide(firstNumber, secondNumber);
			break;
		default: 
		    break;
		}
		
		return result;
	}
	
	static double add(double firstNumber, double secondNumber) {
		return firstNumber + secondNumber;
	}
	
	static double subtract(double firstNumber, double secondNumber) {
		return firstNumber - secondNumber;
	}

	static double multiply(double firstNumber, double secondNumber) {
		return firstNumber * secondNumber;
	}

	static double divide(double firstNumber, double secondNumber) {
		if(secondNumber == 0) {
			System.out.print("Cannot Divided to zero" + "\n");
		}
		return firstNumber / secondNumber;
	}

}
