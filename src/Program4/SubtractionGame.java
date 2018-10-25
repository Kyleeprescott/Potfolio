package Program4;
import java.util.Scanner;

public class SubtractionGame {
/*
 * kylee prescott
 * 10/18
 */
	public static void main(String[] args) {
		int x=1;
		while(x==1) {
	
	Scanner input = new Scanner(System.in);
	int num1 =(int)(System.currentTimeMillis() % 10 );
	int num2 = (int)(System.currentTimeMillis()/7 %10 );
	int answer;
	int total;
	
	
    
   
    if(num1 > num2){
    System.out.println(+num1+"-"+num2);
    total = num1-num2;

	answer = input.nextInt();
    
}
else {
	System.out.println(num2+"-"+num1);
	
	  total = num2-num1;

		answer = input.nextInt();
        
    		
}
    if(answer == total) {
    	System.out.println("thats correct!!!");
    
    }
    else {
    	System.out.println("thats wrong!!");
    	System.out.println(" the correct answer is:"+total);
    	x=0;
    	

    }
    
    
}
		System.out.println("Gameover");
}

}
