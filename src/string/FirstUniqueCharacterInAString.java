package string;

/**
 * @author Shogo Akiyama 
 * Solved on 10/21/2019 and 05/24/2020
 * Time: 11m30s
 * 
 * 387. First Unique Character in a String
 * https://leetcode.com/problems/first-unique-character-in-a-string/
 * Difficulty: Easy
 * 
 * Approach: Iteration & Hash Table
 * Runtime: 7 ms, faster than 89.19% of Java online submissions for First Unique Character in a String.
 * Memory Usage: 38.1 MB, less than 98.57% of Java online submissions for First Unique Character in a String.
 * 
 * Time Complexity: O(n)
 * Space Complexity: O(1)
 * Where the n is the length of the string
 * 
 * @see StringTest#testFirstUniqueCharacterInAString()
 */
public class FirstUniqueCharacterInAString {

	public int firstUniqChar(String s) {
		if (s == null) {
			return 0;
		}

		int[] firsts = new int[26];
		int min = Integer.MAX_VALUE;

		for (int i = 0; i < s.length(); i++) {
			int v = s.charAt(i) - 'a';
			if (firsts[v] == 0) {
				firsts[v] = i + 1;
			} else {
				firsts[v] = -1;
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
