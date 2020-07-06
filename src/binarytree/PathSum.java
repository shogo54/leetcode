package binarytree;

import binarytree.BinaryTreeTest.TreeNode;

/**
 * @author Shogo Akiyama 
 * Solved on 07/05/2020
 * 
 * 112. Path Sum
 * https://leetcode.com/problems/path-sum/
 * Difficulty: Easy
 * 
 * Approach: DFS & Recursion
 * Runtime: 0 ms, faster than 100.00% of Java online submissions for Path Sum.
 * Memory Usage: 39.7 MB, less than 30.83% of Java online submissions for Path Sum.
 * 
 * Time Complexity: O(n)
 * Space Complexity: O(d) for the recursive stack
 * Where n is the number of nodes in the tree and d is the maximum depth of the tree
 * 
 * @see BinaryTreeTest#testPathSum()
 */
public class PathSum {

	public boolean hasPathSum(TreeNode root, int sum) {
		if (root == null) {
			return false;
		}
		return hasPathSum(root, sum, 0);
	}

	private boolean hasPathSum(TreeNode root, int sum, int sofar) {
		if (root.left == null && root.right == null) {
			return (sofar + root.val) == sum;
		}

		boolean res = false;
		if (root.left != null) {
			res = hasPathSum(root.left, sum, sofar + root.val);
		}
		if (!res && root.right != null) {
			res = hasPathSum(root.right, sum, sofar + root.val);
		}

		return res;
	}

}
