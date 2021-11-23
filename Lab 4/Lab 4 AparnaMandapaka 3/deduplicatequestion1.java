
package dataStructures;
import java.util.*;
import java.lang.*;
import java.io.*;

public class deduplicatequestion1 {
	
	public static int deduplicate(int arr[], int n)
	{
		int[] x = new int[n];
		x[0] = arr[0];
		int new_n = 1;
		
		for(int i = 1; i < n; i++) {
			
			if(arr[i] != arr[i-1])
				x[new_n++] = arr[i];
		}
		
		for(int i = 0; i < new_n; i++)
			arr[i] = x[i];
		return new_n;
	}
	
	public static void main(String[] args)throws java.lang.Exception {
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter the Array size: ");
		
		//allows the user to enter the array elements 
		
			int n = input.nextInt();
			int[]Array = new int[n];
				System.out.print("Enter the Array Elements: ");
				
			//changing the original arrays 
				
			for(int i =0; i < n; i++)
			Array[i] = input.nextInt();
			n = deduplicate(Array, n);
		 System.out.println("Output after de-duplication of elements: ");
		
		 //displays the de-duplicated array elements 
		 
		 for(int i = 0; i < n; i++)
		{
			System.out.print( + Array[i] + " ");
		}
			
		// TODO Auto-generated method stub

	}

}
//the time complexity for the following code is O(n)
//the space complexity for the following code is O(n)
