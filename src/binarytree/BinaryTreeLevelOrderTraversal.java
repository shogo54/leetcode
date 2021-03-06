package binarytree;

import java.util.*;

import binarytree.BinaryTreeTest.TreeNode;

/**
 * @author Shogo Akiyama 
 * Solved on 08/18/2019
 * 
 * 102. Binary Tree Level Order Traversal
 * https://leetcode.com/problems/binary-tree-level-order-traversal/
 * Difficulty: Medium
 * 
 * Approach: Recursion & DFS
 * Runtime: 1 ms, faster than 89.30% of Java online submissions for Binary Tree Level Order Traversal.
 * Memory Usage: 36.2 MB, less than 100.00% of Java online submissions for Binary Tree Level Order Traversal.
 * 
 * @see BinaryTreeTest#testBinaryTreeLevelOrderTraversal()
 */
public class BinaryTreeLevelOrderTraversal {

	Map<Integer, List<Integer>> map = new HashMap<Integer, List<Integer>>();

	public List<List<Integer>> levelOrder(TreeNode root) {
		depth(root, 0);
		return new ArrayList<List<Integer>>(map.values());
	}

	private void depth(TreeNode node, int count) {
		if (node == null) {
			return;
		}
		if (!map.containsKey(count)) {
			map.put(count, new ArrayList<Integer>());
		}

		map.get(count).add(node.val);

		if (node.left != null) {
			depth(node.left, count + 1);
		}
		if (node.right != null) {
			depth(node.right, count + 1);
		}
	}

}
