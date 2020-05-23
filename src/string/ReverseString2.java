package string;

/**
 * @author Shogo Akiyama 
 * Solved on 05/23/2020
 * 
 * 344. Reverse String
 * https://leetcode.com/problems/reverse-string/
 * Difficulty: Easy
 * 
 * Approach: Recursion
 * Runtime: 1 ms, faster than 63.47% of Java online submissions for Reverse String.
 * Memory Usage: 47.7 MB, less than 91.12% of Java online submissions for Reverse String.
 * 
 * Time Complexity: O(n)
 * Space Complexity: O(n) for the recursive stack
 * Where n is the length of the array
 * 
 * @see StringTest#testReverseString()
 */
public class ReverseString2 {

	public void reverseString(char[] s) {
		reverse(s, 0, s.length - 1);
	}

	private void reverse(char[] s, int i, int j) {
		if (i >= j) {
			return;
		}
		char temp = s[i];
		s[i] = s[j];
		s[j] = temp;
		reverse(s, i + 1, j - 1);
	}

}
