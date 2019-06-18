/**
 * @author Shogo Akiyama 
 * Solved on 06/17/2019
 * 
 * 13. Roman to Integer
 * https://leetcode.com/problems/roman-to-integer/
 * 
 * To run the code in LeetCode, take the codes from the following method(s):
 * - int romanToInt(String s).
 * 
 * Runtime: 5 ms, faster than 66.82% of Java online submissions for Roman to Integer.
 * Memory Usage: 43.1 MB, less than 5.01% of Java online submissions for Roman to Integer.
 * 
 */

public class RomanToInteger {

	public int romanToInt(String s) {
		if (s.isEmpty()) {
			return 0;
		}

		if (s.length() > 1) {
			String firstTwo = s.substring(0, 2);

			if (firstTwo.equals("CM")) {
				return 900 + romanToInt(s.substring(2));
			} else if (firstTwo.equals("CD")) {
				return 400 + romanToInt(s.substring(2));
			} else if (firstTwo.equals("XC")) {
				return 90 + romanToInt(s.substring(2));
			} else if (firstTwo.equals("XL")) {
				return 40 + romanToInt(s.substring(2));
			} else if (firstTwo.equals("IX")) {
				return 9 + romanToInt(s.substring(2));
			} else if (firstTwo.equals("IV")) {
				return 4 + romanToInt(s.substring(2));
			}
		}

		char first = s.charAt(0);

		if (first == 'M') {
			return 1000 + romanToInt(s.substring(1));
		} else if (first == 'D') {
			return 500 + romanToInt(s.substring(1));
		} else if (first == 'C') {
			return 100 + romanToInt(s.substring(1));
		} else if (first == 'L') {
			return 50 + romanToInt(s.substring(1));
		} else if (first == 'X') {
			return 10 + romanToInt(s.substring(1));
		} else if (first == 'V') {
			return 5 + romanToInt(s.substring(1));
		} else if (first == 'I') {
			return 1 + romanToInt(s.substring(1));
		}

		return 0;
	}

}