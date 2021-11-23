package GuessMyNumber;

import java.util.Scanner;


public class GuessMyNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner sc = new Scanner(System.in);
	       System.out.println("Enter n: ");
	       int n = sc.nextInt();
	       while(n<=0)
	       {
	       //gets input from the user
	       System.out.println("Enter a positive integer for n: ");
	       n = sc.nextInt();
	       }
	       System.out.println("Welcome to Guess My Number!");
	       System.out.println("Please think of a number between 0 and "+(n-1)+".");
	       int lowerBound=0,upperBound=n-1;
	       String c;
	       int guess;
	       do
	       {
	       guess = (int)Math.ceil(((lowerBound+upperBound)/2)+0.5);
	       System.out.println("Is your number: "+guess+"?"); //guesses the user number
	       System.out.println("Please enter C for correct, H for too high, or L for too low.");
	       System.out.println("Enter your response (H/L/C): "); //asks user to confirm if the number is high or low or correct 
	       c=sc.next();
	       while(!(c.equals("H")||c.equals("L")||c.equals("C")))
	       {
	       sc.nextLine();
	       System.out.println("Enter your response (H/L/C): ");
	       c=sc.next();      
	       }
	       //validation of character entered by user
         while(!(c.equals("H") || c.equals("L") || c.equals("C"))){//if the input from user is not "H" or "L" or "C", re-directs user the question
             System.out.println("Enter a valid letter!");
             c = sc.next();
         }
	       if(c.equals("H"))
	       {
	       upperBound=(lowerBound+upperBound)/2;
	       }
	       else if(c.equals("L"))
	       {
	       lowerBound=(lowerBound+upperBound)/2;
	       }
	       }while(!c.equals("C")&&guess!=0&&guess!=n-1);
	       System.out.println("Thank you for playing Guess My Number!");
	   }
}