package array;

/**
 * @author Shogo Akiyama 
 * Solved on 10/15/2019
 * 
 * 121. Best Time to Buy and Sell Stock
 * https://leetcode.com/problems/best-time-to-buy-and-sell-stock/
 * Difficulty: Easy
 * 
 * Approach: Iteration & Two Pass
 * Runtime: 1 ms, faster than 86.29% of Java online submissions for Best Time to Buy and Sell Stock.
 * Memory Usage: 37.6 MB, less than 98.67% of Java online submissions for Best Time to Buy and Sell Stock.
 * 
 * @see ArrayTest#testBestTimeToBuyAndSellStock()
 */
public class BestTimeToBuyAndSellStock {
	
	public int maxProfit(int[] prices) {
		if (prices == null || prices.length == 0) {
			return 0;
		}

		int n = prices.length;
		int result = 0;
		int[] mins = new int[n];
		int[] maxs = new int[n];

		mins[0] = prices[0];
		maxs[n - 1] = prices[n - 1];

		for (int i = 0; i < n; i++) {
			if (i != 0) {
				mins[i] = Math.min(mins[i - 1], prices[i]);
			}
			if (i != n - 1) {
				maxs[n - i - 1] = Math.max(maxs[i + 1], prices[n - i - 1]);
			}
		}

		for (int i = 0; i < n; i++) {
			result = Math.max(maxs[i] - mins[i], result);
		}

		return result;
	}
	
}
