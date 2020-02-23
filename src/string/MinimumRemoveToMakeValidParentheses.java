package string;

import java.util.*;

/**
 * @author Shogo Akiyama 
 * Solved on 02/22/2020
 * 
 * 1249. Minimum Remove to Make Valid Parentheses
 * https://leetcode.com/problems/minimum-remove-to-make-valid-parentheses/
 * Difficulty: Medium
 * 
 * Approach: Stack and Array
 * Runtime: 21 ms, faster than 52.69% of Java online submissions for Minimum Remove to Make Valid Parentheses.
 * Memory Usage: 42.4 MB, less than 100.00% of Java online submissions for Minimum Remove to Make Valid Parentheses.
 * 
 * Time Complexity: O(n)
 * Space Complexity: O(n)
 * Where n is the length of the string
 * 
 * @see StringTest#testMinimumRemoveToMakeValidParentheses()
 */
public class MinimumRemoveToMakeValidParentheses {

	public String minRemoveToMakeValid(String s) {
		Stack<Object[]> stack = new Stack<Object[]>();
		char[] chars = new char[s.length()];

		for (int i = 0; i < s.length(); i++) {
			char c = s.charAt(i);
			chars[i] = c;
			if (c == '(') {
				stack.push(new Object[] { c, i });
			} else if (c == ')') {
				if (stack.isEmpty()) {
					chars[i] = '-';
				} else {
					stack.pop();
				}
			}
		}

		while (!stack.isEmpty()) {
			Integer index = (Integer) stack.pop()[1];
			chars[index] = '-';
		}

		return new String(chars).replaceAll("-", "");
	}

}
