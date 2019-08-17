package BinarySearchTree;

import java.util.*;

import BinarySearchTree.BinarySearchTreeTest.TreeNode;

/**
 * @author Shogo Akiyama 
 * Solved on 06/12/2019
 * 
 * 508. Most Frequent Subtree Sum
 * https://leetcode.com/problems/most-frequent-subtree-sum/
 * Difficulty: Medium
 * 
 * To run the code in LeetCode, take the codes from the following method(s):
 * - int[] findFrequentTreeSum(TreeNode root)
 * - int subtreeSum(TreeNode node, Map<Integer, Integer> map).
 * 
 * Runtime: 10 ms, faster than 32.61% of Java online submissions for Most Frequent Subtree Sum.
 * Memory Usage: 37.6 MB, less than 100.00% of Java online submissions for Most Frequent Subtree Sum.
 * 
 */

public class MostFrequentSubtreeSum {

	public int[] findFrequentTreeSum(TreeNode root) {
        if(root == null){
            return new int[0];
        }
        
        Map<Integer, Integer> counter = new TreeMap<Integer, Integer>();
        subtreeSum(root, counter);
        
        List<Integer> freqList = new ArrayList<Integer>(counter.values());
        Collections.sort(freqList);
        int maxFreq = freqList.get(freqList.size()-1);
        
        List<Integer> values = new ArrayList<Integer>();
        for(Map.Entry<Integer, Integer> e: counter.entrySet()){
            if(e.getValue() == maxFreq){
                values.add(e.getKey());
            }
        }
        
        int[] result = new int[values.size()];
        for(int i=0; i<values.size(); i++){
            result[i] = values.get(i);
        }
        
        return result;
    }
    
    private int subtreeSum(TreeNode node, Map<Integer, Integer> map){
        int sum = node.val;
        if(node.left != null){
            sum += subtreeSum(node.left, map);
        }
        if(node.right != null){
            sum += subtreeSum(node.right, map);
        }
        
        if(!map.containsKey(sum)){
            map.put(sum, 0);
        }
        map.put(sum, map.get(sum)+1);
        
        return sum;
    }
    
}