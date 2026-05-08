package com.sliding.sol;

import java.util.Deque;
import java.util.LinkedList;

public class SlidingWindowMaximum {

	public static int[] maxSlidingWindow(int[] nums, int k) {
	
		//Approach 1
	 int n = nums.length;
	 int[] result = new int[n-k+1];
	 
	 for(int i=0;i<=n-k;i++) {
		 int max = nums[i];
		 
		 for(int j=i;j<i+k;j++) {
			 max = Math.max(max, nums[j]);
		 }
		 
		 result[i] = max;
	 }
		
		
	 return result;       
	}
	
	public static int[] maxSlidingWindowApp2(int[] nums, int k) {
		
	 int[] result = new int[nums.length-k+1];
	 Deque<Integer> deque = new LinkedList<Integer>();
	 int index=0;
	 
	 for(int i=0;i<nums.length;i++) {
		 
		 
		 // 1. Remove out-of-window elements
		 if(!deque.isEmpty() && deque.peekFirst()==i-k) {
			 deque.pollFirst();
		 }
		 
		 // 2. Remove smaller elements from back
		 while(!deque.isEmpty() && nums[deque.peekLast()]<nums[i]) {
			 deque.pollLast();
		 }
		 
		  // 3. Add current index
		 deque.offerLast(i);
		 
		 // 4. Add max to result
		 if(i >= k-1) {
			 result[index++] = nums[deque.peekFirst()];
		 }
	 }
	 
	 
	 return result;
	}
}
