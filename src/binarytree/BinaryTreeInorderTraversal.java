package binarytree;

import java.util.*;

import binarytree.BinaryTreeTest.TreeNode;

/**
 * @author Shogo Akiyama 
 * Solved on 08/02/2019
 * 
 * 94. Binary Tree Inorder Traversal
 * https://leetcode.com/problems/binary-tree-inorder-traversal/
 * Difficulty: Medium
 * 
 * Approach: Recursion
 * Runtime: 0 ms, faster than 100.00% of Java online submissions for Binary Tree Inorder Traversal.
 * Memory Usage: 34.8 MB, less than 100.00% of Java online submissions for Binary Tree Inorder Traversal.
 * 
 * @see BinaryTreeTest#testBinaryTreeInorderTraversal()
 */
public class BinaryTreeInorderTraversal {

	List<Integer> list = new ArrayList<Integer>();

	public List<Integer> inorderTraversal(TreeNode root) {
		if (root == null) {
			return list;
		}
		if (root.left != null) {
			inorderTraversal(root.left);
		}
		list.add(root.val);
		if (root.right != null) {
			inorderTraversal(root.right);
		}
		return list;
	}

}
