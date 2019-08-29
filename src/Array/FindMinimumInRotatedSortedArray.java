package Array;

/**
 * @author Shogo Akiyama 
 * Solved on 08/28/2019
 * 
 * 153. Find Minimum in Rotated Sorted Array
 * https://leetcode.com/problems/find-minimum-in-rotated-sorted-array/
 * Difficulty: Medium
 * 
 * To run the code in LeetCode, take the codes from the following method(s) and all properties:
 * - int findMin(int[] nums)
 * - int find(int[] nums, int s, int e).
 * 
 * Runtime: 0 ms, faster than 100.00% of Java online submissions for Find Minimum in Rotated Sorted Array.
 * Memory Usage: 38.5 MB, less than 77.27% of Java online submissions for Find Minimum in Rotated Sorted Array.
 * 
 */

public class FindMinimumInRotatedSortedArray {

	public int findMin(int[] nums) {
		if (nums.length == 1) {
			return nums[0];
		}
		return find(nums, 0, nums.length - 1);
	}

	private int find(int[] nums, int s, int e) {
		if (s == e) {
			return nums[s];
		}
		int m = s + (e - s) / 2;
		if (nums[m] > nums[m + 1]) {
			return nums[m + 1];
		} else {
			if (nums[m + 1] > nums[e]) {
				return find(nums, m + 1, e);
			} else {
				return find(nums, s, m);
			}
		}
	}

}
