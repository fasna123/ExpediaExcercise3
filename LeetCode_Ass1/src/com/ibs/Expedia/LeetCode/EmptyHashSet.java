package com.ibs.Expedia.LeetCode;

import java.util.HashSet;

public class EmptyHashSet {

	public static void main(String[] args) {
		HashSet<Integer> hs = new HashSet<Integer>();
		hs.add(1);
		hs.add(2);
		hs.add(3);
		hs.add(4);
		hs.add(5);
		
	System.out.println("First HashSet before clearing is : "+hs);
	
	hs.clear();
	
	System.out.println("Second hashSet After Clearing :" +hs);
	
	}

}
