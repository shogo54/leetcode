package binarytree;

import binarytree.BinaryTreeTest.TreeNode;

/**
 * @author Shogo Akiyama 
 * Solved on 11/20/2019
 * 
 * 543. Diameter of Binary Tree
 * https://leetcode.com/problems/diameter-of-binary-tree/
 * Difficulty: Easy
 * 
 * Approach: Recursion
 * Runtime: 0 ms, faster than 100.00% of Java online submissions for Diameter of Binary Tree.
 * Memory Usage: 38.3 MB, less than 57.14% of Java online submissions for Diameter of Binary Tree.
 * 
 * @see BinaryTreeTest#testDiameterOfBinaryTree()
 */
public class DiameterOfBinaryTree {

	private int max = 0;

	public int diameterOfBinaryTree(TreeNode root) {
		length(root);
		return max;
	}

	private int length(TreeNode root) {
		if (root == null) {
			return -1;
		}

		int leftDepth = length(root.left) + 1;
		int rightDepth = length(root.right) + 1;

		max = Math.max(leftDepth + rightDepth, max);

		return Math.max(leftDepth, rightDepth);
	}
	
}
