package com.sliding.sol;

import java.util.HashSet;

public class ContinousDulicateII {

	public static boolean containsNearbyDuplicate(int[] nums, int k) {

		HashSet<Integer> set = new HashSet<Integer>();
		
		for (int i = 0; i < nums.length; i++) {
			
			if(set.contains(nums[i])) {
				return true;
			}
			
			set.add(nums[i]);
			
			if(i>=k) {
				set.remove(i-k);
			}
		}

		return false;
	}

}
