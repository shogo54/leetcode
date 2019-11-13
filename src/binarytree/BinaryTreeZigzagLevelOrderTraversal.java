package binarytree;

import java.util.*;

import binarytree.BinaryTreeTest.TreeNode;

/**
 * @author Shogo Akiyama 
 * Solved on 11/11/2019
 * 
 * 103. Binary Tree Zigzag Level Order Traversal
 * https://leetcode.com/problems/binary-tree-zigzag-level-order-traversal/
 * Difficulty: Medium
 * 
 * Approach: BFS and Reverse
 * Runtime: 1 ms, faster than 96.76% of Java online submissions for Binary Tree Zigzag Level Order Traversal.
 * Memory Usage: 36 MB, less than 99.04% of Java online submissions for Binary Tree Zigzag Level Order Traversal.
 * 
 * @see BinaryTreeTest#testBinaryTreeZigzagLevelOrderTraversal()
 */
public class BinaryTreeZigzagLevelOrderTraversal {

	public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
		if (root == null) {
			return new ArrayList<List<Integer>>();
		}
		List<List<Integer>> list = new ArrayList<List<Integer>>();
		Queue<TreeNode> queue = new LinkedList<TreeNode>();
		Queue<Integer> counts = new LinkedList<Integer>();

		queue.add(root);
		counts.add(0);

		while (!queue.isEmpty()) {
			TreeNode curr = queue.poll();

			if (curr != null) {
				List<Integer> currList;
				int count = counts.poll();

				if (count < list.size()) {
					currList = list.get(count);
				} else {
					currList = new ArrayList<Integer>();
					list.add(currList);
				}

				currList.add(curr.val);

				if (curr.left != null) {
					queue.add(curr.left);
					counts.add(count + 1);
				}
				if (curr.right != null) {
					queue.add(curr.right);
					counts.add(count + 1);
				}
			}
		}

		for (int i = 1; i < list.size(); i += 2) {
			Collections.reverse(list.get(i));
		}

		return list;
	}

}
