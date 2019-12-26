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
 * 
 * Time Complexity: O(n)
 * Space Complexity: O(n)
 * Where n is the number of nodes in a tree
 * 
 * @see BinaryTreeTest#testMaximumDepthOfBinaryTree()
 */
public class MaximumDepthOfBinaryTree2 {

	public int maxDepth(TreeNode root) {
		Queue<Object[]> q = new LinkedList<Object[]>();
		int max = 0;

		q.offer(new Object[] { root, 0 });

		while (!q.isEmpty()) {
			TreeNode node = (TreeNode) q.element()[0];
			int count = (Integer) q.poll()[1];

			if (node == null) {
				max = Math.max(max, count);
			} else {
				q.offer(new Object[] { node.left, count + 1 });
				q.offer(new Object[] { node.right, count + 1 });
			}
		}

		return max;
	}

}
