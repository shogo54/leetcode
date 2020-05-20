package array;

import java.util.*;

/**
 * @author Shogo Akiyama 
 * Solved on 05/20/2020
 * Time: 11m
 * 
 * 350. Intersection of Two Arrays II
 * https://leetcode.com/problems/intersection-of-two-arrays-ii/
 * difficulty: Easy
 * 
 * Approach: Sort and Iteration
 * Runtime: 2 ms, faster than 97.99% of Java online submissions for Intersection of Two Arrays II.
 * Memory Usage: 40.1 MB, less than 6.45% of Java online submissions for Intersection of Two Arrays II.
 * 
 * Time Complexity: O(max(mlogm, nlogn))
 * Space Complexity: O(min(m, n))
 * Where m and n are the numbers of elements in nums1 and nums2, respectively
 * 
 * @see ArrayTest#testIntersectionOfTwoArraysII()
 */
public class IntersectionOfTwoArraysII3 {

	public int[] intersect(int[] nums1, int[] nums2) {
		Arrays.sort(nums1);
		Arrays.sort(nums2);

		int i = 0;
		int j = 0;
		List<Integer> list = new ArrayList<Integer>();

		while (i < nums1.length && j < nums2.length) {
			if (nums1[i] == nums2[j]) {
				list.add(nums1[i]);
				i++;
				j++;
			} else if (nums1[i] > nums2[j]) {
				j++;
			} else {
				i++;
			}
		}

		int[] res = new int[list.size()];
		for (int k = 0; k < list.size(); k++) {
			res[k] = list.get(k);
		}

		return res;
	}

}
