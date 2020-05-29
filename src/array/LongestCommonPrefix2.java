package array;

/**
 * @author Shogo Akiyama 
 * Solved on 05/29/2020
 * 
 * 14. Longest Common Prefix
 * https://leetcode.com/problems/longest-common-prefix/
 * Difficulty: Easy
 * 
 * Approach: Horizontal Scanning
 * Runtime: 1 ms, faster than 60.90% of Java online submissions for Longest Common Prefix.
 * Memory Usage: 37.2 MB, less than 99.42% of Java online submissions for Longest Common Prefix.
 * 
 * Time Complexity: O(s)
 * Space Complexity: O(1)
 * where s is the sum of all characters in all strings
 * 
 * @see ArrayTest#testLongestCommonPrefix()
 */
public class LongestCommonPrefix2 {

	public String longestCommonPrefix(String[] strs) {
		if (strs.length == 0) {
			return "";
		}

		int index = strs[0].length();

		for (String s : strs) {
			index = Math.min(index, s.length());
			for (int i = 0; i < index; i++) {
				if (strs[0].charAt(i) != s.charAt(i)) {
					index = i;
					break;
				}
			}
		}

		return strs[0].substring(0, index);
	}

}
