package array;

/**
 * @author Shogo Akiyama 
 * Solved on 07/31/2019
 * 
 * 198. House Robber
 * https://leetcode.com/problems/house-robber/
 * Difficulty: Easy
 * 
 * Approach: Dynamic Programming (Bottom up)
 * Runtime: 0 ms, faster than 100.00% of Java online submissions for House Robber.
 * Memory Usage: 33.9 MB, less than 100.00% of Java online submissions for House Robber.
 * 
 * @see ArrayTest#testHouseRobber()
 */
public class HouseRobber {

	public int rob(int[] nums) {
		if (nums.length == 0) {
			return 0;
		} else if (nums.length == 1) {
			return nums[0];
		}

		int[] max = new int[nums.length];
		max[0] = nums[0];
		max[1] = Math.max(nums[0], nums[1]);

		for (int i = 2; i < nums.length; i++) {
			max[i] = Math.max(max[i - 2] + nums[i], max[i - 1]);
		}
		return max[nums.length - 1];
	}

}