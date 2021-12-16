package com.ibs.Expedia.LeetCode;

import java.util.HashSet;

public class RetainAll {

	public static void main(String[] args) {
		HashSet<Integer> hs = new HashSet<Integer>();
		hs.add(1);
		hs.add(2);
		hs.add(3);
		hs.add(4);
		hs.add(5);
		
    for(int ele:hs) {
    	System.out.println("Elements in first HashSet 1 :"+ele);
    }
    
    HashSet<Integer> hs2 = new HashSet<Integer>();
    hs2.add(1);
	hs2.add(2);
	hs2.add(3);
    
	for(int ele2:hs2) {
    	System.out.println("Elements in first HashSet 2 :"+ele2);
    }
	
	hs.retainAll(hs2);
	
	for(int ele3:hs) {
    	System.out.println("Elements common in both HashSet:"+ele3);
    }
	

	}

}
