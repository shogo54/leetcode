package binarytree;

import java.util.*;

import binarytree.BinaryTreeTest.TreeNode;

/**
 * @author Shogo Akiyama 
 * Solved on 07/10/2020
 * 
 * 107. Binary Tree Level Order Traversal II
 * https://leetcode.com/problems/binary-tree-level-order-traversal-ii/
 * Difficulty: Easy
 * 
 * Approach: DFS and Recursion
 * Runtime: 1 ms, faster than 88.82% of Java online submissions for Binary Tree Level Order Traversal II.
 * Memory Usage: 40.7 MB, less than 8.77% of Java online submissions for Binary Tree Level Order Traversal II.
 * 
 * @see BinaryTreeTest#testBinaryTreeLevelOrderTraversalII()
 */
public class BinaryTreeLevelOrderTraversalII {

	private List<List<Integer>> list = new LinkedList<List<Integer>>();

	public List<List<Integer>> levelOrderBottom(TreeNode root) {
		bfs(root, 0);
		return list;
	}

	private void bfs(TreeNode root, int level) {
		if (root == null) {
			return;
		}

		if (list.size() == level) {
			list.add(0, new ArrayList<Integer>());
		}

		list.get(list.size() - 1 - level).add(root.val);
		bfs(root.left, level + 1);
		bfs(root.right, level + 1);
	}

}
