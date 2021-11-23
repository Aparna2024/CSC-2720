package Lab5;
import java.util.*;

public class BubbleSortLab5 {
	public static int[] UserInput() {
		
		//takes the input from the user 
		
		Scanner input = new Scanner(System.in);
		System.out.print("Enter the size of the array: ");
		int n = input.nextInt();
		int[]array = new int[n];
		
		//stores the input values from the array 
		
		System.out.println("Enter the elements of the array");
		for(int i = 0; i<n; i++) {
			array[i] = input.nextInt();
			
			//Test case if the user input negative value or 0 the code will still take in the values and creates array from ascending to descending order 
		
		}
		return array;
	}

	//a Bubble sort method is created to sort the arrays in ascending order

	//this method has the time complexity of O(n^2) and space complexity of O(1)

	public static int[] BubbleSort(int array[]) {
		int var; //temporary variable is created to swap the values 
		for(int i =0; i<array.length-1; i++) {
			for(int j = 0; j < array.length-i-1; j++) {
				if(array[j] > array[j+1]) {
					
					//swaps the two elements if the first one is larger than the other
					var = array[j];
					array[j]= array[j+1];
					array[j+1]=var;
				}
			}
				
			}
		return array; //displays and returns the array that is sorted
		}
	public static void deDuplicate(int x, int array[]) {
		
		//initializes element index
		
		int j = 1;
		
		   //goes through the sorted array to find the unique array element 

	    // looping till size -1 iterations, so the last index element will be avoided

	    //the method is O(n) time complexity

	    //the method is also O(1) space complexity as it creates an integer variable and uses the original array to rearrange the numbers 
		for(int i = 1; i < x; i++) {
			if(array[i] != array[i-1]) {
				array[j++] = array[i];
				
				//test case if array size is 1 or less than 1 the code takes in the values of the negative integers and still deduplicates them
				
			}
		}
		// prints the de-duplicated array
		
		for(int i = 0; i < j; i++) {
			System.out.println(array[i] + " ");
		}
	}
	public static void main(String[] args) {
		int array[] = UserInput();
		BubbleSort(array);
		deDuplicate(array.length,array);
	}
	}





