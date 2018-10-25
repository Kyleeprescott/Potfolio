package Program3;
import java.util.Scanner;

public class LoanCalculations {
/*
 * kylee prescott
 * 10/18
 */
	public static void main(String[] args) {
		// import scanner 
		Scanner input = new Scanner(System.in);
		// declare variables 
		double loanamount;                   
		double monthlyInterestRate;
		double numberOfYears ;
		
		// user input 
		System.out.println("Enter the monthly intrest rate");
		monthlyInterestRate =  input.nextDouble();
		System.out.println("Enter the amount of years you want to pay loan off in ");
		numberOfYears = input.nextDouble();
		System.out.println("Enter loan amount");
		loanamount = input.nextDouble();
		
		//calculations
		monthlyInterestRate = monthlyInterestRate/1200;
		double monthlyPayment = loanamount*monthlyInterestRate/(1-1/Math.pow(1+monthlyInterestRate,numberOfYears*12));
		double total = monthlyPayment*12* numberOfYears;
		
		//display output
		System.out.println("Your monthly payment is "+ monthlyPayment+"");
		System.out.println("Your total amount of payments are  "+total+"");
		
	}

}
