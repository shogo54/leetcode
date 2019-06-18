/**
 * @author Shogo Akiyama 
 * Solved on 06/17/2019
 * 
 * 108. Convert Sorted Array to Binary Search Tree	
 * https://leetcode.com/problems/convert-sorted-array-to-binary-search-tree/
 * 
 * To run the code in LeetCode, take the codes from the following method(s):
 * - TreeNode sortedArrayToBST(int[] nums)
 * - TreeNode convert(int[] array, int s, int e).
 * 
 * Runtime: 0 ms, faster than 100.00% of Java online submissions for Convert Sorted Array to Binary Search Tree.
 * Memory Usage: 36.8 MB, less than 99.94% of Java online submissions for Convert Sorted Array to Binary Search Tree.
 * 
 */

public class ConvertSortedArrayToBinarySearchTree {

	static class TreeNode {
		int val;
		TreeNode left;
		TreeNode right;
		TreeNode(int x) { val = x; }
	}

	public TreeNode sortedArrayToBST(int[] nums) {
		return convert(nums, 0, nums.length - 1);
	}

	TreeNode convert(int[] array, int s, int e) {
		if (s == e) {
			return new TreeNode(array[s]);
		} else if (s > e) {
			return null;
		}

		TreeNode node = new TreeNode(array[s + (e - s) / 2]);
		node.left = convert(array, s, s + (e - s) / 2 - 1);
		node.right = convert(array, s + (e - s) / 2 + 1, e);
		return node;
	}

}