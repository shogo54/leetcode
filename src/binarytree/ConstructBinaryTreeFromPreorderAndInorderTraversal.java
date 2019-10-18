package binarytree;

import java.util.*;

import binarytree.BinaryTreeTest.TreeNode;

/**
 * @author Shogo Akiyama 
 * Solved on 10/17/2019
 * 
 * 105. Construct Binary Tree from Preorder and Inorder Traversal
 * https://leetcode.com/problems/construct-binary-tree-from-preorder-and-inorder-traversal/
 * Difficulty: Medium
 * 
 * Approach: Recursion with ArrayList
 * Runtime: 32 ms, faster than 5.05% of Java online submissions for Construct Binary Tree from Preorder and Inorder Traversal.
 * Memory Usage: 38.7 MB, less than 17.76% of Java online submissions for Construct Binary Tree from Preorder and Inorder Traversal.
 * 
 * @see BinaryTreeTest#testConstructBinaryTreeFromPreorderAndInorderTraversal()
 */
public class ConstructBinaryTreeFromPreorderAndInorderTraversal {

	List<Integer> pre = new ArrayList<Integer>();
	List<Integer> in = new ArrayList<Integer>();
	int len;

	public TreeNode buildTree(int[] preorder, int[] inorder) {
		len = inorder.length;

		for (int i = 0; i < len; i++) {
			pre.add(preorder[i]);
			in.add(inorder[i]);
		}

		return build(0, len - 1);
	}

	private TreeNode build(int s, int e) {
		if (s == e) {
			return new TreeNode(in.get(s));
		} else if (s > e) {
			return null;
		}

		int rootVal = pre.get(s);
		TreeNode root = new TreeNode(rootVal);

		int index = -1;
		for (int i = s; i <= e; i++) {
			if (in.get(i) == rootVal) {
				index = i;
				break;
			}
		}

		pre.remove(s);
		pre.add(index, rootVal);

		root.left = build(s, index - 1);
		root.right = build(index + 1, e);

		return root;
	}
}
