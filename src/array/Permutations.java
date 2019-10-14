package array;

import java.util.*;

/**
 * @author Shogo Akiyama 
 * Solved on 10/13/2019
 * 
 * 46. Permutations
 * https://leetcode.com/problems/permutations/
 * Difficulty: Medium
 * 
 * Approach: Recursion & Backtracking
 * Runtime: 1 ms, faster than 97.75% of Java online submissions for Permutations.
 * Memory Usage: 38 MB, less than 80.14% of Java online submissions for Permutations.
 * 
 * @see ArrayTest
 */
public class Permutations {

	private List<List<Integer>> result = new ArrayList<List<Integer>>();

	public List<List<Integer>> permute(int[] nums) {
		List<Integer> numbers = new ArrayList<Integer>();
		for (int i : nums) {
			numbers.add(i);
		}

		backtrack(new ArrayList<Integer>(), numbers);
		return result;
	}

	private void backtrack(List<Integer> list, List<Integer> nums) {
		if (nums.size() == 0) {
			result.add(list);
		}

		for (int i = 0; i < nums.size(); i++) {
			Integer next = nums.get(0);
			nums.remove(0);
			List<Integer> newList = new ArrayList<Integer>(list);
			newList.add(next);
			backtrack(newList, nums);
			nums.add(next);
		}
	}

}
