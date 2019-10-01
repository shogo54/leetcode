package array;

/**
 * @author Shogo Akiyama 
 * Solved on 09/26/2019
 * 
 * 300. Longest Increasing Subsequence
 * https://leetcode.com/problems/longest-increasing-subsequence/
 * Difficulty: Medium
 * 
 * To run the code in LeetCode, take the codes from the following method(s) and all properties:
 * - int lengthOfLIS(int[] nums).
 * 
 * Runtime: 9 ms, faster than 48.07% of Java online submissions for Longest Increasing Subsequence.
 * Memory Usage: 36.6 MB, less than 100.00% of Java online submissions for Longest Increasing Subsequence.
 * 
 */

public class LongestIncreasingSubsequence {

	public int lengthOfLIS(int[] nums) {
		if (nums.length == 0) {
			return 0;
		}

		int[] result = new int[nums.length];
		int max = 0;
		for (int i = nums.length - 1; i >= 0; i--) {
			for (int j = nums.length - 1; j > i; j--) {
				if (nums[i] < nums[j]) {
					result[i] = Math.max(result[i], result[j] + 1);
				}
			}
			max = Math.max(max, result[i]);
		}

		return max + 1;
	}

}
