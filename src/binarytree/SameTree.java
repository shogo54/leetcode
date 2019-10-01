package binarytree;

import binarytree.BinaryTreeTest.TreeNode;

/**
 * @author Shogo Akiyama 
 * Solved on 08/13/2019
 * 
 * 100. Same Tree
 * https://leetcode.com/problems/same-tree/
 * Difficulty: Easy
 * 
 * To run the code in LeetCode, take the codes from the following method(s):
 * - boolean isSameTree(TreeNode p, TreeNode q).
 * 
 * Runtime: 0 ms, faster than 100.00% of Java online submissions for Same Tree.
 * Memory Usage: 34.4 MB, less than 100.00% of Java online submissions for Same Tree.
 * 
 */

public class SameTree {

	public boolean isSameTree(TreeNode p, TreeNode q) {
        if(p == null && q == null){
            return true;
        }
        if((p == null && q != null) || (p != null && q == null)){
            return false;
        }
        if(p.val != q.val){
            return false;
        }
        return isSameTree(p.left, q.left) && isSameTree(p.right, q.right);
    }
	
}
