package binarytree;

import java.util.*;

import binarytree.BinaryTreeTest.TreeNode;

/**
 * @author Shogo Akiyama 
 * Solved on 01/29/2020
 * 
 * 173. Binary Search Tree Iterator
 * https://leetcode.com/problems/binary-search-tree-iterator/
 * Difficulty: Medium
 * 
 * Approach: Stack
 * Runtime: 15 ms, faster than 99.44% of Java online submissions for Binary Search Tree Iterator.
 * Memory Usage: 44.9 MB, less than 100.00% of Java online submissions for Binary Search Tree Iterator.
 * 
 * Time Complexity: O(d)
 * Space Complexity: O(d)
 * Where d is the depth of a tree
 * 
 * @see BinaryTreeTest#testBSTIterator()
 */
public class BSTIterator {

	private Stack<TreeNode> stack;

	public BSTIterator(TreeNode root) {
		stack = new Stack<TreeNode>();
		while (root != null) {
			stack.push(root);
			root = root.left;
		}
	}

	/** @return the next smallest number */
	public int next() {
		TreeNode node = stack.pop();
		int val = node.val;
		node = node.right;
		while (node != null) {
			stack.push(node);
			node = node.left;
		}
		return val;
	}

	/** @return whether we have a next smallest number */
	public boolean hasNext() {
		return !stack.isEmpty();
	}

}

/**
 * Your BSTIterator object will be instantiated and called as such:
 * BSTIterator obj = new BSTIterator(root);
 * int param_1 = obj.next();
 * boolean param_2 = obj.hasNext();
 */