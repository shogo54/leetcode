package array;

/**
 * @author Shogo Akiyama 
 * Solved on 11/13/2019
 * 
 * 26. Remove Duplicates from Sorted Array
 * https://leetcode.com/problems/remove-duplicates-from-sorted-array/
 * Difficulty: Easy
 * 
 * Approach: Two Pointers
 * Runtime: 1 ms, faster than 97.70% of Java online submissions for Remove Duplicates from Sorted Array.
 * Memory Usage: 39.5 MB, less than 97.87% of Java online submissions for Remove Duplicates from Sorted Array.
 * 
 * @see ArrayTest#testRemoveDuplicatesFromSortedArray()
 */
public class RemoveDuplicatesFromSortedArray {

	public int removeDuplicates(int[] nums) {
		if (nums.length < 2) {
			return nums.length;
		}

		int left = 1;
		int right = 1;
		int count = 0;

		while (right < nums.length) {
			while (right + 1 < nums.length && nums[right - 1] == nums[right]) {
				right++;
			}
			nums[left] = nums[right];
			left++;
			count++;
			right++;
		}

		if (nums[count - 1] != nums[nums.length - 1]) {
			nums[count++] = nums[nums.length - 1];
		}

		return count;
	}

}
