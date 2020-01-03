package array;

/**
 * @author Shogo Akiyama 
 * Solved on 01/03/2020
 * 
 * 334. Increasing Triplet Subsequence
 * https://leetcode.com/problems/increasing-triplet-subsequence/
 * Difficulty: Medium
 * 
 * Approach: Iteration
 * Runtime: 0 ms, faster than 100.00% of Java online submissions for Increasing Triplet Subsequence.
 * Memory Usage: 38.9 MB, less than 95.35% of Java online submissions for Increasing Triplet Subsequence.
 * 
 * Time Complexity: O(n)
 * Space Complexity: O(1)
 * Where n is the number of elements in an array
 * 
 * @see ArrayTest#testIncreasingTripletSubsequence()
 */
public class IncreasingTripletSubsequence {

	public boolean increasingTriplet(int[] nums) {
		if (nums.length < 3) {
			return false;
		}

		int min = Math.min(nums[0], nums[1]);
		int[] seq = new int[2];

		if (nums[0] < nums[1]) {
			seq[0] = nums[0];
			seq[1] = nums[1];
		}

		for (int i = 2; i < nums.length; i++) {
			if (seq[0] < seq[1]) {
				if (seq[1] < nums[i]) {
					return true;
				} else if (seq[0] < nums[i]) {
					seq[1] = nums[i];
				}
			}

			if (min < nums[i]) {
				seq[0] = min;
				seq[1] = nums[i];
			} else {
				min = nums[i];
			}
		}

		return false;
	}

}
