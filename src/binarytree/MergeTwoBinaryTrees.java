package binarytree;

import binarytree.BinaryTreeTest.TreeNode;

/**
 * @author Shogo Akiyama 
 * Solved on 06/19/2019
 * 
 * 617. Merge Two Binary Trees
 * https://leetcode.com/problems/merge-two-binary-trees/
 * Difficulty: Easy
 * 
 * Approach: Recursion
 * Runtime: 0 ms, faster than 100.00% of Java online submissions for Merge Two Binary Trees.
 * Memory Usage: 40.4 MB, less than 100.00% of Java online submissions for Merge Two Binary Trees.
 * 
 * @see BinaryTreeTest#testMergeTwoBinaryTrees()
 */
public class MergeTwoBinaryTrees {

	public TreeNode mergeTrees(TreeNode t1, TreeNode t2) {
		if (t1 == null) {
			return t2;
		}
		if (t2 == null) {
			return t1;
		}

		t1.val += t2.val;
		t1.left = mergeTrees(t1.left, t2.left);
		t1.right = mergeTrees(t1.right, t2.right);
		return t1;
	}

}
