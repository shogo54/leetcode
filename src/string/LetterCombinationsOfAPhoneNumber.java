package string;

import java.util.*;

/**
 * @author Shogo Akiyama 
 * Solved on 11/07/2019
 * 
 * 17. Letter Combinations of a Phone Number
 * https://leetcode.com/problems/letter-combinations-of-a-phone-number/
 * Difficulty: Medium
 * 
 * Approach: Recursion	
 * Runtime: 1 ms, faster than 63.91% of Java online submissions for Letter Combinations of a Phone Number.
 * Memory Usage: 36 MB, less than 98.63% of Java online submissions for Letter Combinations of a Phone Number.
 * 
 * @see StringTest#testLetterCombinationsOfAPhoneNumber()
 */
public class LetterCombinationsOfAPhoneNumber {

	private List<List<String>> list = new ArrayList<List<String>>();
	private List<List<Character>> chars = new ArrayList<List<Character>>();

	public List<String> letterCombinations(String digits) {
		chars.add(Arrays.asList('a', 'b', 'c'));
		chars.add(Arrays.asList('d', 'e', 'f'));
		chars.add(Arrays.asList('g', 'h', 'i'));
		chars.add(Arrays.asList('j', 'k', 'l'));
		chars.add(Arrays.asList('m', 'n', 'o'));
		chars.add(Arrays.asList('p', 'q', 'r', 's'));
		chars.add(Arrays.asList('t', 'u', 'v'));
		chars.add(Arrays.asList('w', 'x', 'y', 'z'));
		list.add(new ArrayList<String>());
		return combine(digits, 0);
	}

	private List<String> combine(String d, int i) {
		if (d.length() == i) {
			return list.get(i);
		}
		if (i == 0) {
			list.get(0).add("");
		}

		char c = d.charAt(i);
		list.add(new ArrayList<String>());

		for (String prev : list.get(i)) {
			for (Character ch : chars.get(Character.getNumericValue(c) - 2)) {
				list.get(i + 1).add(prev + ch);
			}
		}

		return combine(d, ++i);
	}

}