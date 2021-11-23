package CSCLab;

public class Question1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//defining the first array
		
				int arr1[] = {1, 5, 6, 6, 9, 9, 9, 11, 11, 21};
				
				//defining the second array
				
				int arr2[] = {6, 6, 9, 11, 21, 21, 21};
				int size;
				if(arr1.length < arr2.length) {
					size = arr1.length;
				}
				else {
					size = arr2.length;
				}
				
				//this declares the result of an array
				
				int arr[] = new int[size];
				int x = 0;
				int temp = -1;
				
				//test case: since the code has the array values that are hardcoded, the code would not sort or find common elements if they are negative or elements 
				//that are previously not listed in array 1 and array 2
				
				//this is the loop with the time complexity of O(m*n)
				
				for(int i = 0; i < arr1.length; i++) {
					for(int j = 0; j < arr2.length; j++) {
						if(arr2[j] == arr1[i] && arr2[j] != temp && arr1[i] != temp) {
							arr[x] = arr2[j];
							temp = arr[x];
							x++;
						}
					}
					
					//test case: since there is no user input in this code, its unlikely that the user will enter a negative or null values
					//therefore, even if the user tries to enter the values, the console wouldn't take it or read it because there is no method
					//that can read or take in the user values. 
				}
				
				//prints out the result for the array
				
				for(int i = 0; i < arr.length; i++) {
					if(arr[i] > 0) {
						System.out.println(arr[i]);
					}
				}
				
				//the sorted arrays have the time complexity of O(m*n)

			}

		}
