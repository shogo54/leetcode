package array;

import java.util.*;

/**
 * @author Shogo Akiyama 
 * Solved on 10/25/2019
 * 
 * 350. Intersection of Two Arrays II
 * https://leetcode.com/problems/intersection-of-two-arrays-ii/
 * difficulty: Easy
 * 
 * Approach: Map & Iteration
 * Runtime: 3 ms, faster than 57.33% of Java online submissions for Intersection of Two Arrays II.
 * Memory Usage: 37 MB, less than 83.87% of Java online submissions for Intersection of Two Arrays II.
 * 
 * Time Complexity: O(m + n)
 * Space Complexity: O(m + n)
 * Where m and n are the numbers of elements in nums1 and nums2, respectively
 * 
 * @see ArrayTest#testIntersectionOfTwoArraysII()
 */
public class IntersectionOfTwoArraysII {

	public int[] intersect(int[] nums1, int[] nums2) {
		Map<Integer, Integer> map = new HashMap<Integer, Integer>();

		if (nums1.length > nums2.length) {
			setupMap(map, nums1);
			return check(map, nums2);
		} else {
			setupMap(map, nums2);
			return check(map, nums1);
		}
	}

	private void setupMap(Map<Integer, Integer> map, int[] nums) {
		for (int i = 0; i < nums.length; i++) {
			map.put(nums[i], map.getOrDefault(nums[i], 0) + 1);
		}
	}

	private int[] check(Map<Integer, Integer> map, int[] nums2) {
		List<Integer> result = new ArrayList<Integer>();
		for (int i = 0; i < nums2.length; i++) {
			int val = nums2[i];
			if (map.containsKey(val)) {
				result.add(val);
				map.put(val, map.get(val) - 1);
				if (map.get(val) == 0) {
					map.remove(val);
				}
			}
		}
		int[] retVal = new int[result.size()];
		for (int i = 0; i < result.size(); i++) {
			retVal[i] = result.get(i);
		}
		return retVal;
	}

}
