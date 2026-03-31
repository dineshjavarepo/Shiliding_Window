package com.sliding.sol;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

public class KSizedSubArrayMax {

	 public static ArrayList<Integer> maxOfSubarrays(int[] arr, int k) {
	        // code here
	        
		 Set<Integer> set = new HashSet<Integer>();
		 ArrayList<Integer> result = new ArrayList<Integer>();
		 
		 for(int i=0;i<k;i++) {
			 set.add(arr[i]);
		 }
		 
		 result.add(Collections.max(set));
		 
		 int release =0;
		 
		 for(int right=k;right<arr.length;right++) {
			 
			 set.remove(arr[release]);
			 set.add(arr[right]);
			 result.add(Collections.max(set));
			 release++;
			 
		 }
		 
		 
		 return result;
		 
	    }
}
