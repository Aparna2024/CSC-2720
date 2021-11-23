package dataStructures;

public class Rearranging1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int arr[] = {0, 1, 1, 0, 1, 2, 1, 2, 0, 0, 0, 1};
int i,j;
for(i=0; i<arr.length;i++) {
	for(j=1+i; j<arr.length; j++) {
		if(arr[i]>arr[j]) {
		  int s = arr[i];
		  arr[i]= arr[j];
		  arr[j]=s;
		}
	}
}
		for(i=0; i<arr.length;i++) {
		  System.out.print(arr[i] + " ");
	  }
	}
}