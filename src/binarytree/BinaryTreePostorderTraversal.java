package binarytree;

import java.util.*;

import binarytree.BinaryTreeTest.TreeNode;

/**
 * @author Shogo Akiyama 
 * Solved on 06/11/2019
 * 
 * 145. Binary Tree Postorder Traversal
 * https://leetcode.com/problems/binary-tree-postorder-traversal/
 * Difficulty: Hard
 * 
 * Approach: Recursion
 * Runtime: 0 ms, faster than 100.00% of Java online submissions for Binary Tree Postorder Traversal.
 * Memory Usage: 34.7 MB, less than 99.98% of Java online submissions for Binary Tree Postorder Traversal.
 * 
 * @see BinaryTreeTest#testBinaryTreePostorderTraversal()
 */
public class BinaryTreePostorderTraversal {

	public List<Integer> postorderTraversal(TreeNode root) {
		List<Integer> result = new ArrayList<Integer>();
		helper(root, result);
		return result;
	}

	void helper(TreeNode node, List<Integer> result) {
		if (node == null) {
			return;
		}
		if (node.left != null) {
			helper(node.left, result);
		}
		if (node.right != null) {
			helper(node.right, result);
		}
		result.add(node.val);
	}

}