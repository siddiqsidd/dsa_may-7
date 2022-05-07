package assignment_dsa;
import java.awt.*;
import java.util.*;
/*
 * 	"1. Encrypt the string - 2
https://practice.geeksforgeeks.org/problems/encrypt-the-string-21117/1/

2. Roatating the String check
https://practice.geeksforgeeks.org/problems/check-if-string-is-rotated-by-two-places-1587115620/1"
 */
public class may_6 {
	
	public static void main(String[] args)
	{
		String S = "abc";
		int N = S.length();

		System.out.println(encryptString(S, N));

		String str1 = "AACD";
		String str2 = "ACDA";

		if (areRotations(str1, str2))
			System.out.println("Strings are rotations of each other");
		else
			System.out.printf("Strings are not rotations of each other");
	
	}

	
	// * 	"1. Encrypt the string - 2
		static String convertToHex(int num)
		{

			StringBuilder temp = new StringBuilder();
			while (num != 0) {
				int rem = num % 16;
				char c;
				if (rem < 10) {
					c = (char) (rem + 48);
				}
				else {
					c = (char) (rem + 87);
				}
				temp.append(c);
				num = num / 16;
			}

			return temp.toString();
		}

		static String encryptString(String S, int N)
		{

			StringBuilder ans = new StringBuilder();

				for (int i = 0; i < N; i++) {

				char ch = S.charAt(i);
				int count = 0;
				String hex;
				while (i < N && S.charAt(i) == ch) {

					count++;
					i++;
				}
				i--;

				hex = convertToHex(count);
				ans.append(ch);
				ans.append(hex);
			}

			ans.reverse();
			return ans.toString();
		}
		
		//2. Roatating the String check
		static boolean areRotations(String str1, String str2)
			{
				return (str1.length() == str2.length()) &&
					((str1 + str1).indexOf(str2) != -1);
			}
			
		


	}




