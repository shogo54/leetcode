package string;

import java.util.*;

/**
 * @author Shogo Akiyama 
 * Solved on 12/11/2019
 * 
 * 394. Decode String
 * https://leetcode.com/problems/decode-string/
 * Difficulty: Medium
 * 
 * Approach: Iteration
 * Runtime: 1 ms, faster than 68.70% of Java online submissions for Decode String.
 * Memory Usage: 35.9 MB, less than 36.36% of Java online submissions for Decode String.
 * 
 * Time Complexity: O(n)
 * Space Complexity: O(n)
 * Where n is the length of a string
 * 
 * @see StringTest#testDecodeString()
 */
public class DecodeString {

	public String decodeString(String s) {
		String result = "";
		Stack<String[]> stack = new Stack<String[]>();

		for (int i = 0; i < s.length(); i++) {
			char c = s.charAt(i);

			if (Character.isDigit(c)) {
				int index = i;
				while (Character.isDigit(s.charAt(++index)))
					;
				String[] newString = new String[] { s.substring(i, index), "" };
				stack.push(newString);
				i = index;

			} else {
				String curr = "";
				if (c == ']') {
					String[] data = stack.pop();
					for (int j = 0; j < Integer.parseInt(data[0]); j++) {
						curr += data[1];
					}
				} else {
					curr = s.charAt(i) + "";
				}

				if (stack.isEmpty()) {
					result += curr;
				} else {
					stack.peek()[1] += curr;
				}
			}
		}

		return result;
	}

}
