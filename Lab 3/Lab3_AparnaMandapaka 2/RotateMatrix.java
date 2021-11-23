package dataStructures;
import java.io.*;
public class RotateMatrix {
//the following method solves the question 1 problem
	public static void question1(int mar[][], int n) {
		int a[][] = new int[n][n];
		for(int i = 0; i < n; i++) {
			
		
		for(int j = 0; j < n; j++ )
		{
			a[i][(n-1) - j]= mar[j][i];
		}
	}
		for(int i = 0; i < n; i++)
		{
			for(int j = 0; j < n; j++)
			{
				mar[i][j]=a[i][j];
			}
		}
	}
	//the following method solves for question 2
	//the below method reduces the space requriment
	//the space complexity for question 2 is O(1)
	public static void question2(int n, int matrix[][])
	{
		//the following code is when two things or elements changes places with others 
		//it basically transposes 
		for(int i = 0; i < n; i++)
		{
			for(int j = i; j < n; j++)
			{
				//var is a temporary variable
				//var contains current cell
				int var = matrix[i][j];
				matrix[i][j] = matrix[j][i];
				matrix[j][i]= var;
			}
		}
		for(int i = 0; i < n; i++)
		{
			int li =0; //li means left index or top
			int ri = n-1; //ri means right index or bottom
			while(li<ri)
			{
				int var = matrix[i][li];
				matrix[i][li] = matrix[i][ri];
				matrix[i][ri] = var;
				li++;
				ri--;
			}
		}
	}
	public static void printmatrix(int mar[][],int n)
	{
		for(int i = 0; i < n; i++)
		{
			for(int j = 0; j < n; j++)
			{
				System.out.print(mar[i][j] + " ");
			}
			System.out.println();
			
		}
	}
	
	public static void main(String[] args)throws IOException {
		// TODO Auto-generated method stub
		//using the BufferedReader to read the input from the user 
BufferedReader in= new BufferedReader(new InputStreamReader(System.in)); //this command interacts with the user 
System.out.println("Enter the number of rows in the matrix");
int n = Integer.parseInt(in.readLine()); //reads the user input
System.out.printf("Enter the matrix elements: ");
int mar[][] = new int[n][n]; //reads or takes in the elements that are entered by user
for(int i = 0; i < n; i++)
{
	for(int j = 0; j < n; j++)
	{
		mar[i][j] = Integer.parseInt(in.readLine());
		
	}
}
System.out.println("Enter 1 for choosing Question 1\nEnter 2 for choosing Question 2");
int option = Integer.parseInt(in.readLine()); //prompts the user to pick the question or the way they want to solve the problem 
if(option==1)//if the user picks option 1 to solve the problem 
{
	question1(mar,n);//this goes to the question1 method and does calculations
	
}
else
{
	question2(n,mar);//if the user picked question 2 to solve problem, then it goes to the question2 method and solves the problem in a question2 way
}
printmatrix(mar,n);
	}

}

//For the space and time complexity it is better to use solution 2 compare to solution 1
//because if we calculate the time and space complexity of the second solution
//Time complexity of 2nd solution is O(n*n) and the space complexity is O(1)
//solution 2 is prefered if there is a shortage of space 
//I would prefer the solution two since it takes less space and time compare to the first solution
//based on the observation the solution 1 is worst and solution 2 is the best 