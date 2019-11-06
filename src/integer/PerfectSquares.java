package integer;

import java.util.*;

/**
 * @author Shogo Akiyama 
 * Solved on 11/06/2019
 * 
 * 279. Perfect Squares
 * https://leetcode.com/problems/perfect-squares/
 * Difficulty: Medium
 * 
 * Approach: Dynamic Programming (Bottom up)
 * Runtime: 30 ms, faster than 45.36% of Java online submissions for Perfect Squares.
 * Memory Usage: 35.3 MB, less than 18.05% of Java online submissions for Perfect Squares.
 * 
 * @see IntegerTest#testPerfectSquares()
 */
public class PerfectSquares {

	public int numSquares(int n) {
		int[] dp = new int[n + 1];
		List<Integer> square = new ArrayList<Integer>();

		for (int i = 1, r = 1; r <= n; i++, r = i * i) {
			square.add(r);
		}

		for (int i = 1; i < n + 1; i++) {
			dp[i] = Integer.MAX_VALUE;
			for (int j = 0; j < square.size(); j++) {
				int s = square.get(j);
				if (i - s < 0) {
					break;
				}
				dp[i] = Math.min(dp[i], dp[i - s] + 1);
			}
		}

		return dp[n];
	}

}
