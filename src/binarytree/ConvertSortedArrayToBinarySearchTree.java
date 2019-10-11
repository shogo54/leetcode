package binarytree;

import binarytree.BinaryTreeTest.TreeNode;

/**
 * @author Shogo Akiyama 
 * Solved on 06/17/2019
 * 
 * 108. Convert Sorted Array to Binary Search Tree
 * https://leetcode.com/problems/convert-sorted-array-to-binary-search-tree/
 * Difficulty: Easy
 * 
 * Approach: 
 * Runtime: 0 ms, faster than 100.00% of Java online submissions for Convert Sorted Array to Binary Search Tree.
 * Memory Usage: 36.8 MB, less than 99.94% of Java online submissions for Convert Sorted Array to Binary Search Tree.
 * 
 * @see BinaryTreeTest#testConvertSortedArrayToBinarySearchTree()
 */
public class ConvertSortedArrayToBinarySearchTree {

	public TreeNode sortedArrayToBST(int[] nums) {
		return convert(nums, 0, nums.length - 1);
	}

	private TreeNode convert(int[] array, int s, int e) {
		if (s == e) {
			return new TreeNode(array[s]);
		} else if (s > e) {
			return null;
		}

		int mid = s + (e - s) / 2;
		TreeNode node = new TreeNode(array[mid]);
		node.left = convert(array, s, mid - 1);
		node.right = convert(array, mid + 1, e);
		return node;
	}

}