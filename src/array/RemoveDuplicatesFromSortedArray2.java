package array;

/**
 * @author Shogo Akiyama 
 * Solved on 05/19/2020
 * Time: 12m30s
 * 
 * 26. Remove Duplicates from Sorted Array
 * https://leetcode.com/problems/remove-duplicates-from-sorted-array/
 * Difficulty: Easy
 * 
 * Approach: For Each
 * Runtime: 0 ms, faster than 100.00% of Java online submissions for Remove Duplicates from Sorted Array.
 * Memory Usage: 41.6 MB, less than 17.02% of Java online submissions for Remove Duplicates from Sorted Array.
 * 
 * Time Complexity: O(n)
 * Space Complexity: O(1)
 * Where n is the number of elements in the array
 * 
 * @see ArrayTest#testRemoveDuplicatesFromSortedArray()
 */
public class RemoveDuplicatesFromSortedArray2 {

	public int removeDuplicates(int[] nums) {
		if (nums.length == 0) {
			return 0;
		}
		
		int i = 1;
		for (int n : nums) {
			if (nums[i - 1] != n) {
				nums[i] = n;
				i++;
			}
		}

		return i;
	}

}
