package array;

/**
 * @author Shogo Akiyama 
 * Solved on 11/16/2019
 * 
 * 122. Best Time to Buy and Sell Stock II
 * https://leetcode.com/problems/best-time-to-buy-and-sell-stock-ii/
 * Difficulty: Easy
 * 
 * Approach: Iteration (Peak Valley)
 * Runtime: 1 ms, faster than 93.21% of Java online submissions for Best Time to Buy and Sell Stock II.
 * Memory Usage: 37.9 MB, less than 96.19% of Java online submissions for Best Time to Buy and Sell Stock II.
 * 
 * Time complexity : O(n)
 * Space complexity : O(1)
 * Where n is the number of elements in the array
 * 
 * @see ArrayTest#testBestTimeToBuyAndSellStockII()
 */
public class BestTimeToBuyAndSellStockII {
	
	public int maxProfit(int[] prices) {
		int len = prices.length;
		boolean first = true;
		int sum = 0;
		int last = 0;

		for (int i = 0; i < len - 1; i++) {
			if (first == true) {
				if (prices[i] < prices[i + 1]) {
					last = prices[i];
					first = false;
				}
				continue;
			}
			if (prices[i] > prices[i + 1]) {
				sum += prices[i] - last;
				first = true;
			}
		}

		if (!first && prices[len - 1] > last) {
			sum += prices[len - 1] - last;
		}

		return sum;
	}
	
}
