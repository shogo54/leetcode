package string;

import java.util.*;

/**
 * @author Shogo Akiyama 
 * Solved on 09/24/2019
 * 
 * 76. Minimum Window Substring
 * https://leetcode.com/problems/minimum-window-substring/
 * Difficulty: Hard
 * 
 * To run the code in LeetCode, take the codes from the following method(s) and all properties:
 * - String minWindow(String s, String t).
 * 
 * Runtime: 30 ms, faster than 16.02% of Java online submissions for Minimum Window Substring.
 * Memory Usage: 38.6 MB, less than 84.04% of Java online submissions for Minimum Window Substring.
 * 
 */

public class MinimumWindowSubstring {

	public String minWindow(String s, String t) {

		Map<Character, Integer> needs = new HashMap<Character, Integer>();
		Map<Character, Integer> current = new HashMap<Character, Integer>();
		int index = 0;
		int count = 0;
		int[] result = { -1, 0, 0 };

		for (int i = 0; i < t.length(); i++) {
			needs.put(t.charAt(i), needs.getOrDefault(t.charAt(i), 0) + 1);
		}

		for (int i = 0; i < s.length(); i++) {
			char c = s.charAt(i);

			if (needs.containsKey(c)) {
				current.put(c, current.getOrDefault(c, 0) + 1);
				if (current.get(c).intValue() == needs.get(c).intValue()) {
					count++;
				}

				if (count == needs.size()) {
					while (true) {
						char first = s.charAt(index);
						if (!needs.containsKey(first)) {
							index++;
						} else {
							if (current.get(first) > needs.get(first)) {
								current.put(first, current.get(first) - 1);
								index++;
							} else {
								break;
							}
						}
					}
					if (result[0] == -1 || result[0] > i + 1 - index) {
						result[0] = i - index + 1;
						result[1] = index;
						result[2] = i;
					}
				}
			}
		}

		return (result[0] == -1) ? "" : s.substring(result[1], result[2] + 1);
	}
}
