package binarytree;

import java.util.*;

import binarytree.BinaryTreeTest.TreeNode;

/**
 * @author Shogo Akiyama 
 * Solved on 01/25/2020
 * 
 * 1261. Find Elements in a Contaminated Binary Tree
 * https://leetcode.com/problems/find-elements-in-a-contaminated-binary-tree/
 * Difficulty: Medium
 * 
 * Approach: Recursion
 * Runtime: 20 ms, faster than 97.57% of Java online submissions for Find Elements in a Contaminated Binary Tree.
 * Memory Usage: 43.1 MB, less than 100.00% of Java online submissions for Find Elements in a Contaminated Binary Tree.
 * 
 * Time Complexity: O(n)
 * Space Complexity: O(n)
 * Where n is the number of nodes in a tree
 * 
 * @see BinaryTreeTest#testFindElements()
 */
public class FindElements {

	TreeNode r;
	Set<Integer> set;

	public FindElements(TreeNode root) {
		r = root;
		set = new HashSet<Integer>();
		recover(root);
	}

	private void recover(TreeNode node) {
		if (node == r) {
			node.val = 0;
		}
		if (node.left != null) {
			node.left.val = node.val * 2 + 1;
			recover(node.left);
		}
		if (node.right != null) {
			node.right.val = node.val * 2 + 2;
			recover(node.right);
		}
		set.add(node.val);
	}

	public boolean find(int target) {
		return set.contains(target);
	}
}
