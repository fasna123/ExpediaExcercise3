package com.ibs.Expedia.LeetCode;

import java.util.Stack;

class Solution1 {
	
		
	
public static void main(String[] args) {
    
        Stack<Character> stack = new Stack<>();
       
        String s = "Hello";
        for(int i=0;i<s.length();i++){
            
            char c = s.charAt(i);
            
            //If the top of the stack is equal to the current character we pop that element from the stack.
            if(!stack.isEmpty() && stack.peek()==c){
                stack.pop();
            }
            //else we add that character into the stack
            else{
                stack.add(c);
            }
            
            
            
        }
        //We will store the characters in an stringbuilder.
        StringBuilder sb = new StringBuilder("");
        
        
        while(!stack.isEmpty()){
            sb.append(stack.pop());
            
        }
               
        
        String x = String.valueOf(sb);        
        
        //as we get the reverse output from the stack , 
        reverse(x);
    }
    
    
    //Reverse a string 
    private static void reverse(String s){
        
        char[] ar = s.toCharArray();
        
        int left = 0;
        int right = ar.length-1;
        
        while(left<right){
            
            char c = ar[right];
            ar[right] = ar[left];
            ar[left] = c;
            
            left++;
            right--;            
            
        }     
        
        //return new String(ar);
        System.out.println(ar);
          
    }
     
    
}
