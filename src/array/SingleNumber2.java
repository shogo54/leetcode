package array;

import java.util.*;

/**
 * @author Shogo Akiyama 
 * Solved on 05/20/2020
 * Time: 15m
 * 
 * 136. Single Number
 * https://leetcode.com/problems/single-number/
 * Difficulty: Easy
 * 
 * Approach: Set and Math
 * Runtime: 8 ms, faster than 14.77% of Java online submissions for Single Number.
 * Memory Usage: 45.7 MB, less than 5.19% of Java online submissions for Single Number.
 * 
 * Time Complexity: O(n)
 * Space Complexity: O(n)
 * Where n is the number of elements in the array
 * 
 * @see ArrayTest#testSingleNumber()
 */
public class SingleNumber2 {

	public int singleNumber(int[] nums) {
		Set<Integer> set = new HashSet<Integer>();
		int sum = 0;
		int uniqueSum = 0;
		for (int n : nums) {
			set.add(n);
			sum += n;
		}
		for (int i : set) {
			uniqueSum += i;
		}
		return 2 * uniqueSum - sum;
	}

}
