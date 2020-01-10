package binarytree;

import java.util.*;

import binarytree.BinaryTreeTest.TreeNode;

/**
 * @author Shogo Akiyama 
 * Solved on 01/09/2020
 * 
 * 1110. Delete Nodes And Return Forest
 * https://leetcode.com/problems/delete-nodes-and-return-forest/
 * Difficulty: Medium
 * 
 * Approach: Recursion
 * Runtime: 2 ms, faster than 97.35% of Java online submissions for Delete Nodes And Return Forest.
 * Memory Usage: 43.2 MB, less than 100.00% of Java online submissions for Delete Nodes And Return Forest.
 * 
 * Time Complexity: O(n)
 * Space Complexity: O(d) for the recursive stack
 * Where n is the number of nodes in a tree and d is the maximum depth of the tree
 * 
 * @see BinaryTreeTest#testHouseRobberIII()
 */
public class DeleteNodesAndReturnForest {

	private Set<Integer> toDelete;
	private List<TreeNode> roots;

	public List<TreeNode> delNodes(TreeNode root, int[] to_delete) {
		toDelete = new HashSet<Integer>();
		roots = new ArrayList<TreeNode>();

		for (int d : to_delete) {
			toDelete.add(d);
		}

		TreeNode newRoot = delete(root);
		if (newRoot != null) {
			roots.add(newRoot);
		}

		return roots;
	}

	private TreeNode delete(TreeNode root) {
		if (root == null) {
			return null;
		}
		if (toDelete.contains(root.val)) {
			TreeNode left = delete(root.left);
			if (left != null) {
				roots.add(left);
			}

			TreeNode right = delete(root.right);
			if (right != null) {
				roots.add(right);
			}
			return null;
		}

		root.left = delete(root.left);
		root.right = delete(root.right);
		return root;
	}

}
