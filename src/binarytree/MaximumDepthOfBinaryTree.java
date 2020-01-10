package binarytree;

import binarytree.BinaryTreeTest.TreeNode;

/**
 * @author Shogo Akiyama 
 * Solved on 06/19/2019
 * 
 * 104. Maximum Depth of Binary Tree
 * https://leetcode.com/problems/maximum-depth-of-binary-tree/
 * Difficulty: Easy
 * 
 * Approach: Recursion
 * Runtime: 0 ms, faster than 100.00% of Java online submissions for Maximum Depth of Binary Tree.
 * Memory Usage: 39 MB, less than 97.27% of Java online submissions for Maximum Depth of Binary Tree.
 * 
 * Time Complexity: O(n)
 * Space Complexity: O(d) for the recursive stack
 * Where n is the number of nodes in a tree and d is the maximum depth of the tree
 * 
 * @see BinaryTreeTest#testMaximumDepthOfBinaryTree()
 */
public class MaximumDepthOfBinaryTree {

	public int maxDepth(TreeNode root) {
		if (root == null) {
			return 0;
		}

		int leftCount = 1 + maxDepth(root.left);
		int rightCount = 1 + maxDepth(root.right);
		return (leftCount > rightCount) ? leftCount : rightCount;
	}

}
