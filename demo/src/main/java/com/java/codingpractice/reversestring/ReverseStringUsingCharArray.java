package com.java.codingpractice.reversestring;

public class ReverseStringUsingCharArray {
	
	public static void main (String[] args) {
		
		String str = "Monisha";
		char[] chars = str.toCharArray();
		int length = chars.length;
		for(int i=length-1; i>=0 ; i--) {
			System.out.print(chars[i]);
			
			
		}
		
	}

}
