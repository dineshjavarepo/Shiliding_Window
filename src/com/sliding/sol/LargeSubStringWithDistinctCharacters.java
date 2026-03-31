package com.sliding.sol;

import java.util.HashSet;

public class LargeSubStringWithDistinctCharacters {
	
	public static int longestUniqueSubstr(String s) {
		
		int maxLen=0;
		int left=0;
		HashSet<Character> set= new HashSet<Character>();
		
		for(int right=0;right<s.length();right++) {
			
			while(set.contains(s.charAt(right))) {
				set.remove(s.charAt(left));
				left++;
			}
			
			set.add(s.charAt(right));
			maxLen = Math.max(right-left+1, maxLen);
		}
		return maxLen;
	}

}
