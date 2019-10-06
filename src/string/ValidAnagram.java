package string;

import java.util.*;

/**
 * @author Shogo Akiyama 
 * Solved on 08/02/2019
 * 
 * 242. Valid Anagram
 * https://leetcode.com/problems/valid-anagram/
 * Difficulty: Easy
 * 
 * Approach: Sort
 * Runtime: 6 ms, faster than 44.21% of Java online submissions for Valid Anagram.
 * Memory Usage: 37.3 MB, less than 95.61% of Java online submissions for Valid Anagram.
 * 
 * @see StringTest#testValidAnagram()
 */
public class ValidAnagram {

	public boolean isAnagram(String s, String t) {
		if (s.length() != t.length()) {
			return false;
		}
		char[] sChar = s.toCharArray();
		char[] tChar = t.toCharArray();
		Arrays.sort(sChar);
		Arrays.sort(tChar);
		return (new String(sChar).equals(new String(tChar)));
	}

}
