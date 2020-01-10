package binarytree;

import binarytree.BinaryTreeTest.TreeNode;

/**
 * @author Shogo Akiyama 
 * Solved on 11/30/2019
 * 
 * 337. House Robber III
 * https://leetcode.com/problems/house-robber-iii/
 * Difficulty: Medium
 * 
 * Approach: Recursion (Optimized)
 * Runtime: 0 ms, faster than 100.00% of Java online submissions for House Robber III.
 * Memory Usage: 37.2 MB, less than 100.00% of Java online submissions for House Robber III.
 * 
 * Time Complexity: O(n)
 * Space Complexity: O(d) for the recursive stack
 * Where n is the number of nodes in a tree and d is the maximum depth of the tree
 * 
 * @see BinaryTreeTest#testHouseRobberIII()
 */
public class HouseRobberIII {

	public int rob(TreeNode root) {
		int[] result = profit(root);
		return Math.max(result[0], result[1]);
	}

	private int[] profit(TreeNode root) {
		if (root == null) {
			return new int[] { 0, 0 };
		}

		int[] left = profit(root.left);
		int[] right = profit(root.right);

		int include = root.val + left[1] + right[1];
		int exclude = Math.max(left[0], left[1]) + Math.max(right[0], right[1]);

		return new int[] { include, exclude };
	}

}
