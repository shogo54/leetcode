package string;

import java.util.*;

/**
 * @author Shogo Akiyama 
 * Solved on 01/01/2020
 * 
 * 1003. Check If Word Is Valid After Substitutions
 * https://leetcode.com/problems/check-if-word-is-valid-after-substitutions/
 * Difficulty: Medium
 * 
 * Approach: Stack & Iteration
 * Runtime: 17 ms, faster than 59.52% of Java online submissions for Check If Word Is Valid After Substitutions.
 * Memory Usage: 37.7 MB, less than 100.00% of Java online submissions for Check If Word Is Valid After Substitutions.
 * 
 * Time Complexity: O(n)
 * Space Complexity: O(n)
 * Where n is the length of a string
 * 
 * @see StringTest#testCheckIfWordIsValidAfterSubstitutions()
 */
public class CheckIfWordIsValidAfterSubstitutions2 {

	public boolean isValid(String S) {
		Stack<Character> stack = new Stack<Character>();

		for (int i = 0; i < S.length(); i++) {
			char c = S.charAt(i);
			if (c == 'c') {
				if (stack.size() < 2 || stack.pop() != 'b' || stack.pop() != 'a') {
					return false;
				}
			} else {
				stack.push(c);
			}
		}

		return stack.empty();
	}

}
