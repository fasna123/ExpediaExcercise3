package com.ibs.Expedia.LeetCode;

public class StringRevItr {

	public static void main(String[] args) {
		String str = "LeetCode";
		StringBuilder strbfr = new StringBuilder();
		for(int i=str.length()-1;i>=0;i--) {
			strbfr.append(str.charAt(i));
		}
		System.out.println(strbfr);

	}

}
