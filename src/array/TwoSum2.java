package array;

import java.util.*;

/**
 * @author Shogo Akiyama 
 * Solved on 12/31/2019 and 05/21/2020
 * Time: 5m
 * 
 * 1. Two Sum
 * https://leetcode.com/problems/two-sum/
 * Difficulty: Easy
 * 
 * Approach: Hash Map
 * Runtime: 2 ms, faster than 98.86% of Java online submissions for Two Sum.
 * Memory Usage: 38.3 MB, less than 77.56% of Java online submissions for Two Sum.
 * 
 * Time Complexity: O(n)
 * Space Complexity: O(n)
 * Where n is the number of elements in the array
 * 
 * @see ArrayTest#testTwoSum()
 */
public class TwoSum2 {

	public int[] twoSum(int[] nums, int target) {
		Map<Integer, Integer> map = new HashMap<Integer, Integer>();

		for (int i = 0; i < nums.length; i++) {
			if (map.containsKey(target - nums[i])) {
				return new int[] { map.get(target - nums[i]), i };
			}
			map.put(nums[i], i);
		}

		return new int[2];
	}

}
