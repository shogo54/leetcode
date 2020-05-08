package binarytree;

import binarytree.BinaryTreeTest.TreeNode;

/**
 * @author Shogo Akiyama 
 * Solved on 05/07/2020
 * 
 * 701. Insert into a Binary Search Tree
 * https://leetcode.com/problems/insert-into-a-binary-search-tree/
 * Difficulty: Medium
 * 
 * Approach: Recursion
 * Runtime: 0 ms, faster than 100.00% of Java online submissions for Insert into a Binary Search Tree.
 * Memory Usage: 39.6 MB, less than 96.55% of Java online submissions for Insert into a Binary Search Tree.
 * 
 * Time Complexity: O(d)
 * Space Complexity: O(d) for the recursive stack
 * Where d is the maximum depth of the tree
 * 
 * @see BinaryTreeTest#testInsertIntoABinarySearchTree()
 */
public class InsertIntoABinarySearchTree {

	public TreeNode insertIntoBST(TreeNode root, int val) {
		if (root == null) {
			return new TreeNode(val);
		}
		if (root.val < val) {
			root.right = insertIntoBST(root.right, val);
		} else {
			root.left = insertIntoBST(root.left, val);
		}
		return root;
	}

}
