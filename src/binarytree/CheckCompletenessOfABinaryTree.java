package binarytree;

import binarytree.BinaryTreeTest.TreeNode;

/**
 * @author Shogo Akiyama 
 * Solved on 01/21/2020
 * 
 * 958. Check Completeness of a Binary Tree
 * https://leetcode.com/problems/check-completeness-of-a-binary-tree/
 * Difficulty: Medium
 * 
 * Approach: Recursion
 * Runtime: 1 ms, faster than 82.88% of Java online submissions for Check Completeness of a Binary Tree.
 * Memory Usage: 42.1 MB, less than 7.14% of Java online submissions for Check Completeness of a Binary Tree.
 * 
 * Time Complexity: O(n)
 * Space Complexity: O(d) for the recursive stack
 * Where n is the number of nodes in a tree and d is the maximum depth of the tree
 * 
 * @see BinaryTreeTest#testCheckCompletenessOfABinaryTree()
 */
public class CheckCompletenessOfABinaryTree {

	private boolean hasEmpty = false;
	private int depth = -1;

	public boolean isCompleteTree(TreeNode root) {
		return isComplete(root, 0);
	}

	private boolean isComplete(TreeNode root, int d) {
		if (root == null) {
			if (depth == -1) {
				depth = d;
				return true;
			}
			if (hasEmpty) {
				return (d == depth - 1);
			}
			if (d == depth - 1) {
				hasEmpty = true;
				return true;
			}
			return (d == depth);
		}
		return isComplete(root.left, d + 1) && isComplete(root.right, d + 1);
	}

}
