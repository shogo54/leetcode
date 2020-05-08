package string;

/**
 * @author Shogo Akiyama 
 * Solved on 05/08/2020
 * 
 * 125. Valid Palindrome
 * https://leetcode.com/problems/valid-palindrome/
 * Difficulty: Easy
 * 
 * Approach: Two Pointers & Iteration (Optimized)
 * Runtime: 2 ms, faster than 97.57% of Java online submissions for Valid Palindrome.
 * Memory Usage: 39.2 MB, less than 29.46% of Java online submissions for Valid Palindrome.
 * 
 * Time Complexity: O(n)
 * Space Complexity: O(1)
 * Where n is the length of the string
 * 
 * @see StringTest#testValidPalindrome()
 */
public class ValidPalindrome2 {

	public boolean isPalindrome(String s) {
		int i = 0;
		int j = s.length() - 1;
		while (i < j) {
			while (!Character.isLetterOrDigit(s.charAt(i)) && i < j)
				i++;
			while (!Character.isLetterOrDigit(s.charAt(j)) && i < j)
				j--;
			if (Character.toLowerCase(s.charAt(i++)) != Character.toLowerCase(s.charAt(j--)))
				return false;
		}
		return true;
	}

}
