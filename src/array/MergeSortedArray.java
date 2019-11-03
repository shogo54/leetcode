package array;

/**
 * @author Shogo Akiyama 
 * Solved on 11/03/2019
 * 
 * 88. Merge Sorted Array
 * https://leetcode.com/problems/merge-sorted-array/
 * Difficulty: Easy
 * 
 * Approach: Iteration
 * Runtime: 0 ms, faster than 100.00% of Java online submissions for Merge Sorted Array.
 * Memory Usage: 36.2 MB, less than 100.00% of Java online submissions for Merge Sorted Array.
 * 
 * @see ArrayTest#testMergeSortedArray()
 */
public class MergeSortedArray {

	public void merge(int[] nums1, int m, int[] nums2, int n) {
		int[] copy = nums1.clone();
		int curr = 0;
		int i = 0;
		int j = 0;
		while (curr < copy.length) {
			if (i < m && j < n) {
				nums1[curr] = (copy[i] < nums2[j]) ? copy[i++] : nums2[j++];
			} else if (i == m) {
				nums1[curr] = nums2[j++];
			} else {
				nums1[curr] = copy[i++];
			}
			curr++;
		}
	}

}
