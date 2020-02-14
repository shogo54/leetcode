package string;

/**
 * @author Shogo Akiyama 
 * Solved on 02/09/2020
 * 
 * 917. Reverse Only Letters
 * https://leetcode.com/problems/reverse-only-letters/
 * Difficulty: Easy
 * 
 * Approach: Two Pointers & Iteration
 * Runtime: 0 ms, faster than 100.00% of Java online submissions for Reverse Only Letters.
 * Memory Usage: 37.9 MB, less than 8.70% of Java online submissions for Reverse Only Letters.
 * 
 * Time Complexity: O(n)
 * Space Complexity: O(n)
 * Where n is the length of a string
 * 
 * @see StringTest#testReverseOnlyLetters()
 */
public class ReverseOnlyLetters {

	public String reverseOnlyLetters(String S) {
		int i = 0;
		int j = S.length() - 1;
		char[] str = new char[S.length()];

		while (i <= j) {
			if (!Character.isLetter(S.charAt(i))) {
				str[i] = S.charAt(i++);
			} else if (!Character.isLetter(S.charAt(j))) {
				str[j] = S.charAt(j--);
			} else {
				str[i] = S.charAt(j);
				str[j--] = S.charAt(i++);
			}
		}

		return new String(str);
	}

}
