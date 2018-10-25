package Program2;
import java.util.Scanner;

public class ChinesePredicter {

	public static void main(String[] args) {
		// user input
		Scanner  input = new Scanner(System.in);
		System.out.println("Enter the year you were born:");
		//declare variables 
		int year = input.nextInt();
		// calculations
		switch (year % 12) {
		//display output 
		case 0:
		System.out.println("You are a Monkey");
		System.out.println( "Changeablity without being constans leads to foolishness.");
		System.out.println("Attribute: changeability ");
		break;
		case 1:
			System.out.println("You are a Rooster");
			System.out.println(" Being constant without changeability leads to woodnness.");
			System.out.println("Attribute: being constant ");
			break;
		case 2:
			System.out.println("You are a Dog.");
			System.out.println("Fidelity without amiability leads to rejection. ");
			System.out.println("Attribute: Fidelity ");
			break;
		case 3:
			System.out.println("You are a Pig.");
			System.out.println(" Amiability without fidelity leads to immorality.");
			System.out.println("Attribute:  Amiability");
			break;
		case 4:
			System.out.println("You are a Rat.");
			System.out.println(" Wisdom without industriousness leads to triviality.");
			System.out.println("Attribute:  Wisdom");
			break;
		case 5:
			System.out.println("You are a Ox.");
			System.out.println(" Industriousness without wisdom leads to futility.");
			System.out.println("Attribute:  Industriousness");
			break;
		case 6:
			System.out.println("You are a Tiger.");
			System.out.println(" Valor without caution leads to recklessness.");
			System.out.println("Attribute: Valor");
			break;
		case 7:
			System.out.println("You are a Rabbit.");
			System.out.println("Caution without valor leads to cowardice.");
			System.out.println("Attribute: Caution");
			break;
		case 8:
			System.out.println("You are a Dragon.");
			System.out.println(" Strength without flexibility leads to fracture.");
			System.out.println("Attribute: Strength");
			break;
		case 9:
			System.out.println("You are a Snake.");
			System.out.println("Flexibility without strength leads to compromise. ");
			System.out.println("Attribute: Flexibilty ");
			break;
		case 10:
			System.out.println("You are a Horse.");
			System.out.println("Forging ahead without unity leads to abandonment.");
			System.out.println("Attribute: Forging ahead");
			break;
		case 11:
			System.out.println("You are a Goat.");
			System.out.println("Unity without forging ahead leads to stagnation. ");
			System.out.println("Attribute: Unity");
			break;
		
		
			
			
			
		}		
			
		
	}

}
