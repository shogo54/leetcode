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
 * Approach: 2 Maps
 * Runtime: 4 ms, faster than 22.94% of Java online submissions for Intersection of Two Arrays II.
 * Memory Usage: 36.7 MB, less than 83.87% of Java online submissions for Intersection of Two Arrays II.
 * 
 * @see ArrayTest#testIntersectionOfTwoArraysII()
 */
public class IntersectionOfTwoArraysII2 {
	
	public int[] intersect(int[] nums1, int[] nums2) {
		Map<Integer, Integer> map1 = new HashMap<Integer, Integer>();
		Map<Integer, Integer> map2 = new HashMap<Integer, Integer>();

		setupMap(map1, nums1);
		setupMap(map2, nums2);

		if (map1.size() < map2.size()) {
			return check(map1, map2);
		} else {
			return check(map2, map1);
		}
	}

	private void setupMap(Map<Integer, Integer> map, int[] nums) {
		for (int i = 0; i < nums.length; i++) {
			map.put(nums[i], map.getOrDefault(nums[i], 0) + 1);
		}
	}

	private int[] check(Map<Integer, Integer> map1, Map<Integer, Integer> map2) {
		List<Integer> result = new ArrayList<Integer>();

		for (Integer val : map1.keySet()) {
			if (map2.containsKey(val)) {
				int count = Math.min(map2.get(val), map1.get(val));
				for (int i = 0; i < count; i++) {
					result.add(val);
				}
				map2.remove(val);
			}
		}

		int[] retVal = new int[result.size()];
		for (int i = 0; i < result.size(); i++) {
			retVal[i] = result.get(i);
		}
		
		return retVal;
	}
	
}
