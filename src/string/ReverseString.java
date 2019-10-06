package string;

/**
 * @author Shogo Akiyama 
 * Solved on 06/11/2019
 * 
 * 344. Reverse String
 * https://leetcode.com/problems/reverse-string/
 * Difficulty: Easy
 * 
 * Approach: Two Pointers & Iteration
 * Runtime: 1 ms, faster than 100.00% of Java online submissions for Reverse String.
 * Memory Usage: 47.5 MB, less than 65.73% of Java online submissions for Reverse String.
 * 
 * @see StringTest#testReverseString()
 */
public class ReverseString {

	public void reverseString(char[] s) {
		int i = 0;
		int j = s.length - 1;

		while (i <= j) {
			char c = s[i];
			s[i] = s[j];
			s[j] = c;
			i++;
			j--;
		}
	}

}