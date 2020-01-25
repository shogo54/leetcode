package binarytree;

import java.util.*;

import binarytree.BinaryTreeTest.TreeNode;

/**
 * @author Shogo Akiyama 
 * Solved on 01/24/2020
 * 
 * 1161. Maximum Level Sum of a Binary Tree
 * https://leetcode.com/problems/maximum-level-sum-of-a-binary-tree/
 * Difficulty: Medium
 * 
 * Approach: Recursion
 * Runtime: 14 ms, faster than 22.93% of Java online submissions for Maximum Level Sum of a Binary Tree.
 * Memory Usage: 71.6 MB, less than 100.00% of Java online submissions for Maximum Level Sum of a Binary Tree.
 * 
 * Time Complexity: O(n)
 * Space Complexity: O(n)
 * Where n is the number of nodes in a tree
 * 
 * @see BinaryTreeTest#testMaximumLevelSumOfABinaryTree()
 */
public class MaximumLevelSumOfABinaryTree {

	private Map<Integer, Integer> map = new HashMap<Integer, Integer>();

	public int maxLevelSum(TreeNode root) {
		levelSum(root, 1);
		int max = Integer.MIN_VALUE;
		int level = 0;
		for (Map.Entry<Integer, Integer> e : map.entrySet()) {
			if (e.getValue() > max) {
				max = e.getValue();
				level = e.getKey();
			}
		}
		return level;
	}

	private void levelSum(TreeNode root, int level) {
		if (root == null) {
			return;
		}
		map.put(level, map.getOrDefault(level, 0) + root.val);
		levelSum(root.left, level + 1);
		levelSum(root.right, level + 1);
	}

}
