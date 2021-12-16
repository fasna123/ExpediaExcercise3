package com.ibs.Expedia.LeetCode;

import java.util.HashSet;

public class HashSetToArray {

	public static void main(String[] args) {
		HashSet<Integer> hs = new HashSet<Integer>();
		hs.add(1);
		hs.add(2);
		hs.add(3);
		hs.add(4);
		hs.add(5);
		
		System.out.println("HashSet Elements:"+hs);
		
		int[] strArr = new int[hs.size()];
		int i = 0;
		
		for(int ele:hs) {
			strArr[i++] = ele;
		}
		
		System.out.println("Array Elements:\n");
		for(int ele : strArr) {
			System.out.println(ele);
		}

	}

}
