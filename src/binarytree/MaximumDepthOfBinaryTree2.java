package binarytree;

import java.util.*;

import binarytree.BinaryTreeTest.TreeNode;

/**
 * @author Shogo Akiyama 
 * Solved on 12/26/2019
 * 
 * 104. Maximum Depth of Binary Tree
 * https://leetcode.com/problems/maximum-depth-of-binary-tree/
 * Difficulty: Easy
 * 
 * Approach: Queue & Iteration
 * Runtime: 2 ms, faster than 11.45% of Java online submissions for Maximum Depth of Binary Tree.
 * Memory Usage: 39.3 MB, less than 93.55% of Java online submissions for Maximum Depth of Binary Tree.
 * 
 * Time Complexity: O(n)
 * Space Complexity: O(n)
 * Where n is the number of nodes in a tree
 * 
 * @see BinaryTreeTest#testMaximumDepthOfBinaryTree()
 */
public class MaximumDepthOfBinaryTree2 {

	public int maxDepth(TreeNode root) {
		if (root == null) {
			return 0;
		}

		Queue<Object[]> q = new LinkedList<Object[]>();
		int max = 0;
		q.offer(new Object[] { root, 1 });

		while (!q.isEmpty()) {
			TreeNode node = (TreeNode) q.element()[0];
			int count = (Integer) q.poll()[1];
			max = Math.max(max, count);

			if (node.left != null) {
				q.offer(new Object[] { node.left, count + 1 });
			}
			if (node.right != null) {
				q.offer(new Object[] { node.right, count + 1 });
			}
		}

		return max;
	}

}
