/**
 * @author Shogo Akiyama 
 * Solved on 06/10/2019
 * 
 * 700. Search in a Binary Search Tree
 * https://leetcode.com/problems/search-in-a-binary-search-tree/
 * Difficulty: Easy
 * 
 * To run the code in LeetCode, take the codes from the following method(s):
 * - TreeNode searchBST(TreeNode root, int val).
 * 
 * Runtime: 0 ms, faster than 100.00% of Java online submissions for Search in a Binary Search Tree.
 * Memory Usage: 38.8 MB, less than 98.47% of Java online submissions for Search in a Binary Search Tree.
 * 
 */

public class SearchInABinarySearchTree {
	
	static class TreeNode{
		int val;
		TreeNode left;
		TreeNode right;
		TreeNode(int x) { val = x; }
	}
	
    public TreeNode searchBST(TreeNode root, int val) {
        if(root.val == val){
            return root;
        }else if(root.val > val){
            return root.left != null? searchBST(root.left, val) : null;
        }else{
            return root.right != null? searchBST(root.right, val) : null;
        }
    }
    
}