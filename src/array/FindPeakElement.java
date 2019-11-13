package array;

/**
 * @author Shogo Akiyama 
 * Solved on 11/12/2019
 * 
 * 162. Find Peak Element
 * https://leetcode.com/problems/find-peak-element/
 * Difficulty: Medium
 * 
 * Approach: Binary Search & Recursion
 * Runtime: 0 ms, faster than 100.00% of Java online submissions for Find Peak Element.
 * Memory Usage: 39.1 MB, less than 98.51% of Java online submissions for Find Peak Element.
 * 
 * @see IntegerTest#testFindPeakElement()
 */
public class FindPeakElement {
	
	public int findPeakElement(int[] nums) {
		return findPeakElement(nums, 0, nums.length - 1);
	}

	private int findPeakElement(int[] nums, int start, int end) {
		if (start > end) {
			return -1;
		}

		int middle = (start + end) / 2;
		int middleVal = nums[middle];
		int oneBefore = (middle - 1 >= 0) ? nums[middle - 1] : Integer.MIN_VALUE;
		int oneAfter = (middle + 1 < nums.length) ? nums[middle + 1] : Integer.MIN_VALUE;

		if (middleVal >= oneBefore && middleVal >= oneAfter) {
			return middle;
			
		} else if (oneAfter >= middleVal && middleVal >= oneBefore) {
			return findPeakElement(nums, middle + 1, end);
			
		} else if (oneBefore >= middleVal && middleVal >= oneAfter) {
			return findPeakElement(nums, start, middle - 1);
			
		} else { // middleVal is smaller than both
			int res = findPeakElement(nums, start, middle - 1);
			return (res != -1) ? res : findPeakElement(nums, middle + 1, end);
		}
	}
	
}