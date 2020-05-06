package string;

/**
 * @author Shogo Akiyama 
 * Solved on 06/13/2019
 * 
 * 20. Valid Parentheses
 * https://leetcode.com/problems/valid-parentheses/
 * Difficulty: Easy
 * 
 * Approach: Recursion
 * Runtime: 58 ms, faster than 7.28% of Java online submissions for Valid Parentheses.
 * Memory Usage: 36.3 MB, less than 42.56% of Java online submissions for Valid Parentheses.
 * 
 * Time Complexity: O(n^2)
 * Space Complexity: O(n^2)
 * Where n is the length of the string
 * 
 * @see StringTest#testValidParentheses()
 */
public class ValidParentheses {

	public boolean isValid(String s) {
		if (s.equals("")) {
			return true;
		}
		for (int i = 0; i < s.length() - 1; i++) {
			if (s.charAt(i) == '(' && s.charAt(i + 1) == ')' || s.charAt(i) == '{' && s.charAt(i + 1) == '}'
					|| s.charAt(i) == '[' && s.charAt(i + 1) == ']') {
				return isValid(s.substring(0, i) + s.substring(i + 2, s.length()));
			}
		}
		return false;
	}

}