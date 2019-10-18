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
 * Approach: Recursion (Optimized)
 * Runtime: 2 ms, faster than 97.50% of Java online submissions for Construct Binary Tree from Preorder and Inorder Traversal.
 * Memory Usage: 38.9 MB, less than 16.82% of Java online submissions for Construct Binary Tree from Preorder and Inorder Traversal.
 * 
 * @see BinaryTreeTest#testConstructBinaryTreeFromPreorderAndInorderTraversal()
 */
public class ConstructBinaryTreeFromPreorderAndInorderTraversal2 {

	private int[] pre;
	private Map<Integer, Integer> inMap = new HashMap<Integer, Integer>();

	public TreeNode buildTree(int[] preorder, int[] inorder) {
		pre = preorder;

		for (int i = 0; i < pre.length; i++) {
			inMap.put(inorder[i], i);
		}

		return build(0, pre.length - 1, 0);
	}

	private TreeNode build(int s, int e, int dif) {
		if (s > e) {
			return null;
		}

		int rootVal = pre[s + dif];
		TreeNode root = new TreeNode(rootVal);
		int index = inMap.get(rootVal);

		root.left = build(s, index - 1, dif + 1);
		root.right = build(index + 1, e, dif);

		return root;
	}

}
