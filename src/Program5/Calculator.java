package Program5;
import java.util.Scanner;

public class Calculator {
/*
 * kylee prescott
 * 10/18
 */
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		//get 2 numbers from our user 
		System.out.println("Enter the first value");
		double num1 =input.nextDouble(); 
		System.out.println(" Enter the second value");
		double num2 =input.nextDouble();
		// get the operator 
		System.out.println("Do you want + - * / or %");
		String opp = input.next();
		
		String plus ="+";
		
		double total = 0;
		//test input 
		if (opp.equals("+") ) {
			 total = num1 + num2;
		}
		 else if   (opp.equals("-") ){
			total = num1 - num2;
		}
		 else if (opp.equals ("*")) {
			 total = num1 * num2;
		 }
		 else if (opp.equals ("/")) {
			 total = num1 / num2;
		 }
		 else if (opp.equals("%")) {
			 total = num1 % num2;
		 }
		 else {
			 System.out.println(" That wasn't an opperator");
		 }
	
		
		
	
				
		// do calculations 
		
		//print the output 
		System.out.println("Your total:"+total);
	

	}

}
