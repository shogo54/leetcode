package string;

/**
 * @author Shogo Akiyama 
 * Solved on 10/11/2019
 * 
 * 647. Palindromic Substrings
 * https://leetcode.com/problems/palindromic-substrings/
 * Difficulty: Medium
 * 
 * Approach: Dynamic Programming (Bottom Up)
 * Runtime: 5 ms, faster than 44.54% of Java online submissions for Palindromic Substrings.
 * Memory Usage: 36.1 MB, less than 45.57% of Java online submissions for Palindromic Substrings.
 * 
 * @see StringTest#testPalindromicSubstrings()
 */
public class PalindromicSubstrings {
	
	public int countSubstrings(String s) {
		if (s.length() == 0) {
			return 0;
		}

		int count = 0;
		int len = s.length();
		boolean[][] dp = new boolean[len][len];

		// initialize dp
		dp[0][0] = true;
		count++;
		for (int i = 1; i < len; i++) {
			dp[i][i] = true;
			count++;
			if (s.charAt(i - 1) == s.charAt(i)) {
				dp[i - 1][i] = true;
				count++;
			}
		}

		// iteration
		for (int dis = 2; dis < len; dis++) {
			for (int i = 0; i + dis < len; i++) {
				if (dp[i + 1][i + dis - 1] && s.charAt(i) == s.charAt(i + dis)) {
					dp[i][i + dis] = true;
					count++;
				}
			}
		}

		return count;
	}
	
}
