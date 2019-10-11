package binarytree;

import binarytree.BinaryTreeTest.TreeNode;

/**
 * @author Shogo Akiyama 
 * Solved on 06/10/2019
 * 
 * 700. Search in a Binary Search Tree
 * https://leetcode.com/problems/search-in-a-binary-search-tree/
 * Difficulty: Easy
 * 
 * Approach: Recursion
 * Runtime: 0 ms, faster than 100.00% of Java online submissions for Search in a Binary Search Tree.
 * Memory Usage: 38.8 MB, less than 98.47% of Java online submissions for Search in a Binary Search Tree.
 * 
 * @see BinaryTreeTest#testSearchInABinarySearchTree()
 */
public class SearchInABinarySearchTree {

	public TreeNode searchBST(TreeNode root, int val) {
		if (root.val == val) {
			return root;
		} else if (root.val > val) {
			return root.left != null ? searchBST(root.left, val) : null;
		} else {
			return root.right != null ? searchBST(root.right, val) : null;
		}
	}

}