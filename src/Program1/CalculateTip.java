package Program1;
import java.util.Scanner;

public class CalculateTip {
	/*
	 * kylee prescott
	 * 10/18
	
	 */

		public static void main(String[] args) {
			Scanner input = new Scanner(System.in);
			
			//user input
			System.out.println("Enter your subtotal");
			double subtotal = input.nextDouble();
			System.out.println("Enter your gratuity rate as a percentage");
			double gratuityRate = input.nextDouble();
			
			// calculations
			double gratuityAmount = (gratuityRate/100)*subtotal;
	        double total = (subtotal+gratuityAmount);
	        //display output
	        System.out.println("Your gratuity amount is $"+gratuityAmount+" ");
	        System.out.println("Your total amount will be $"+total+"  ");
		}

	}

