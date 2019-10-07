package binarytree;

import binarytree.BinaryTreeTest.TreeNode;

/**
 * @author Shogo Akiyama 
 * Solved on 10/07/2019
 * 
 * 124. Binary Tree Maximum Path Sum
 * https://leetcode.com/problems/binary-tree-maximum-path-sum/
 * Difficulty: Hard
 * 
 * Approach: Divide and Conquer
 * Runtime: 1 ms, faster than 100.00% of Java online submissions for Binary Tree Maximum Path Sum.
 * Memory Usage: 40.4 MB, less than 95.24% of Java online submissions for Binary Tree Maximum Path Sum.
 * 
 * Solved in less than 20'm!!
 *
 * @see BinaryTreeTest#testBinaryTreeMaximumPathSum()
 */
public class BinaryTreeMaximumPathSum {

	private int max;

	public int maxPathSum(TreeNode root) {
		max = root.val;
		pathSum(root);
		return max;
	}

	private int pathSum(TreeNode root) {
		if (root == null) {
			return 0;
		}

		int mid = root.val;
		int left = pathSum(root.left);
		int right = pathSum(root.right);

		int larger = Math.max(left, right);
		larger = Math.max(larger, 0) + mid;

		max = Math.max(mid + left + right, max);
		max = Math.max(larger, max);
		return larger;
	}

}
