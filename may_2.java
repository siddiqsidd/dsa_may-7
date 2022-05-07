package assignment_dsa;
import java.util.*;
import java.util.Arrays;
import java.util.stream.Collectors;

/*
 * 	"1. Find the second minimum element in the array -> Come up with two appoaches and find which is best

2. Find the frequency of each String in the array

 */
public class may_2 {
	//1. Find the second minimum element in the array 
	public static void main(String args[]){  
		int a[]={1,2,5,6,3,2};  
		int b[]={44,66,99,77,33,2,55};  
        String[] ans = {"India", "australia", "india", "japan"};
		System.out.println("Second Smallest: "+getSecondSmallest(a,6));
		System.out.println("Second Smallest: "+getSecondSmallest1(b,6));
		frequency(ans);
		}
	
	//2. Find the frequency of each String in the array

	private static void frequency(String[] ans) {
		var freqCaseInSensitive = Arrays.stream(ans).collect(Collectors.groupingBy(String::toLowerCase, Collectors.counting()));
        System.out.println(freqCaseInSensitive);
    	
	}


	//1.1
		public static int getSecondSmallest(int[] a, int total){  
		Arrays.sort(a);  
		return a[1];  
		}//T.C =O(nlogn)
		
		
	//1.2
		public static int getSecondSmallest1(int[] a, int total){  
			int temp;  
			for (int i = 0; i < total; i++)   
			        {  
			            for (int j = i + 1; j < total; j++)   
			            {  
			                if (a[i] > a[j])   
			                {  
			                    temp = a[i];  
			                    a[i] = a[j];  
			                    a[j] = temp;  
			                }  
			            }  
			        }  
			       return a[1];  
			} //T.C=O(n^2) 
		
}
