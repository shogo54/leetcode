package array;

import java.util.*;

/**
 * @author Shogo Akiyama 
 * Solved on 12/16/2019
 * 
 * 150. Evaluate Reverse Polish Notation
 * https://leetcode.com/problems/evaluate-reverse-polish-notation/
 * Difficulty: Medium
 * 
 * Approach: Stack
 * Runtime: 6 ms, faster than 79.89% of Java online submissions for Evaluate Reverse Polish Notation.
 * Memory Usage: 37.7 MB, less than 94.00% of Java online submissions for Evaluate Reverse Polish Notation.
 * 
 * Time Complexity: O(n)
 * Space Complexity: O(n)
 * Where n is the number of elements in an array
 * 
 * @see ArrayTest#testEvaluateReversePolishNotation()
 */
public class EvaluateReversePolishNotation {

	public int evalRPN(String[] tokens) {
		Stack<Integer> stack = new Stack<Integer>();
		Set<String> ops = new HashSet<String>(Arrays.asList("+", "-", "*", "/"));

		for (int i = 0; i < tokens.length; i++) {
			if (ops.contains(tokens[i])) {
				int v2 = stack.pop();
				int v1 = stack.pop();
				int res;

				if (tokens[i].equals("+")) {
					res = v1 + v2;
				} else if (tokens[i].equals("-")) {
					res = v1 - v2;
				} else if (tokens[i].equals("*")) {
					res = v1 * v2;
				} else {
					res = v1 / v2;
				}

				stack.push(res);
			} else {
				stack.push(Integer.parseInt(tokens[i]));
			}
		}

		return stack.pop();
	}

}
