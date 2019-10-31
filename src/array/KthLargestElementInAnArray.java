package array;

import java.util.*;

/**
 * @author Shogo Akiyama 
 * Solved on 10/27/2019
 * 
 * 215. Kth Largest Element in an Array
 * https://leetcode.com/problems/kth-largest-element-in-an-array/
 * difficulty: Medium
 * 
 * Apporach: Sort
 * Runtime: 2 ms, faster than 88.79% of Java online submissions for Kth Largest Element in an Array.
 * Memory Usage: 36.9 MB, less than 90.16% of Java online submissions for Kth Largest Element in an Array.
 * 
 * @see ArrayTest#testKthLargestElementInAnArray()
 */
public class KthLargestElementInAnArray {

	public int findKthLargest(int[] nums, int k) {
		if (nums.length == 0) {
			return -1;
		}
		Arrays.sort(nums);
		return nums[nums.length - k];
	}

}
