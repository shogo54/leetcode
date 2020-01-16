package binarytree;

import binarytree.BinaryTreeTest.TreeNode;

/**
 * @author Shogo Akiyama 
 * Solved on 01/15/2020
 * 
 * 623. Add One Row to Tree
 * https://leetcode.com/problems/add-one-row-to-tree/
 * Difficulty: Medium
 * 
 * Approach: Recursion
 * Runtime: 0 ms, faster than 100.00% of Java online submissions for Add One Row to Tree.
 * Memory Usage: 47.8 MB, less than 14.29% of Java online submissions for Add One Row to Tree.
 * 
 * Time Complexity: O(n)
 * Space Complexity: O(d) for the recursive stack
 * Where n is the number of nodes in a tree and d is the given number
 * 
 * @see BinaryTreeTest#testAddOneRowToTree()
 */
public class AddOneRowToTree {

	public TreeNode addOneRow(TreeNode root, int v, int d) {
		if (root == null) {
			return null;
		}
		if (d == 1) {
			TreeNode newRoot = new TreeNode(v);
			newRoot.left = root;
			return newRoot;
		}
		if (d == 2) {
			TreeNode newLeft = new TreeNode(v);
			newLeft.left = root.left;
			root.left = newLeft;
			TreeNode newRight = new TreeNode(v);
			newRight.right = root.right;
			root.right = newRight;
			return root;
		}
		addOneRow(root.left, v, d - 1);
		addOneRow(root.right, v, d - 1);
		return root;
	}

}
