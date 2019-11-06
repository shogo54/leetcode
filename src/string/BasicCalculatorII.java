package string;

import java.util.*;

/**
 * @author Shogo Akiyama 
 * Solved on 11/05/2019
 * 
 * 227. Basic Calculator II
 * https://leetcode.com/problems/basic-calculator-ii/
 * Difficulty: Medium
 * 
 * Approach: Iteration & Two Lists
 * Runtime: 919 ms, faster than 5.02% of Java online submissions for Basic Calculator II.
 * Memory Usage: 41.3 MB, less than 7.46% of Java online submissions for Basic Calculator II.
 * 
 * @see StringTest#testBasicCalculatorII()
 */
public class BasicCalculatorII {

	public int calculate(String s) {
		s = s.replaceAll(" ", "");
		List<Integer> vals = new ArrayList<Integer>();
		List<Character> opers = new ArrayList<Character>();
		int index = 0;

		// add values and operations to the lists
		for (int i = 0; i < s.length(); i++) {
			char c = s.charAt(i);
			if (c == '+' || c == '-' || c == '*' || c == '/') {
				opers.add(c);
				vals.add(Integer.parseInt(s.substring(index, i)));
				index = i + 1;
			}
		}
		vals.add(Integer.parseInt(s.substring(index)));

		// multiplication and division
		for (int i = 0; i < opers.size(); i++) {
			char op = opers.get(i).charValue();
			if (op == '*' || op == '/') {
				if (opers.get(i).charValue() == '*') {
					vals.set(i, vals.get(i) * vals.get(i + 1));
				} else {
					vals.set(i, vals.get(i) / vals.get(i + 1));
				}
				vals.remove(i + 1);
				opers.remove(i);
				i--;
			}
		}

		// addition and subtraction
		for (int i = 0; i < opers.size(); i++) {
			char op = opers.get(i).charValue();
			if (op == '+' || op == '-') {
				if (opers.get(i).charValue() == '+') {
					vals.set(i, vals.get(i) + vals.get(i + 1));
				} else {
					vals.set(i, vals.get(i) - vals.get(i + 1));
				}
				vals.remove(i + 1);
				opers.remove(i);
				i--;
			}
		}

		return vals.get(0);
	}

}
