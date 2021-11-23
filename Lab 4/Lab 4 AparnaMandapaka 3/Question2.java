package dataStructures;
import java.util.*;
import java.lang.*;
import java.io.*;

public class Question2 {
	public static int deduplicate(int arr[], int n) {
		int new_n = 1;
		for(int i =1; i < n; i++)
		{
			if(arr[i] != arr[i-1])
				arr[new_n++] = arr[i];
		}
		return new_n;
	}
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the Array size: ");
		int n = input.nextInt();
		int[]Array = new int[n];
		System.out.print("Enter the Array Elements: ");
		for(int i = 0; i < n; i++)
			Array[i] = input.nextInt();
		n = deduplicate(Array,n);
		
		for(int i = 0; i < n; i++)
		{
			System.out.print(Array[i] + " ");
		}
	}
	//in the following the original array is modified so that the extra space is not used 
	//this code has O(1) space complexity
	//and has O(n) time complexity 
}