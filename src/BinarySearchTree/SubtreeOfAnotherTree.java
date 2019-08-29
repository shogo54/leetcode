package BinarySearchTree;

import BinarySearchTree.BinarySearchTreeTest.TreeNode;

/**
 * @author Shogo Akiyama 
 * Solved on 08/29/2019
 * 
 * 572. Subtree of Another Tree
 * https://leetcode.com/problems/subtree-of-another-tree/
 * Difficulty: Easy
 * 
 * To run the code in LeetCode, take the codes from the following method(s) and all properties:
 * - boolean isSubtree(TreeNode s, TreeNode t).
 * 
 * Runtime: 1 ms, faster than 100.00% of Java online submissions for Subtree of Another Tree.
 * Memory Usage: 40.6 MB, less than 95.56% of Java online submissions for Subtree of Another Tree.
 * 
 */

public class SubtreeOfAnotherTree {

	public boolean isSubtree(TreeNode s, TreeNode t) {
		if (t == null && s == null) {
			return true;
		} else if (s == null) {
			return false;
		} else if (s != null && t == null) {
			return false;
		}

		if (s.val == t.val) {
			boolean b = true;
			if (s.left != null && t.left != null) {
				b = (s.left.val == t.left.val);
			}
			if (s.right != null && t.right != null) {
				b = (s.right.val == t.right.val);
			}
			if (b == true) {
				b = isSubtree(s.left, t.left) && isSubtree(s.right, t.right);
			}
			if (b == true) {
				return true;
			}
		}

		return isSubtree(s.left, t) || isSubtree(s.right, t);
	}

}
