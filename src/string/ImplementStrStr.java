package string;

/**
 * @author Shogo Akiyama 
 * Solved on 05/25/2020
 * Time: 30m
 * 
 * 28. Implement strStr()
 * https://leetcode.com/problems/implement-strstr/
 * Difficulty: Easy
 * 
 * Approach: Brute Force
 * Runtime: 1 ms, faster than 65.78% of Java online submissions for Implement strStr().
 * Memory Usage: 37.5 MB, less than 70.23% of Java online submissions for Implement strStr().
 * 
 * Time Complexity: O(m * n)
 * Space Complexity: O(1)
 * Where m and n are the lengths of the strings
 * 
 * @see StringTest#testImplementStrStr()
 */
public class ImplementStrStr {

	public int strStr(String haystack, String needle) {
		if (needle.length() == 0) {
			return 0;
		}
		int len1 = haystack.length();
		int len2 = needle.length();

		for (int i = 0; i < len1 - len2 + 1; i++) {
			for (int j = 0; j < len2; j++) {
				if (needle.charAt(j) != haystack.charAt(i + j)) {
					break;
				}
				if (j == len2 - 1) {
					return i;
				}
			}
		}

		return -1;
	}

}
