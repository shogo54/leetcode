package binarytree;

import java.util.List;
import java.util.ArrayList;

import binarytree.BinaryTreeTest.TreeNode;

/**
 * @author Shogo Akiyama 
 * Solved on 05/09/2020
 * 
 * 99. Recover Binary Search Tree
 * https://leetcode.com/problems/recover-binary-search-tree/
 * Difficulty: Hard
 * 
 * Approach: Inorder Traversal & List Iteration
 * Runtime: 3 ms, faster than 37.60% of Java online submissions for Recover Binary Search Tree.
 * Memory Usage: 40.1 MB, less than 80.77% of Java online submissions for Recover Binary Search Tree.
 * 
 * Time Complexity: O(n)
 * Space Complexity: O(n)
 * Where n is the number of nodes in the tree
 * 
 * @see BinaryTreeTest#testRecoverBinarySearchTree()
 */
public class RecoverBinarySearchTree {

	private List<TreeNode> list;

	public void recoverTree(TreeNode root) {
		list = new ArrayList<TreeNode>();
		TreeNode s1 = null;
		TreeNode s2 = null;

		inorder(root);

		for (int i = 0; i < list.size() - 1; i++) {
			if (list.get(i).val > list.get(i + 1).val) {
				if (s1 == null) {
					s1 = list.get(i);
					s2 = list.get(i + 1);
				} else {
					s2 = list.get(i + 1);
					break;
				}
			}
		}

		if (s1 != null) {
			int temp = s1.val;
			s1.val = s2.val;
			s2.val = temp;
		}
	}

	private void inorder(TreeNode root) {
		if (root != null) {
			inorder(root.left);
			list.add(root);
			inorder(root.right);
		}
	}

}
