package practiceprogram;
import java.util.Scanner;
public class Practice1 {

	public static void main(String[] args) {
		Scanner Scan = new Scanner(System.in);
		
		int FirstNumber, SecondNumber, Operator;
		System.out.println("Enter the First Number: ");
		FirstNumber = Scan.nextInt();
		System.out.println("Enter the Second Number: ");
		SecondNumber = Scan.nextInt();
		System.out.println("--- Choose Operator --- ");
		System.out.println("1. Addition 2. Subtraction 3. Multiplication 4. Division");
		System.out.println("You Choose: ");
		Operator = Scan.nextInt();
		
		switch(Operator){
		
		case 1:
			Operator = FirstNumber + SecondNumber;
			System.out.println("The Answer is" + FirstNumber + "+" + SecondNumber + "=" + Operator);
			break;
			
		case 2:
			Operator = FirstNumber + SecondNumber;
			System.out.println("The Answer is" + FirstNumber + "-" + SecondNumber + "=" + Operator);
			break;
		case 3:
			Operator = FirstNumber + SecondNumber;
			System.out.println("The Answer is" + FirstNumber + "*" + SecondNumber + "=" + Operator);
			break;
		
		case 4:
			if(SecondNumber == 0) {
		
				System.out.println("Cannot be Divided to Zero!");
				
			}
			else {
				Operator = FirstNumber + SecondNumber;
				System.out.println("The Answer is" + FirstNumber + "/" + SecondNumber + "=" + Operator);
				break;
			}
			
		
		}
		}
}