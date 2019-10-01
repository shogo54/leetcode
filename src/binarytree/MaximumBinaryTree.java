package binarytree;

import binarytree.BinaryTreeTest.TreeNode;

/**
 * @author Shogo Akiyama 
 * Solved on 09/30/2019
 * 
 * 654. Maximum Binary Tree
 * https://leetcode.com/problems/maximum-binary-tree/
 * Difficulty: Medium
 * 
 * To run the code in LeetCode, take the codes from the following method(s) and all properties:
 * - TreeNode constructMaximumBinaryTree(int[] nums)
 * - TreeNode recurse(int[] nums, int s, int e).
 * 
 * Runtime: 2 ms, faster than 99.65% of Java online submissions for Maximum Binary Tree.
 * Memory Usage: 38.2 MB, less than 97.83% of Java online submissions for Maximum Binary Tree.
 * 
 */

public class MaximumBinaryTree {

	public TreeNode constructMaximumBinaryTree(int[] nums) {
		return recurse(nums, 0, nums.length - 1);
	}

	private TreeNode recurse(int[] nums, int s, int e) {
		if (s > e) {
			return null;
		}
		if (s == e) {
			return new TreeNode(nums[s]);
		}

		int max = nums[s];
		int index = s;

		for (int i = s + 1; i <= e; i++) {
			if (nums[i] > max) {
				max = nums[i];
				index = i;
			}
		}

		TreeNode node = new TreeNode(nums[index]);
		node.left = recurse(nums, s, index - 1);
		node.right = recurse(nums, index + 1, e);
		return node;
	}

}
