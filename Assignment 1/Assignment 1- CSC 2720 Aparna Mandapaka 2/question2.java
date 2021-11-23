package CSCLab;
import java.util.ArrayList;
public class question2 {
	

	public static void main(String[] args) {
		
		//defining the first array
		
	       int[] arr1 = { 1, 5, 6, 6, 9, 9, 9, 11, 11, 21 };
	       
	     //defining the second array
	       
	       int[] arr2 = { 6, 6, 9, 11, 21, 21, 21 };
	       
	       ArrayList<Integer> newarray = new ArrayList<Integer>(10);
	       for (int i = 0; i < arr1.length; i++) {
	    	   
	           if (i < arr1.length - 1 && arr1[i] == arr1[i + 1]) {
	              
	        	   continue;
	        	   
	           } else {
	        	   
	               boolean found = binarySearch(arr2, 0, arr2.length, arr1[i]);
	            
	               //this operation is performed if the element was not present over the second array for the current index
	       		
	               if (found == true)
	                   newarray.add(arr1[i]);

	           }
	           
	         //test case: since the code has the array values that are hardcoded, the code would not sort or find common elements if they are negative or elements 
	         //that are previously not listed in array 1 and array 2
	       }
	       for (int i = 0; i < newarray.size(); i++) {
	    	   
	           System.out.print(newarray.get(i) + " "); //prints out the result for the array
	       }
	     //the time complexity of the code is O(mlogn), m is the size of the first array and n
	       
	   }
	
	//this operation is performed if the element was not present over the second array for the current index
	
	//when traversing every element of the first array the time is O(m) and the binary search over the second array is O(logn)
			//so O(m)*O(longn) = O(mlogn)

			//the following method performs the binary search over the second array
	
	//the method below is the O(mlogn), where we would be traversing each element of the first array
	
			//if the element are not equal then the binary search is used on second array to find the same elements in the first array as the second array

	
	   private static boolean binarySearch(int arr[], int le, int ri, int element) {
	       if (ri >= le ) {
	    	   
	           int middle = le + (ri - le) / 2; //calculates the middle

	           // If the element is present at the middle itself
	           
	           if (arr[middle] == element)
	        	   
	               return true;
	           
	         //if the elements in the first array are there in the second array then the binary search returns true
	           

	           // If element is smaller than middle, then it can only be present in left subarray
	          
	           if (arr[middle] > element)
	        	   
	               return binarySearch(arr, le, middle - 1, element);

	           
	           return binarySearch(arr, middle + 1, ri, element);
	       }

	       // We reach here when element is not present in array
	       return false;
	       
	     //test case: since there is no user input in this code, its unlikely that the user will enter a negative or null values
			//therefore, even if the user tries to enter the values, the console wouldn't take it or read it because there is no method
			//that can read or take in the user values. 
	   }
	   
	   
	 //Question 3 answer: solution 2 can be improved by finding the intersection point between the array by creating a variable like "k" to keep track of the elements that are present in the first array.
	 		//Since the both arrays are sorted already we can set x = 0, y = 0, k = 0. x will be the index of array 1 and y will be the index of array 2 and k will be the index of array 3. if array1[i] < array[j], then the "i" is incremented by 1
	 		//if array1[x] > array[y]. then y will be incremented by 1, if array1[x] == array[y], then we check if arrau1[x] already exists in array 3[k]. If the array is not present then we will insert array3 and increment x,y, and k by 1. And these steps can be repeated until x==array1.length or y ==array2.length
	 		//To solve the problem with linear complexity O(m+n) and space complexity of O(1), we can basically find an intersection point  and store the results from it and create a variable that keeps track of the elements and traverse it through arrays
	 		//if the common element is found, we increment the values of x and y. If the current element in the first array is smaller than the second array the x increases, if the current element in the second array is larger then the y value increases.




	}

