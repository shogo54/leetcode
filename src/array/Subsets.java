package array;

import java.util.*;

/**
 * @author Shogo Akiyama 
 * Solved on 10/10/2019
 * 
 * 78. Subsets
 * https://leetcode.com/problems/subsets/
 * Difficulty: Medium
 * 
 * Approach: Iteration
 * Runtime: 0 ms, faster than 100.00% of Java online submissions for Subsets.
 * Memory Usage: 37.5 MB, less than 95.90% of Java online submissions for Subsets.
 * 
 * @see ArrayTest#testSubsets()
 */
public class Subsets {

	public List<List<Integer>> subsets(int[] nums) {
		List<List<Integer>> result = new ArrayList<List<Integer>>();
		result.add(new ArrayList<Integer>());

		for (int i = 0; i < nums.length; i++) {
			int len = result.size();
			for (int j = 0; j < len; j++) {
				result.add(new ArrayList<Integer>(result.get(j)));
				result.get(len + j).add(nums[i]);
			}
		}
		
		return result;
	}

}
