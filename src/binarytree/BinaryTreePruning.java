package binarytree;

import binarytree.BinaryTreeTest.TreeNode;

/**
 * @author Shogo Akiyama 
 * Solved on 12/20/2019
 * 
 * 814. Binary Tree Pruning
 * https://leetcode.com/problems/binary-tree-pruning/
 * Difficulty: Medium
 * 
 * Approach: Recursion
 * Runtime: 0 ms, faster than 100.00% of Java online submissions for Binary Tree Pruning.
 * Memory Usage: 34.6 MB, less than 100.00% of Java online submissions for Binary Tree Pruning.
 * 
 * Time Complexity: O(n)
 * Space Complexity: O(d) for the recursive stack
 * Where n is the number of nodes in a tree and d is the maximum depth of the tree
 * 
 * @see BinaryTreeTest#testBinaryTreePruning()
 */
public class BinaryTreePruning {

	public TreeNode pruneTree(TreeNode root) {
		if (root == null) {
			return null;
		}
		root.left = pruneTree(root.left);
		root.right = pruneTree(root.right);

		if (root.left == null && root.right == null && root.val == 0) {
			return null;
		}
		return root;
	}

}
