package string;

/**
 * @author Shogo Akiyama 
 * Solved on 05/06/2020
 * 
 * 3. Longest Substring Without Repeating Characters
 * https://leetcode.com/problems/longest-substring-without-repeating-characters/
 * Difficulty: Medium
 * 
 * Approach: Sliding Window (Optimized) with Hash Table
 * Runtime: 3 ms, faster than 91.56% of Java online submissions for Longest Substring Without Repeating Characters.
 * Memory Usage: 39.6 MB, less than 13.69% of Java online submissions for Longest Substring Without Repeating Characters.
 * 
 * Time Complexity: O(n)
 * Space Complexity: O(m)
 * Where n is the length of the string and the m is the size of the charset/alphabet. 
 * 
 * @see StringTest#testLongestSubstringWithoutRepeatingCharacters()
 */
public class LongestSubstringWithoutRepeatingCharacters2 {

	public int lengthOfLongestSubstring(String s) {
		int[] map = new int[128];
		int max = 0;
		int lastIndex = 0;
		for (int i = 0; i < s.length(); i++) {
			char c = s.charAt(i);
			max = Math.max(max, i - Math.max(lastIndex, map[c]) + 1);
			lastIndex = Math.max(lastIndex, map[c]);
			map[c] = i + 1;
		}

		return max;
	}

}
