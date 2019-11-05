package binarytree;

import binarytree.BinaryTreeTest.TreeNode;

/**
 * @author Shogo Akiyama 
 * Solved on 11/04/2019
 * 
 * 101. Symmetric Tree
 * https://leetcode.com/problems/symmetric-tree/
 * Difficulty: Easy
 * 
 * Approach: Recursion
 * Runtime: 0 ms, faster than 100.00% of Java online submissions for Symmetric Tree.
 * Memory Usage: 39.1 MB, less than 36.73% of Java online submissions for Symmetric Tree.
 * 
 * @see BinaryTreeTest#testSymmetricTree()
 */
public class SymmetricTree {

	public boolean isSymmetric(TreeNode root) {
		if (root == null) {
			return true;
		}
		return isSymmetric(root.left, root.right);
	}

	private boolean isSymmetric(TreeNode leftNode, TreeNode rightNode) {
		if (leftNode == null && rightNode == null) {
			return true;
		}
		if (leftNode == null || rightNode == null) {
			return false;
		}
		if (leftNode.val != rightNode.val) {
			return false;
		}
		return isSymmetric(leftNode.left, rightNode.right) && isSymmetric(leftNode.right, rightNode.left);
	}

}