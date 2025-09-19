package com.java.codingpractise.demo;

import java.util.HashSet;
import java.util.Set;

public class FindPairSumToTarget {
	
	// Find all pairs in an array that sum to a target.

	public static void main(String[] args) {
		int[] arr = {2, 4, 3, 7, 5, 8};
		findPairs(arr,10);
	}

	private static void findPairs(int[] arr,int target) {
		Set<Integer> seen = new HashSet<>();
		Set<String> pairs = new HashSet<>();
		
		for(int num : arr) {
			int complement = target-num;
			if(seen.contains(complement)) {
				int min = Math.min(num, complement);
				int max = Math.max(num, complement);
				pairs.add("("+min+","+max+")");
			}
			
			seen.add(num);
			
		}
		
		System.out.println(pairs);
		
	}

}
