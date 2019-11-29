package integer;

import java.util.*;

/**
 * @author Shogo Akiyama 
 * Solved on 11/28/2019
 * 
 * 22. Generate Parentheses
 * https://leetcode.com/problems/generate-parentheses/
 * Difficulty: Medium
 * 
 * Approach: Dynamic Programming (Bottom up)
 * Runtime: 3 ms, faster than 13.78% of Java online submissions for Generate Parentheses.
 * Memory Usage: 36.6 MB, less than 100.00% of Java online submissions for Generate Parentheses.
 * 
 * @see IntegerTest#testGenerateParentheses()
 */
public class GenerateParentheses {

	private List<Set<String>> res = new ArrayList<Set<String>>();

	public List<String> generateParenthesis(int n) {
		res.add(new HashSet<String>(Arrays.asList("")));
		backtrack(0, n);
		return new ArrayList<String>(res.get(n));
	}

	private void backtrack(int curr, int n) {
		if (curr == n) {
			return;
		}

		res.add(new HashSet<String>());

		for (String s : res.get(curr)) {
			for (int i = 0; i < s.length(); i++) {
				if (s.charAt(i) == '(') {
					StringBuilder sb = new StringBuilder(s);
					res.get(curr + 1).add(sb.insert(i + 1, "()").toString());
				}
			}
			res.get(curr + 1).add(s + "()");
		}

		backtrack(curr + 1, n);
	}

}
