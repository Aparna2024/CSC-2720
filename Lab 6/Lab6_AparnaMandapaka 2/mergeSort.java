package lab3;
import java.util.*;

public class mergeSort {
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

		//a Merge sort method is created to sort the arrays in ascending order

		//this method has the time complexity of O(n^2) and space complexity of O(1)


		private static int[] mergeSort(int[] array) {
		if(array.length <= 1) { //this statement works as recursive control
		return array;
		}
		int midpoint = array.length / 2; //midpoint is the midpoint of the initial array passed
		int [] left = new int [midpoint];
		int [] right;
		if(array.length % 2 == 0) {
		//if the array.length could be divided by two then int right would be initialized
		right = new int[midpoint];

		}else {
		right = new int[midpoint + 1];

	}
		
		for(int i = 0; i < midpoint; i++) { //this populates both left and right array
		left[i] = array[i]; //this populates left array
	}
		
		for(int j = 0; j < right.length; j++) {
		right[j] = array[midpoint+j]; //right array will be initialized with correct values

	}
		
		int[] result = new int[array.length]; //contains new integer array
		left = mergeSort(left);
		right = mergeSort (right);
		return result = merge(left, right);
	}
		
		private static int[] merge(int[] left, int[] right) { //merges the left and right array
			
		int[] result = new int[left.length + right.length];//initialized pointers for each array
		int leftPointer, rightPointer, resultPointer;
		leftPointer = rightPointer = resultPointer = 0;
		while(leftPointer < left.length || rightPointer < right.length) {

		//checking if both the left and the right arrays have elements in them

		if(leftPointer < left.length && rightPointer < right.length) { //if elements are there, then it compares left array with right array
		if(left[leftPointer] < right[rightPointer]) {
		result[resultPointer++] = left[leftPointer++];
		}else {
		result[resultPointer++] = right[rightPointer++];

		}
	}

		//to reiterate if there are only elements in the left array and then you take the element in left array and assign it to the result with result pointer

		else if(leftPointer < left.length) {
		result[resultPointer++] = left[leftPointer++];

	}
		//to reiterate if there are only elements in the right array and then you take the element in right array and assign it to the result with result pointer

		else if(rightPointer < right.length) {
		result[resultPointer++] = right[rightPointer++];
		}
	}
		return result;

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
		array = mergeSort(array);
		deDuplicate(array.length,array);
		}
		
}
