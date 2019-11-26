package array;

/**
 * @author Shogo Akiyama 
 * Solved on 11/26/2019
 * 
 * 581. Shortest Unsorted Continuous Subarray
 * https://leetcode.com/problems/shortest-unsorted-continuous-subarray/
 * Difficulty: Easy
 * 
 * Approach: Iteration & Two Pass
 * Runtime: 2 ms, faster than 91.86% of Java online submissions for Shortest Unsorted Continuous Subarray.
 * Memory Usage: 40.2 MB, less than 100.00% of Java online submissions for Shortest Unsorted Continuous Subarray.
 * 
 * Time Complexity: O(n)
 * Space Complexity: O(1)
 * 
 * @see ArrayTest#testShortestUnsortedContinuousSubarray()
 */
public class ShortestUnsortedContinuousSubarray {

	public int findUnsortedSubarray(int[] nums) {
		int s = -1;
		int e = -1;
		int max = Integer.MIN_VALUE;
		int min = Integer.MAX_VALUE;

		for (int i = 0; i < nums.length; i++) {
			if (nums[i] < max) {
				if (s == -1) {
					s = i - 1;
				}
				e = i;
				min = Math.min(nums[i], min);
			}
			max = Math.max(nums[i], max);
		}

		while (s > 0 && nums[s - 1] > min) {
			s--;
		}

		return (s == -1) ? 0 : e - s + 1;
	}

}
