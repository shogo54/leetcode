package array;

/**
 * @author Shogo Akiyama 
 * Solved on 05/19/2020
 * Time: 4m
 * 
 * 122. Best Time to Buy and Sell Stock II
 * https://leetcode.com/problems/best-time-to-buy-and-sell-stock-ii/
 * Difficulty: Easy
 * 
 * Approach: Iteration (One Pass)
 * Runtime: 1 ms, faster than 93.50% of Java online submissions for Best Time to Buy and Sell Stock II.
 * Memory Usage: 41.6 MB, less than 5.71% of Java online submissions for Best Time to Buy and Sell Stock II.
 * 
 * Time complexity : O(n)
 * Space complexity : O(1)
 * Where n is the number of elements in the array
 * 
 * @see ArrayTest#testBestTimeToBuyAndSellStockII()
 */
public class BestTimeToBuyAndSellStockII2 {

	public int maxProfit(int[] prices) {
		int profit = 0;
		for (int i = 0; i < prices.length - 1; i++) {
			if (prices[i] < prices[i + 1]) {
				profit += prices[i + 1] - prices[i];
			}
		}

		return profit;
	}

}
