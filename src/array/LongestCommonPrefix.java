package array;

/**
 * @author Shogo Akiyama 
 * Solved on 12/17/2019
 * 
 * 14. Longest Common Prefix
 * https://leetcode.com/problems/longest-common-prefix/
 * Difficulty: Easy
 * 
 * Approach: Vertical Scanning
 * Runtime: 1 ms, faster than 74.31% of Java online submissions for Longest Common Prefix.
 * Memory Usage: 37.1 MB, less than 99.42% of Java online submissions for Longest Common Prefix.
 * 
 * Time Complexity: O(m * n)
 * Space Complexity: O(1)
 * Where n is the number of elements in an array and m is the longest length of strings
 * 
 * @see ArrayTest#testLongestCommonPrefix()
 */
public class LongestCommonPrefix {

	public String longestCommonPrefix(String[] strs) {
		if (strs.length == 0) {
			return "";
		}

		for (int i = 0; i < strs[0].length(); i++) {
			for (String s : strs) {
				if (i >= s.length() || strs[0].charAt(i) != s.charAt(i)) {
					return strs[0].substring(0, i);
				}
			}
		}

		return strs[0];
	}

}
