package string;

/**
 * @author Shogo Akiyama 
 * Solved on 05/24/2020
 * Time: 3m30s
 * 
 * 242. Valid Anagram
 * https://leetcode.com/problems/valid-anagram/
 * Difficulty: Easy
 * 
 * Approach: Iteration & Hash Table
 * Runtime: 3 ms, faster than 72.95% of Java online submissions for Valid Anagram.
 * Memory Usage: 39.4 MB, less than 15.48% of Java online submissions for Valid Anagram.
 * 
 * Time Complexity: O(min(m, n))
 * Space Complexity: O(1)
 * Where m and n are the lengths of the strings
 * 
 * @see StringTest#testValidAnagram()
 */
public class ValidAnagram2 {

	public boolean isAnagram(String s, String t) {
		if (s.length() != t.length()) {
			return false;
		}
		int[] chars = new int[26];

		for (int i = 0; i < s.length(); i++) {
			chars[s.charAt(i) - 'a']++;
			chars[t.charAt(i) - 'a']--;
		}

		for (int i = 0; i < chars.length; i++) {
			if (chars[i] != 0) {
				return false;
			}
		}

		return true;
	}

}
