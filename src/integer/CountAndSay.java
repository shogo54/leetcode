package integer;

/**
 * @author Shogo Akiyama 
 * Solved on 12/25/2019 and 05/29/2020
 * Time: 12m
 * 
 * 38. Count and Say
 * https://leetcode.com/problems/count-and-say/
 * Difficulty: Easy
 * 
 * Approach: Dynamic Programming (Bottom up)
 * Runtime: 7 ms, faster than 30.83% of Java online submissions for Count and Say.
 * Memory Usage: 36 MB, less than 52.63% of Java online submissions for Count and Say.
 * 
 * Time Complexity: O(k*n) 
 * Space Complexity: O(n)
 * Where n is the given number and k is the length of the largest sequence till n
 * 
 * @see IntegerTest#testCountAndSay()
 */
public class CountAndSay {

	public String countAndSay(int n) {
		String[] dp = new String[n];
		dp[0] = "1";

		for (int i = 1; i < n; i++) {
			String prev = dp[i - 1];
			dp[i] = "";
			int count = 1;

			for (int j = 1; j < prev.length(); j++) {
				if (prev.charAt(j - 1) == prev.charAt(j)) {
					count++;
				} else {
					dp[i] += count + "" + prev.charAt(j - 1);
					count = 1;
				}
			}

			dp[i] += count + "" + prev.charAt(prev.length() - 1);
		}

		return dp[n - 1];
	}

}
