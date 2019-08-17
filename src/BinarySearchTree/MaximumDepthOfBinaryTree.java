package BinarySearchTree;

import BinarySearchTree.BinarySearchTreeTest.TreeNode;

/**
 * @author Shogo Akiyama 
 * Solved on 06/19/2019
 * 
 * 104. Maximum Depth of Binary Tree
 * https://leetcode.com/problems/maximum-depth-of-binary-tree/
 * Difficulty: Easy
 * 
 * To run the code in LeetCode, take the codes from the following method(s):
 * - int maxDepth(TreeNode root).
 * 
 * Runtime: 0 ms, faster than 100.00% of Java online submissions for Maximum Depth of Binary Tree.
 * Memory Usage: 39 MB, less than 97.27% of Java online submissions for Maximum Depth of Binary Tree.
 * 
 */

public class MaximumDepthOfBinaryTree {
	
	public int maxDepth(TreeNode root) {
        if(root == null){
            return 0;
        }
        
        int leftCount = 1 + maxDepth(root.left);
        int rightCount = 1 + maxDepth(root.right);
        return (leftCount>rightCount)? leftCount: rightCount;
    }
	
}
