package array;

/**
 * @author Shogo Akiyama 
 * Solved on 10/16/2019
 * 
 * 213. House Robber II
 * https://leetcode.com/problems/house-robber-ii/
 * Difficulty: Medium
 * 
 * Approach: Dynamic Programming (Bottom up)
 * Runtime: 0 ms, faster than 100.00% of Java online submissions for House Robber II.
 * Memory Usage: 34.4 MB, less than 100.00% of Java online submissions for House Robber II.
 * 
 * @see ArrayTest#testHouseRobberII()
 */
public class HouseRobberII {

	public int rob(int[] nums) {
		if (nums == null || nums.length == 0) {
			return 0;
		} else if (nums.length == 1) {
			return nums[0];
		} else if (nums.length == 2) {
			return Math.max(nums[0], nums[1]);
		}

		int len = nums.length;
		int[] dp1 = new int[len - 1];
		int[] dp2 = new int[len - 1];

		// dp initialize
		dp1[0] = nums[0];
		dp1[1] = Math.max(dp1[0], nums[1]);
		dp2[0] = nums[1];
		dp2[1] = Math.max(dp2[0], nums[2]);

		// dp iteration
		for (int i = 2; i < len - 1; i++) {
			dp1[i] = Math.max(dp1[i - 2] + nums[i], dp1[i - 1]);
			dp2[i] = Math.max(dp2[i - 2] + nums[i + 1], dp2[i - 1]);
		}

		return Math.max(dp1[len - 2], dp2[len - 2]);
	}

}
