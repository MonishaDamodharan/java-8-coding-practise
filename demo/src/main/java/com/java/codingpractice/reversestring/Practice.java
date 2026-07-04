package com.java.codingpractice.reversestring;

import java.util.Stack;

public class Practice {
	
	

    public static void main(String[] args) {
        String str = "Monisha";
        Stack<Character> stack = new Stack<>();
        for(char ch: str.toCharArray() ) {
        	stack.push(ch);
        }
        
        while(!stack.isEmpty()) {
        	System.out.print(stack.pop());
        }
        
        
    }
	

}
