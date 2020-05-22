package array;

/**
 * @author Shogo Akiyama 
 * Solved on 08/13/2019
 * 
 * 1. Two Sum
 * https://leetcode.com/problems/two-sum/
 * Difficulty: Easy
 * 
 * Approach: Brute Force
 * Runtime: 25 ms, faster than 23.60% of Java online submissions for Two Sum.
 * Memory Usage: 36.3 MB, less than 99.61% of Java online submissions for Two Sum.
 * 
 * Time Complexity: O(n^2)
 * Space Complexity: O(1)
 * Where n is the number of elements in the array
 * 
 * @see ArrayTest#testTwoSum()
 */
public class TwoSum {

	public int[] twoSum(int[] nums, int target) {
		int[] result = new int[2];
		for (int i = 0; i < nums.length; i++) {
			for (int j = i + 1; j < nums.length; j++) {
				if (nums[i] + nums[j] == target) {
					result[0] = i;
					result[1] = j;
					return result;
				}
			}
		}
		return result;
	}

}