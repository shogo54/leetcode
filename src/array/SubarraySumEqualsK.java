package array;

/**
 * @author Shogo Akiyama 
 * Solved on 12/24/2019
 * 
 * 560. Subarray Sum Equals K
 * https://leetcode.com/problems/subarray-sum-equals-k/
 * Difficulty: Medium
 * 
 * Approach: Brute Force & Iteration
 * Runtime: 125 ms, faster than 18.40% of Java online submissions for Subarray Sum Equals K.
 * Memory Usage: 39.5 MB, less than 84.78% of Java online submissions for Subarray Sum Equals K.
 * 
 * Time Complexity: O(n^2)
 * Space Complexity: O(1)
 * Where n is the number of elements in an array
 * 
 * @see ArrayTest#testSubarraySumEqualsK()
 */
public class SubarraySumEqualsK {

	public int subarraySum(int[] nums, int k) {
		int count = 0;

		for (int i = 0; i < nums.length; i++) {
			int sum = 0;
			for (int j = i; j < nums.length; j++) {
				sum += nums[j];
				if (sum == k) {
					count++;
				}
			}
		}

		return count;
	}

}
