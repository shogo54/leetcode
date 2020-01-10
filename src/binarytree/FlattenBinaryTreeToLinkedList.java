package binarytree;

import binarytree.BinaryTreeTest.TreeNode;

/**
 * @author Shogo Akiyama 
 * Solved on 12/05/2019
 * 
 * 114. Flatten Binary Tree to Linked List
 * https://leetcode.com/problems/flatten-binary-tree-to-linked-list/
 * Difficulty: Medium
 * 
 * Approach: Recursion
 * Runtime: 0 ms, faster than 100.00% of Java online submissions for Flatten Binary Tree to Linked List.
 * Memory Usage: 36.2 MB, less than 100.00% of Java online submissions for Flatten Binary Tree to Linked List.
 * 
 * Time Complexity: O(n)
 * Space Complexity: O(d) for the recursive stack
 * Where n is the number of nodes in a tree and d is the maximum depth of the tree
 * 
 * @see BinaryTreeTest#testFlattenBinaryTreeToLinkedList()
 */
public class FlattenBinaryTreeToLinkedList {

	public void flatten(TreeNode root) {
		recurse(root);
	}

	private TreeNode recurse(TreeNode root) {
		if (root == null) {
			return null;
		}

		if (root.right != null && root.left != null) {
			TreeNode last = recurse(root.left);
			last.right = root.right;
			last = recurse(root.right);
			root.right = root.left;
			root.left = null;
			return last;

		} else if (root.right != null) {
			return recurse(root.right);

		} else if (root.left != null) {
			root.right = root.left;
			root.left = null;
			return recurse(root.right);

		}

		return root;
	}

}
