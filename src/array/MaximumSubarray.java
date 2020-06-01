package array;

/**
 * @author Shogo Akiyama 
 * Solved on 05/30/2020
 * Time: 9m
 * 
 * 53. Maximum Subarray
 * https://leetcode.com/problems/maximum-subarray/
 * difficulty: Easy
 * 
 * Approach: Dynamic Programming (Bottom up)
 * Runtime: 1 ms, faster than 63.57% of Java online submissions for Maximum Subarray.
 * Memory Usage: 39.6 MB, less than 7.04% of Java online submissions for Maximum Subarray.
 * 
 * Time Complexity: O(n)
 * Space Complexity: O(1)
 * Where n is the numbers of elements in the array
 * 
 * @see ArrayTest#testMaximumSubarray()
 */
public class MaximumSubarray {

	public int maxSubArray(int[] nums) {
		if (nums == null || nums.length == 0) {
			return 0;
		}

		int curr = nums[0];
		int max = curr;
		for (int i = 1; i < nums.length; i++) {
			curr = Math.max(curr + nums[i], nums[i]);
			max = Math.max(curr, max);
		}

		return max;
	}

}
