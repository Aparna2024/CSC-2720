package GuessMyNumber;
import java.util.Scanner;
public class guesspt3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 int n;
	       Scanner sc = new Scanner(System.in);
	       System.out.print("Enter n: ");
	       n = sc.nextInt();
	       while(n<=0)
	       {
	           System.out.print("Enter a positive integer for n : ");
	           n = sc.nextInt();
	          
	       }
	       System.out.print("Welcome to Guess My Number!");
	       System.out.println("Please think of number between 0 and "+ (n-1));
	       guessMyNumber(0,(n-1),n);
	      
	   }
	   public static void guessMyNumber(int lowerBound , int upperBound,int n)//i is low an j is high
	   {
	       Scanner input = new Scanner(System.in);
	       char response;
	       if(lowerBound==upperBound)//every recursive DAC approach must have termination condition
	       {
	           System.out.println("Is your number: "+lowerBound+"?");
	           System.out.println("Please enter C for correct, H for too high, or L for too low.");
	           System.out.print("Enter your response(H/L/C): ");
	           response = input.next().charAt(0);
	           //validation of character entered by user
	           while((response!='C')&&(response!='H')&&(response!='L'))
	           {
	               System.out.print("Enter your response(H/L/C): ");
	               response = input.next().charAt(0);
	           }
	           if(response=='C')
	               System.out.println("Thanks you playing Guess my Number!");
	           else
	               System.out.println("ERROR! The number you have thinked is not in range of 0 to "+(n-1));
	              
	              
	          
	       }
	       else
	       {
	           int m =(int) Math.ceil(((double)(lowerBound+upperBound))/2.0);//here (0+31)/2 = 15.5 , so , ceil(15.5) = 16
	           System.out.println("Is your number: "+m+"?");
	           System.out.println("Please enter C for correct, H for too high, or L for too low.");
	           System.out.print("Enter your response(H/L/C): ");
	           response = input.next().charAt(0);
	           //validation of character entered by user
	           while((response!='C')&&(response!='H')&&(response!='L'))
	           {
	               System.out.print("Enter your response(H/L/C): ");
	               response = input.next().charAt(0);
	           }
	           if(response=='C')
	                   System.out.println("Thanks you playing Guess my Number!");
	           else if(response=='H')//means too high then we have to go in lower side
	        	   guessMyNumber(lowerBound,m-1,n);
	           else
	        	   guessMyNumber(m+1,upperBound,n);
	                  
	              
	          
	           }
	   }

	
	}


