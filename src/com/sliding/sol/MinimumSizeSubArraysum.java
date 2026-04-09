package com.sliding.sol;

public class MinimumSizeSubArraysum {

	 public static int minSubArrayLen(int target, int[] nums) {
		 
		 int sum=0;
		 int minLen=Integer.MAX_VALUE;
		 int l=0;
		 for(int i=0;i<nums.length;i++) {
			 sum += nums[i];
			 
			 while(sum >= target) {
				 minLen = Math.min(i-l+1, minLen);
				 sum -=nums[l];
				 l++;
			 }
		 }
		 
		 return minLen == Integer.MAX_VALUE ? 0 : minLen;
	  }
	
}
