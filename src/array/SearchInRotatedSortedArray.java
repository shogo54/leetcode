package array;

/**
 * @author Shogo Akiyama 
 * Solved on 11/16/2019
 * 
 * 33. Search in Rotated Sorted Array
 * https://leetcode.com/problems/search-in-rotated-sorted-array/
 * Difficulty: Medium
 * 
 * Approach: Recursion & Binary Search
 * Runtime: 0 ms, faster than 100.00% of Java online submissions for Search in Rotated Sorted Array.
 * Memory Usage: 39.5 MB, less than 17.61% of Java online submissions for Search in Rotated Sorted Array.
 * 
 * @see ArrayTest#testSearchInRotatedSortedArray()
 */
public class SearchInRotatedSortedArray {
	
	public int search(int[] nums, int target) {
		if (nums.length == 0) {
			return -1;
		}
		return search(nums, target, 0, nums.length - 1);
	}

	private int search(int[] nums, int target, int s, int e) {
		if (s == e) {
			return (nums[s] == target) ? s : -1;
		}

		int m = (s + e) / 2;

		if (target == nums[m]) {
			return m;
		}

		if (nums[s] <= nums[m]) {
			if (nums[s] <= target && target < nums[m]) {
				return search(nums, target, s, m);
			} else {
				return search(nums, target, m + 1, e);
			}
		} else {
			if (nums[m] < target && target <= nums[e]) {
				return search(nums, target, m + 1, e);
			} else {
				return search(nums, target, s, m);
			}
		}
	}
	
}
