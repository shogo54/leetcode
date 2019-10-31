package array;

import java.util.*;

/**
 * @author Shogo Akiyama 
 * Solved on 08/19/2019
 * 
 * 349. Intersection of Two Arrays
 * https://leetcode.com/problems/intersection-of-two-arrays/
 * Difficulty: Easy
 * 
 * Approach: Two Sets & Iteration
 * Runtime: 2 ms, faster than 98.40% of Java online submissions for Intersection of Two Arrays.
 * Memory Usage: 37.5 MB, less than 63.51% of Java online submissions for Intersection of Two Arrays.
 * 
 * @see ArrayTest#testIntersectionOfTwoArrays()
 */
public class IntersectionOfTwoArrays {

	public int[] intersection(int[] nums1, int[] nums2) {
		Set<Integer> set = new HashSet<Integer>();
		Set<Integer> common = new HashSet<Integer>();

		for (int n : nums1) {
			set.add(n);
		}

		for (int n : nums2) {
			if (set.contains(n)) {
				common.add(n);
			}
		}

		int[] array = new int[common.size()];
		int index = 0;
		for (int val : common) {
			array[index] = val;
			index++;
		}

		return array;
	}

}
