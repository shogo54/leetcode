package string;

import java.util.*;

/**
 * @author Shogo Akiyama 
 * Solved on 12/12/2019
 * 
 * 32. Longest Valid Parentheses
 * https://leetcode.com/problems/longest-valid-parentheses/
 * Difficulty: Hard
 * 
 * Approach: Stack
 * Runtime: 5 ms, faster than 54.29% of Java online submissions for Longest Valid Parentheses.
 * Memory Usage: 36.4 MB, less than 100.00% of Java online submissions for Longest Valid Parentheses.
 * 
 * Time Complexity: O(n)
 * Space Complexity: O(n)
 * Where n is the length of a string
 * 
 * @see StringTest#testLongestValidParentheses()
 */
public class LongestValidParentheses {

	public int longestValidParentheses(String s) {
		Stack<Integer> stack = new Stack<Integer>();
		boolean[] valid = new boolean[s.length()];

		for (int i = 0; i < s.length(); i++) {
			if (s.charAt(i) == '(') {
				stack.push(i);
			} else {
				if (!stack.isEmpty()) {
					valid[stack.pop()] = true;
					valid[i] = true;
				}
			}
		}

		int count = 0;
		int max = 0;

		for (int i = 0; i < valid.length; i++) {
			if (valid[i]) {
				count++;
				max = Math.max(max, count);
			} else {
				count = 0;
			}
		}

		return max;
	}

}
