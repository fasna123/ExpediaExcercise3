package com.ibs.Expedia.LeetCode;

public class Solution2 {

	public static void main(String[] args) {
		
		
		char[] word = {'h','e','l','l','o'};
		int i = 0;
		int j = word.length-1;
		
		while(i<j) {
			char t = word[i];
			word[i] = word[j];
			word[j] = t;
			
			i++;
			j--;
			
			
			
		}
		System.out.println(word);
		
		
	}

}
