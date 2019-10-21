package string;

/**
 * @author Shogo Akiyama 
 * Solved on 10/20/2019
 * 
 * 424. Longest Repeating Character Replacement
 * https://leetcode.com/problems/longest-repeating-character-replacement/
 * Difficulty: Medium
 * 
 * Approach: Sliding Window
 * Runtime: 254 ms, faster than 5.00% of Java online submissions for Longest Repeating Character Replacement.
 * Memory Usage: 35.9 MB, less than 100.00% of Java online submissions for Longest Repeating Character Replacement.
 * 
 * @see StringTest#testLongestRepeatingCharacterReplacement()
 */
public class LongestRepeatingCharacterReplacement {
	public int characterReplacement(String s, int k) {
		if (s == null || s.length() == 0) {
			return 0;
		}

		int len = s.length();
		char[] chars = s.toCharArray();
		int currentK = 0;
		int[] max = new int[] { 0, 0, 0 };
		int l = 0;
		int r = 0;
		int point = 0;

		while (r < len) {
			if (chars[l] == chars[r]) {
				r++;
			} else {
				if (currentK == 0) {
					point = r;
				}
				if (currentK < k) {
					currentK++;
					r++;
				} else {
					if (r - l > max[0]) {
						max[0] = r - l;
						max[1] = l;
						max[2] = r;
					}
					l = point;
					r = l;
					currentK = 0;
				}
			}
			if (r - l >= max[0]) {
				max[0] = r - l;
				max[1] = l;
				max[2] = r;
			}
		}

		if (max[2] == r && currentK < k) {
			char c = chars[l];
			l--;
			while (currentK < k && l >= 0) {
				max[0]++;
				if (chars[l] != c) {
					currentK++;
				}
				l--;
			}
		}

		return max[0];
	}
}
