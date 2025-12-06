package com.java.codingpractise.demo;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class GroupAnagrams {
	
//	public static List<List<String>> groupAnagrams(String[] strs) {
//		if(strs == null || strs.length ==0) return new ArrayList();
//		
//	}
//
//	public static void main(String[] args) {
//		String[] input = {"eat", "tea", "tan", "ate", "nat", "bat"};
//		List<List<String>> anagrams = groupAnagrams(input);
//
//	}
	
	
	public static void findDuplicates(int[] inputArray) {
		Set<Integer> nonDuplicates = new HashSet<>();
		ArrayList<Integer> duplicates = new ArrayList<>();
		
		for(int num : inputArray) {
			if(!(nonDuplicates.add(num))) {
				
				duplicates.add(num);
			}
			
		}
		System.out.println(duplicates);
		
	}
	
	public static void main(String args[]){
		
		int[] inputArray = {1, 2, 3, 1, 2, 4};
		findDuplicates(inputArray);
		
	}

}
