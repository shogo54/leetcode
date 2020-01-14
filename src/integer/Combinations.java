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
 * Approach: Backtracking & Recursion
 * Runtime: 45 ms, faster than 9.54% of Java online submissions for Combinations.
 * Memory Usage: 39.2 MB, less than 84.78% of Java online submissions for Combinations.
 * 
 * Time Complexity: O(k*C(n,k)) = O(n!/(k-1)!)
 * Space Complexity: O(k) for the recursive stack
 * Where n and k are the given numbers
 * 
 * @see IntegerTest#testCombinations()
 */
public class Combinations {

	private List<List<Integer>> res = new ArrayList<List<Integer>>();

	public List<List<Integer>> combine(int n, int k) {
		for (int i = 1; i <= n; i++) {
			com(i, n, k, new ArrayList<Integer>());
		}

		return res;
	}

	private void com(int c, int n, int k, List<Integer> list) {
		list.add(c);
		if (list.size() == k) {
			res.add(list);
		}

		for (int i = c + 1; i <= n; i++) {
			com(i, n, k, new ArrayList<Integer>(list));
		}
	}

}
