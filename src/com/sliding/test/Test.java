package com.sliding.test;

import com.sliding.sol.ContinousDulicateII;
import com.sliding.sol.CountDistictElementInArray;
import com.sliding.sol.FirstNegativeInEveryWindowSizeK;
import com.sliding.sol.KSizedSubArrayMax;
import com.sliding.sol.LargeSubStringWithDistinctCharacters;
import com.sliding.sol.LongestSubStringWithKDistincyCharacters;
import com.sliding.sol.MaxSubArrayOfSizeK;
import com.sliding.sol.MinSubArraySizeSum;
import com.sliding.sol.MinimumSizeSubArraysum;
import com.sliding.sol.SlidingWindowMaximum;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println(CountDistictElementInArray.countDistinct(new int[] {1, 2, 1, 3, 4, 2, 3}, 4));
        System.out.println(LargeSubStringWithDistinctCharacters.longestUniqueSubstr("geeksforgeeks"));
        System.out.println(MaxSubArrayOfSizeK.maxSubarraySum(new int[] {100, 200, 300, 400}, 2));
        System.out.println(FirstNegativeInEveryWindowSizeK.firstNegInt(new int[] {-8, 2, 3, -6, 10}, 2));
        System.out.println(KSizedSubArrayMax.maxOfSubarrays(new int[] {1, 2, 3, 1, 4, 5, 2, 3, 6}, 3));
		System.out.println(MinSubArraySizeSum.minSubArrayLen(7,new int[] {2,3,1,2,4,3}));
        System.out.println(ContinousDulicateII.containsNearbyDuplicate(new int[] {1,2,3,1}, 3));
        System.out.println(LongestSubStringWithKDistincyCharacters.kDistinctChars(2, "abbbbbbc"));
        System.out.println(SlidingWindowMaximum.maxSlidingWindow(new int[] {1,2,1,0,4,2,6}, 3));
        System.out.println(MinimumSizeSubArraysum.minSubArrayLen(10, new int[] {2,1,5,1,5,3}));
	}

}
