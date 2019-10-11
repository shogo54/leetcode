package binarytree;

import binarytree.BinaryTreeTest.TreeNode;

/**
 * @author Shogo Akiyama 
 * Solved on 08/27/2019
 * 
 * 230. Kth Smallest Element in a BST
 * https://leetcode.com/problems/kth-smallest-element-in-a-bst/
 * Difficulty: Medium
 * 
 * Approach: Recursion
 * Runtime: 0 ms, faster than 100.00% of Java online submissions for Kth Smallest Element in a BST.
 * Memory Usage: 36.8 MB, less than 100.00% of Java online submissions for Kth Smallest Element in a BST.
 * 
 * @see BinaryTreeTest#testKthSmallestElementInABST()
 */
public class KthSmallestElementInABST {

	private int num;
	private int result;

	public int kthSmallest(TreeNode root, int k) {
		num = k;
		search(root);
		return result;
	}

	private void search(TreeNode root) {
		if (root.left != null) {
			search(root.left);
		}

		num--;

		if (num == 0) {
			result = root.val;
			return;
		}

		if (root.right != null) {
			search(root.right);
		}
	}

}
