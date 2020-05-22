package binarytree;

import binarytree.BinaryTreeTest.TreeNode;

/**
 * @author Shogo Akiyama 
 * Solved on 05/22/2020
 * 
 * 1448. Count Good Nodes in Binary Tree
 * https://leetcode.com/problems/count-good-nodes-in-binary-tree/
 * Difficulty: Medium
 * 
 * Approach: Recursion
 * Runtime: 2 ms, faster than 99.46% of Java online submissions for Count Good Nodes in Binary Tree.
 * Memory Usage: 48.3 MB, less than 100.00% of Java online submissions for Count Good Nodes in Binary Tree.
 * 
 * Time Complexity: O(n)
 * Space Complexity: O(n) for the recursive stack
 * Where n is the number of nodes in the tree
 * 
 * @see BinaryTreeTest#testCountGoodNodesInBinaryTree()
 */
public class CountGoodNodesInBinaryTree {

	public int goodNodes(TreeNode root) {
		return goodNodes(root, root.val);
	}

	private int goodNodes(TreeNode root, int max) {
		if (root == null) {
			return 0;
		}
		int count = 0;
		if (root.val >= max) {
			count++;
			max = root.val;
		}
		count += goodNodes(root.left, max);
		count += goodNodes(root.right, max);

		return count;
	}

}
