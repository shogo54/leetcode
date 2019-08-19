package String;

import java.util.*;

/**
 * @author Shogo Akiyama 
 * Solved on 08/02/2019
 * 
 * 242. Valid Anagram
 * https://leetcode.com/problems/valid-anagram/
 * Difficulty: Easy
 * 
 * To run the code in LeetCode, take the codes from the following method(s):
 * - boolean isAnagram(String s, String t).
 * 
 * Runtime: 6 ms, faster than 44.21% of Java online submissions for Valid Anagram.
 * Memory Usage: 37.3 MB, less than 95.61% of Java online submissions for Valid Anagram.
 * 
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
