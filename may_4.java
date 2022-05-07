package assignment_dsa;
import java.util.*;
/*
 * 	"Find the squares of a sorted array
https://www.geeksforgeeks.org/sort-array-converting-elements-squares/

Sum of Unique elements
https://leetcode.com/problems/sum-of-unique-elements/
 */
public class may_4 {
	 public static void main(String[] args)
	    {
	        int arr[] = { -6, -3, -1, 2, 4, 5 };
	              sortSquares(arr);
	              int A[] = {1, 4, 2, 1, 5, 2, 3, 2};
	 	         sumOfDistinctElements(A);
	 	   
	    }
	 
	 
	 //1.Find the squares of a sorted array
	 public static void sortSquares(int arr[])
	    {
	        int n = arr.length;
	 
	        for (int i = 0; i < n; i++)
	            arr[i] = arr[i] * arr[i];
	        Arrays.sort(arr);
	        System.out.println(Arrays.toString(arr));
	    }
	 
	 
	 //2.Sum of Unique elements
	public static void sumOfDistinctElements(int A[])
	     {
	         int n = A.length;
	         int sum = 0;
	         for (int i = 0; i < n; i++)
	         {
	             for (int j = 0; j <= i; j++)
	             {
	                 if (j == i)
	                 {
	                     sum += A[i];
	                 }
	                 if (A[i] == A[j])
	                 {
	                     break;
	                 }
	             }
	         }
	         System.out.println("Sum of distinct Elements in the array is: " + sum);
	         return;
	    
	 }

}
