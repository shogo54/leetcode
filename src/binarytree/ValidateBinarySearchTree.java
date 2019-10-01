package binarytree;

import java.util.*;

import binarytree.BinaryTreeTest.TreeNode;

/**
 * @author Shogo Akiyama 
 * Solved on 08/18/2019
 * 
 * 98. Validate Binary Search Tree
 * https://leetcode.com/problems/validate-binary-search-tree/
 * Difficulty: Medium
 * 
 * To run the code in LeetCode, take the codes from the following method(s) and all properites:
 * - Queue<Integer> q
 * - boolean isValidBST(TreeNode root)
 * - void inorder(TreeNode node).
 * 
 * Runtime: 1 ms, faster than 44.18% of Java online submissions for Validate Binary Search Tree.
 * Memory Usage: 39.5 MB, less than 80.47% of Java online submissions for Validate Binary Search Tree.
 * 
 */

public class ValidateBinarySearchTree {

    Queue<Integer> q = new ArrayDeque<Integer>();
    
    public boolean isValidBST(TreeNode root) {
        if(root == null){
            return true;
        }
        inorder(root);
        
        int prev = q.poll();
        while(!q.isEmpty()){
            int value = q.poll();
            if(prev >= value){
                return false;
            }
            prev = value;
        }
        return true;
    }
    
    private void inorder(TreeNode node){
        if(node.left != null){
            inorder(node.left);
        }
        q.offer(node.val);
        if(node.right != null){
            inorder(node.right);
        }
    }
    
}
