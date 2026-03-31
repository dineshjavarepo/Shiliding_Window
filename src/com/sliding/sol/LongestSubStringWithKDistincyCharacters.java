package com.sliding.sol;

import java.util.HashMap;

public class LongestSubStringWithKDistincyCharacters {

	public static int kDistinctChars(int k, String str) {
		// Write your code here
		
		int maxLen=0;
		int left=0;
		HashMap<Character, Integer> map = new HashMap<Character, Integer>();
		
		for(int right=0;right<str.length();right++) {
			
			map.put(str.charAt(right), map.getOrDefault(str.charAt(right), 0)+1);
			
			while(map.size()>k) {
				int f = map.get(str.charAt(left));
				f--;
				if(f==0) {
					map.remove(str.charAt(left));
				}else {
					map.put(str.charAt(left), f);
				}
				left++;
			}
			
			maxLen = Math.max(maxLen, right-left+1);
		}
		return maxLen;
	}
}
