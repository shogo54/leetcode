package string;

/**
 * @author Shogo Akiyama 
 * Solved on 10/05/2019
 * 
 * 5. Longest Palindromic Substring
 * https://leetcode.com/problems/longest-palindromic-substring/
 * Difficulty: Medium
 * 
 * Approach: Recursion & Iteration (Expand Around Center)
 * Runtime: 13 ms, faster than 58.89% of Java online submissions for Longest Palindromic Substring.
 * Memory Usage: 35.9 MB, less than 100.00% of Java online submissions for Longest Palindromic Substring.
 * 
 * @see StringTest#testLongestPalindromicSubstring()
 */
public class LongestPalindromicSubstring {

	public String longestPalindrome(String s) {
		if (s == null || s.length() == 0) {
			return "";
		}

		int[] result = new int[] { 1, 0, 0 };

		for (int i = 0; i < s.length(); i++) {
			check(s, i - 1, i + 1, 1, result); // case for odd number palindrome
			check(s, i - 1, i, 0, result); // case for even number palindrome
		}

		return s.substring(result[1], result[2] + 1);
	}

	private int check(String s, int b, int e, int count, int[] result) {
		if (b < 0 || e >= s.length() || s.charAt(b) != s.charAt(e)) {
			if (count > result[0]) {
				result[0] = count;
				result[1] = b + 1;
				result[2] = e - 1;
			}
			return count;
		}
		return check(s, --b, ++e, count + 2, result);
	}

}
