package com.ibs.Expedia.LeetCode;
import java.util.*;
public class AlphaDigit {
	
	
	  public static  String reformat(String s) {
	        
	        StringBuilder alphas=new StringBuilder();
	        StringBuilder digs=new StringBuilder();
	        
	        for(int i=0;i<s.length();i++){
	            char ch=s.charAt(i);
	            if(ch>='0' && ch<='9')digs.append(ch);
	            else alphas.append(ch);
	        }
	        
	        int alen=alphas.length();
	        int dlen=digs.length();
	        
	        int diff=Math.abs(alen-dlen);
	        if(diff>1)return "";
	        
	        StringBuilder ans=new StringBuilder();
	        
	        boolean flag=false;
	        if(alen-dlen==1)flag=true;
	        
	        int j=0,k=0;
	        for(int i=0;i<s.length();i++){
	            if(flag){
	                ans.append(alphas.charAt(j++));
	            }else{
	                ans.append(digs.charAt(k++));
	            }
	            flag=!flag;
	        }
	        return ans.toString();
	    }
	  
	    public static void main(String args[]){
	        
	    String str="covid2019";
	    String ans=reformat(str);
	    System.out.println(ans);
	    }
	}

