package string;

/**
 * @author Shogo Akiyama 
 * Solved on 02/21/2020
 * 
 * 389. Find the Difference
 * https://leetcode.com/problems/find-the-difference/
 * Difficulty: Easy
 * 
 * Approach: Array
 * Runtime: 1 ms, faster than 99.00% of Java online submissions for Find the Difference.
 * Memory Usage: 37.9 MB, less than 6.25% of Java online submissions for Find the Difference.
 * 
 * Time Complexity: O(n)
 * Space Complexity: O(n)
 * Where n is the length of the strings
 * 
 * @see StringTest#testFindTheDifference()
 */
public class FindTheDifference {

	public char findTheDifference(String s, String t) {
		int[] counts = new int[26];

		for (char c : s.toCharArray()) {
			counts[c - 'a']++;
		}

		for (char c : t.toCharArray()) {
			if (--counts[c - 'a'] < 0) {
				return c;
			}
		}

		return t.charAt(0);
	}

}
