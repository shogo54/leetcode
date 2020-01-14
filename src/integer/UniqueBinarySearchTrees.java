package integer;

import java.util.*;

/**
 * @author Shogo Akiyama 
 * Solved on 01/13/2020
 * 
 * 96. Unique Binary Search Trees
 * https://leetcode.com/problems/unique-binary-search-trees/
 * Difficulty: Medium
 * 
 * Approach: Dynamic Programming (Top down)
 * Runtime: 0 ms, faster than 100.00% of Java online submissions for Unique Binary Search Trees.
 * Memory Usage: 33.6 MB, less than 5.55% of Java online submissions for Unique Binary Search Trees.
 * 
 * Time Complexity: O(n^2)
 * Space Complexity: O(n) for the recursive stack
 * Where n is the given number
 * 
 * @see IntegerTest#testUniqueBinarySearchTrees()
 */
public class UniqueBinarySearchTrees {

	public int numTrees(int n) {
		Map<Integer, Integer> dp = new HashMap<Integer, Integer>();
		return tree(n, dp);
	}

	private int tree(int n, Map<Integer, Integer> dp) {
		if (n == 0 || n == 1) {
			return 1;
		}
		if (dp.containsKey(n)) {
			return dp.get(n);
		}

		int sum = 0;
		for (int i = 1; i <= n; i++) {
			sum += tree(i - 1, dp) * tree(n - i, dp);
		}
		dp.put(n, sum);
		return sum;
	}

}
