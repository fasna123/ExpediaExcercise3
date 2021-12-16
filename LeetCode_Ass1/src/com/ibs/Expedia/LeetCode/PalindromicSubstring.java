package com.ibs.Expedia.LeetCode;

//A Java solution for longest palindrome
import java.util.*;

class PalindromicSubstring{

//Function to print a subString str[low..high]
static void printSubStr(String str, int low, int high)
{
	for (int i = low; i <= high; ++i)
		System.out.print(str.charAt(i));
}

//This function prints the
//longest palindrome subString
//It also returns the length
//of the longest palindrome
static int longestPalSubstr(String str)
{
	// get length of input String
	int n = str.length();

	// All subStrings of length 1
	// are palindromes
	int maxLength = 1, start = 0;

	// Nested loop to mark start and end index
	for (int i = 0; i < str.length(); i++) {
		for (int j = i; j < str.length(); j++) {
			int flag = 1;

			// Check palindrome
			//System.out.println("i: "+i);
			//System.out.println("jjjj: "+j);
			for (int k = 0; k < (j - i + 1) / 2; k++) 
				//System.out.println("j: "+j);
				if (str.charAt(i + k) != str.charAt(j - k))
					
					//System.out.println("i: "+i);
					//System.out.println("j: "+j);
					flag = 0;
			

			// Palindrome
			if (flag!=0 && (j - i + 1) > maxLength) {
				start = i;
				maxLength = j - i + 1;
			}
		}
	}

	System.out.print("Longest palindrome subString is: ");
	printSubStr(str, start, start + maxLength - 1);

	// return length of LPS
	return maxLength;
}

//Driver Code
public static void main(String[] args)
{
	String str = "neen";
	System.out.print("\nLength is: "
		+ longestPalSubstr(str));
}
}

//This code is contributed by shikhasingrajput
