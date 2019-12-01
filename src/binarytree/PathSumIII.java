package binarytree;

import java.util.*;

import binarytree.BinaryTreeTest.TreeNode;

/**
 * @author Shogo Akiyama 
 * Solved on 11/30/2019
 * 
 * 437. Path Sum III
 * https://leetcode.com/problems/path-sum-iii/
 * Difficulty: Easy
 * 
 * Approach: Recursion & List
 * Runtime: 35 ms, faster than 6.06% of Java online submissions for Path Sum III.
 * Memory Usage: 40.1 MB, less than 77.27% of Java online submissions for Path Sum III.
 * 
 * @see BinaryTreeTest#testPathSumIII()
 */
public class PathSumIII {
	
	private int count = 0;

	public int pathSum(TreeNode root, int sum) {
		subSum(root, sum);
		return count;
	}

	private List<Integer> subSum(TreeNode root, int sum) {
		if (root == null) {
			return new ArrayList<Integer>();
		}

		List<Integer> list = subSum(root.left, sum);
		list.addAll(subSum(root.right, sum));

		for (int i = 0; i < list.size(); i++) {
			int newVal = list.get(i) + root.val;
			list.set(i, newVal);
			if (newVal == sum) {
				count++;
			}
		}

		if (root.val == sum) {
			count++;
		}
		list.add(root.val);

		return list;
	}
	
}
