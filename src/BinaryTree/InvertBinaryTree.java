package BinaryTree;

import BinaryTree.BinaryTreeTest.TreeNode;

/**
 * @author Shogo Akiyama 
 * Solved on 08/18/2019
 * 
 * 226. Invert Binary Tree
 * https://leetcode.com/problems/invert-binary-tree/
 * Difficulty: Easy
 * 
 * To run the code in LeetCode, take the codes from the following method(s):
 * - TreeNode invertTree(TreeNode root).
 * 
 * Runtime: 0 ms, faster than 100.00% of Java online submissions for Invert Binary Tree.
 * Memory Usage: 34.3 MB, less than 100.00% of Java online submissions for Invert Binary Tree.
 * 
 */

public class InvertBinaryTree {

	public TreeNode invertTree(TreeNode root) {
        if(root == null){
            return null;
        }
        
        TreeNode left = root.left;
        root.left = invertTree(root.right);
        root.right = invertTree(left);
        return root;
    }
	
}
