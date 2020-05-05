package array;

/**
 * @author Shogo Akiyama 
 * Solved on 05/04/2020
 * 
 * 35. Search Insert Position
 * https://leetcode.com/problems/search-insert-position/
 * Difficulty: Easy
 * 
 * SOLVED WITH ANSWER
 * 
 * Approach: Binary Search & Iteration
 * Runtime: 0 ms, faster than 100.00% of Java online submissions for Search Insert Position.
 * Memory Usage: 39.1 MB, less than 100.00% of Java online submissions for Search Insert Position.
 * 
 * Time Complexity: O(log(n))
 * Space Complexity: O(1)
 * Where n is the number of elements in an array
 * 
 * @see ArrayTest#testSearchInsertPosition()
 */
public class SearchInsertPosition {
	public int searchInsert(int[] nums, int target) {
		int l = 0;
		int r = nums.length;
		while (l < r) {
			int m = l + (r - l) / 2;
			if (nums[m] >= target) {
				r = m;
			} else {
				l = m + 1;
			}
		}
		return l;
	}
}