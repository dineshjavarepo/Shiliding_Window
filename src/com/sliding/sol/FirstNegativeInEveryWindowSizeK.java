package com.sliding.sol;

import java.util.ArrayList;
import java.util.List;
import java.util.TreeSet;

public class FirstNegativeInEveryWindowSizeK {

	public static List<Integer> firstNegInt(int arr[], int k) {
        // write code here
		
		TreeSet<Integer> set = new TreeSet<Integer>();
		List<Integer> result = new ArrayList<Integer>();
		
		
		for(int i=0;i<k;i++) {
			set.add(arr[i]);
		}
		
		int left=0;
		
		for(int right=k;right<arr.length;right++) {
			
			result.add(set.getFirst());
			
			set.remove(left);
			set.add(arr[right]);
			left++;
			
		}
		
		
		return result;
        
    }
}
