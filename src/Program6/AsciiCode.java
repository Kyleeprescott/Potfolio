package Program6;
import java.util.Scanner;
//import the scanner method 
/*
 * kylee prescott
 * 1/9/2019
 * convert ascii code to the symbols that are registered to that ascii code 
 */

public class AsciiCode {

	public static void main(String[] args) {
		// call up the scanner so we can get  user input
				Scanner input= new Scanner(System.in);
				// print statment to ask the question
			System.out.println("Enter a ASCII code");
			//declare the variables 
			int asciiNum= input.nextInt();
			char X = (char)asciiNum;
			// print out the result 
			System.out.println(X);

	}

}
