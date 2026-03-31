package com.sliding.sol;

import java.util.ArrayList;
import java.util.HashMap;

public class CountDistictElementInArray {
	
	public static ArrayList<Integer> countDistinct(int arr[], int k) {
		
		HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
		ArrayList<Integer> result = new ArrayList<Integer>();
		
		for(int i=0;i<k;i++) {
			map.put(arr[i], map.getOrDefault(arr[i], 0)+1);		
		}
		
		result.add(map.size());
		
		int release=0;
		
		for(int i=k;i<arr.length;i++) {
			
			int f= map.get(arr[release]);
			f--;
			if(f==0) {
				map.remove(arr[release]);
			}else {
				map.put(arr[release], f);
			}
			
			map.put(arr[i], map.getOrDefault(arr[i], 0)+1);
			result.add(map.size());
			release++;
		}
		
		return result;
	}

}
