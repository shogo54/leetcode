package binarytree;

import java.util.*;

import binarytree.BinaryTreeTest.TreeNode;

/**
 * @author Shogo Akiyama 
 * Solved on 07/03/2020
 * 
 * 199. Binary Tree Right Side View
 * https://leetcode.com/problems/binary-tree-right-side-view/
 * Difficulty: Medium
 * 
 * Approach: BFS and Queue
 * Runtime: 2 ms, faster than 17.52% of Java online submissions for Binary Tree Right Side View.
 * Memory Usage: 40.3 MB, less than 5.04% of Java online submissions for Binary Tree Right Side View.
 * 
 * Time Complexity: O(n)
 * Space Complexity: O(n)
 * Where n is the number of nodes in the tree
 * 
 * @see BinaryTreeTest#testBinaryTreeRightSideView()
 */
public class BinaryTreeRightSideView {

	public List<Integer> rightSideView(TreeNode root) {
		List<Integer> res = new ArrayList<Integer>();
		if (root == null) {
			return res;
		}

		Queue<TreeNode> que = new ArrayDeque<TreeNode>();
		Queue<Integer> levels = new ArrayDeque<Integer>();
		TreeNode prev = null;
		int level = 0;

		que.offer(root);
		levels.offer(0);

		while (!que.isEmpty()) {
			TreeNode currNode = que.poll();
			Integer currLevel = levels.poll().intValue();

			if (currLevel > level) {
				res.add(prev.val);
				level = currLevel;
			}

			if (currNode.left != null) {
				que.offer(currNode.left);
				levels.offer(currLevel + 1);
			}
			if (currNode.right != null) {
				que.offer(currNode.right);
				levels.offer(currLevel + 1);
			}
			prev = currNode;
		}

		res.add(prev.val);

		return res;
	}

}
