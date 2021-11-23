package dataStructures;
import java.io.*;
import java.util.*;
public class addingNumber {

	public static void sum(int[] arr, int n)
    {
        int i = n;
      
        if (arr[i] < 9) {
            arr[i] = arr[i] + 1;
            return;
        }
        arr[i] = 0;
        i--;
        sum(arr, i);
    }
	 public static void main(String[] args)
    {
        addingNumber obj = new addingNumber();
        int j = 4;
        int arr[] = {0, 1, 9, 8, 9};
        obj.sum(arr, j);
        if (arr[0] > 0)
            System.out.print(arr[0] + ", ");
        int i;
        for (i = 1; i <= j; i++) {
            System.out.print(arr[i]);
   
            if (i < j)
                System.out.print("");
        }
    }
}