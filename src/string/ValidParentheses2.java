package string;

import java.util.*;

/**
 * @author Shogo Akiyama 
 * Solved on 05/05/2020
 * 
 * 20. Valid Parentheses
 * https://leetcode.com/problems/valid-parentheses/
 * Difficulty: Easy
 * 
 * Approach: Stack
 * Runtime: 1 ms, faster than 98.58% of Java online submissions for Valid Parentheses.
 * Memory Usage: 37.3 MB, less than 5.06% of Java online submissions for Valid Parentheses.
 * 
 * Time Complexity: O(n)
 * Space Complexity: O(n)
 * Where n is the length of the string
 * 
 * @see StringTest#testValidParentheses()
 */
public class ValidParentheses2 {

	public boolean isValid(String s) {
		Stack<Character> stack = new Stack<Character>();

		for (int i = 0; i < s.length(); i++) {
			char c = s.charAt(i);
			if (c == '(' || c == '[' || c == '{') {
				stack.push(c);
			} else if (stack.empty()) {
				return false;
			} else {
				char prev = stack.pop();
				if (c == ')' && prev != '(') {
					return false;
				} else if (c == '}' && prev != '{') {
					return false;
				} else if (c == ']' && prev != '[') {
					return false;
				}
			}
		}
		return stack.empty();
	}

}