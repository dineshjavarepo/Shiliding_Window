package com.sliding.sol;

public class BestTimeToBuyAndSellStock {
	
	 public static int maxProfit(int[] prices) {
		 
		 int buyIndex=0;
		 int maxProfit=0;
		 
		 for(int sellerIndex=1;sellerIndex<prices.length;sellerIndex++) {
			 
			 if(prices[sellerIndex]<prices[buyIndex]) {
				 buyIndex = sellerIndex;
			 }else {
				 maxProfit = Math.max(maxProfit, prices[sellerIndex]-prices[buyIndex]);
			 }
		 }
		 return maxProfit;
	        
	  }

}
