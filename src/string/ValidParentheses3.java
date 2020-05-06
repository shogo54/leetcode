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
 * Approach: Stack & Map
 * Runtime: 1 ms, faster than 98.58% of Java online submissions for Valid Parentheses.
 * Memory Usage: 37.5 MB, less than 5.06% of Java online submissions for Valid Parentheses.
 * 
 * Time Complexity: O(n)
 * Space Complexity: O(n)
 * Where n is the length of the string
 * 
 * @see StringTest#testValidParentheses()
 */
public class ValidParentheses3 {

	public boolean isValid(String s) {
		Stack<Character> stack = new Stack<Character>();
		Map<Character, Character> map = new HashMap<Character, Character>() {
			{
				put(')', '(');
				put('}', '{');
				put(']', '[');
			}
		};

		for (int i = 0; i < s.length(); i++) {
			char c = s.charAt(i);
			if (!map.containsKey(c)) {
				stack.push(c);
			} else if (stack.empty()) {
				return false;
			} else if (map.get(c) != stack.pop()) {
				return false;
			}
		}
		return stack.empty();
	}

}