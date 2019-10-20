package binarytree;

import binarytree.BinaryTreeTest.TreeNode;

/**
 * @author Shogo Akiyama 
 * Solved on 10/19/2019
 * 
 * 938. Range Sum of BST
 * https://leetcode.com/problems/range-sum-of-bst/
 * Difficulty: Easy
 * 
 * Approach: Recursion
 * Runtime: 0 ms, faster than 100.00% of Java online submissions for Range Sum of BST.
 * Memory Usage: 44.6 MB, less than 98.84% of Java online submissions for Range Sum of BST.
 * 
 * @see BinaryTreeTest#testRangeSumOfBST()
 */
public class RangeSumOfBST {

	public int rangeSumBST(TreeNode root, int L, int R) {
		if (root == null) {
			return 0;
		}

		int count = 0;
		int val = root.val;

		if (val >= L && val <= R) {
			count += val;
			count += rangeSumBST(root.left, L, R);
			count += rangeSumBST(root.right, L, R);
		} else if (val < L) {
			count += rangeSumBST(root.right, L, R);
		} else {
			count += rangeSumBST(root.left, L, R);
		}

		return count;
	}

}
