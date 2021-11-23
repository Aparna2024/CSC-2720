package lab3;
import java.util.*;

public class quickSort {
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



		private static void QuickSort(int[] arr, int left, int right) {
			
		int index = partition(arr, left, right); //partitions the array around the left and the right side of the pivot value

		//the partition is going to return the partition points, returns the dividing point from the right and left side

		if(left < index -1)
		QuickSort(arr, left, index-1); //sorts from the left side of the array
		if(index < right)
		QuickSort(arr, index, right); //sorts from the right side of the array

	}
		private static int partition(int[] arr, int left, int right) {
		// the partition method moves starting from the left side and right side simultaneously

		//moves the pointers towards each other

		int pivot = arr[(left + right)/2]; //picks a pivot element in the center
		while(left <= right) {
		while(arr[left]< pivot)

		//moves left until it finds an element out of order

		//it looks for an element on the left part that is bigger than the pivot

		left++;
		while(arr[right] > pivot)

		//moves right until it finds an element out of order

		//it looks for an element on the right that is bigger than pivot

		right--;

		if(left <= right) {

		//if the left side is less than or equal to right then it swaps the elements

		int temp = arr[left];
		arr[left] = arr[right];
		arr[right]= temp;
		left++;
		right--;

		//by the end of while loop the elements will be in right order

		//the elements smaller than the pivot before all and the elements bigger than the pivot
	}
		}
		return left; //returns the partition point
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
		QuickSort(array, 0, array.length - 1); //prints the sorted out array
		deDuplicate(array.length,array); //prints the de-duplicated arrays
	}
 		}


