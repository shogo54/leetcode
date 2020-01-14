package integer;

import java.util.*;

/**
 * @author Shogo Akiyama 
 * Solved on 01/12/2020
 * 
 * 77. Combinations
 * https://leetcode.com/problems/combinations/
 * Difficulty: Medium
 * 
 * Approach: Backtracking & Recursion (Optimized)
 * Runtime: 2 ms, faster than 97.36% of Java online submissions for Combinations.
 * Memory Usage: 39.6 MB, less than 80.43% of Java online submissions for Combinations.
 * 
 * Time Complexity: O(k*C(n,k)) = O(n!/(k-1)!)
 * Space Complexity: O(k) for the recursive stack
 * Where n and k are the given numbers
 * 
 * @see IntegerTest#testCombinations()
 */
public class Combinations2 {

	public List<List<Integer>> combine(int n, int k) {
		List<List<Integer>> res = new ArrayList<List<Integer>>();
		com(1, n, k, new ArrayList<Integer>(), res);
		return res;
	}

	private void com(int c, int n, int k, List<Integer> list, List<List<Integer>> result) {
		if (list.size() == k) {
			result.add(new ArrayList<Integer>(list));
			return;
		}

		for (int i = c; i <= n - k + list.size() + 1; i++) {
			list.add(i);
			com(i + 1, n, k, list, result);
			list.remove(list.size() - 1);
		}
	}

}
