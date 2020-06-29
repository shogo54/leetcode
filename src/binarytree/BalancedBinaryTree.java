package binarytree;

import binarytree.BinaryTreeTest.TreeNode;

/**
 * @author Shogo Akiyama 
 * Solved on 06/26/2020
 * 
 * 110. Balanced Binary Tree
 * https://leetcode.com/problems/balanced-binary-tree/
 * Difficulty: Easy
 * 
 * Approach: Recursion (Bottom up)
 * Runtime: 0 ms, faster than 100.00% of Java online submissions for Balanced Binary Tree.
 * Memory Usage: 39.4 MB, less than 79.84% of Java online submissions for Balanced Binary Tree.
 * 
 * Time Complexity: O(n)
 * Space Complexity: O(log(n)) for the recursive stack
 * Where n is the number of nodes in the tree
 * 
 * @see BinaryTreeTest#testBalancedBinaryTree()
 */
public class BalancedBinaryTree {

	private boolean balanced = true;

	public boolean isBalanced(TreeNode root) {
		height(root);
		return balanced;
	}

	private int height(TreeNode root) {
		if (root == null) {
			return 0;
		}
		int left = height(root.left);
		int right = height(root.right);

		if (Math.abs(left - right) > 1) {
			balanced = false;
		}
		return Math.max(left, right) + 1;
	}

}
