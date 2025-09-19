package com.java.codingpractise.demo;

import java.util.HashSet;
import java.util.Set;

public class FindDuplicateInteger {
	
	// Write a function in Java to find duplicate numbers in an integer array.
	
	public static Set<Integer> findDuplicates(int[] arr) {
		Set<Integer> seen = new HashSet<>();
		Set<Integer> duplicates = new HashSet<>();
		for(int num : arr) {
			if(!(seen.add(num))) {
				duplicates.add(num);
			}
			
		}
		return duplicates;
		
	}

	public static void main(String[] args) {
		int[] arr = {1, 2, 3, 1, 2, 4};
		System.out.println(findDuplicates(arr));

		
		

	}

}

