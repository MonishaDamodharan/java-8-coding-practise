package com.java.codingpractice.reversestring;

public class ReverseByStringBuilder {
	
	public static void main (String[] args) {
		
		String s = "Monisha";
		String s1 = new StringBuilder(s).reverse().toString();
		System.out.println(s1);
	}


}
