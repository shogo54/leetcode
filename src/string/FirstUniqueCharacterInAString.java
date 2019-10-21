package string;

/**
 * @author Shogo Akiyama 
 * Solved on 10/21/2019
 * 
 * 387. First Unique Character in a String
 * https://leetcode.com/problems/first-unique-character-in-a-string/
 * Difficulty: Easy
 * 
 * Approach: Iteration & Hash Table
 * Runtime: 7 ms, faster than 89.19% of Java online submissions for First Unique Character in a String.
 * Memory Usage: 38.1 MB, less than 98.57% of Java online submissions for First Unique Character in a String.
 * 
 * @see StringTest#testFirstUniqueCharacterInAString()
 */
public class FirstUniqueCharacterInAString {

	public int firstUniqChar(String s) {
		if (s == null) {
			return 0;
		}

		char[] chars = s.toCharArray();
		int[] firsts = new int[26];
		int min = Integer.MAX_VALUE;

		for (int i = 0; i < chars.length; i++) {
			if (firsts[chars[i] - 'a'] == 0) {
				firsts[chars[i] - 'a'] = i + 1;
			} else {
				firsts[chars[i] - 'a'] = -1;
			}
		}

		for (int i = 0; i < firsts.length; i++) {
			if (firsts[i] > 0) {
				min = Math.min(min, firsts[i]);
			}
		}

		return (min == Integer.MAX_VALUE) ? -1 : min - 1;
	}

}
