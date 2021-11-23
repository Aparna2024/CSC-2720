package GuessMyNumber;

import java.util.Scanner;

public class PersonalizedHelloWorld {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	     Scanner in = new Scanner(System.in);
	     //asks user for name
	        System.out.println("What is your name?");
	        String name;
	        while (true) {
	            System.out.print("Please enter your name: ");
	            name = in.nextLine(); //reads the users input
	            if(name.length() > 0) {
	                break; //if the input is null or empty re-directs user to the same question
	            }
	        }
	        System.out.println("Hello, " + name + "!");
	    }
	}
	