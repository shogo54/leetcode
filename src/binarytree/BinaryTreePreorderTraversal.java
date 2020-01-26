package binarytree;

import java.util.*;

import binarytree.BinaryTreeTest.TreeNode;

/**
 * @author Shogo Akiyama 
 * Solved on 01/26/2020
 * 
 * 144. Binary Tree Preorder Traversal
 * https://leetcode.com/problems/binary-tree-preorder-traversal/
 * Difficulty: Medium
 * 
 * Approach: Recursion
 * Runtime: 0 ms, faster than 100.00% of Java online submissions for Binary Tree Preorder Traversal.
 * Memory Usage: 38 MB, less than 5.17% of Java online submissions for Binary Tree Preorder Traversal.
 * 
 * Time Complexity: O(n)
 * Space Complexity: O(n)
 * Where n is the number of nodes in a tree
 * 
 * @see BinaryTreeTest#testBinaryTreePreorderTraversal()
 */
public class BinaryTreePreorderTraversal {

	private List<Integer> list = new ArrayList<Integer>();

	public List<Integer> preorderTraversal(TreeNode root) {
		if (root != null) {
			list.add(root.val);
			preorderTraversal(root.left);
			preorderTraversal(root.right);
		}
		return list;
	}

}
