package string;

import java.util.*;

/**
 * @author Shogo Akiyama 
 * Solved on 08/19/2019
 * 
 * 3. Longest Substring Without Repeating Characters
 * https://leetcode.com/problems/longest-substring-without-repeating-characters/
 * Difficulty: Medium
 * 
 * To run the code in LeetCode, take the codes from the following method(s):
 * - int lengthOfLongestSubstring(String s).
 * 
 * Runtime: 10 ms, faster than 41.50% of Java online submissions for Longest Substring Without Repeating Characters.
 * Memory Usage: 37.1 MB, less than 99.76% of Java online submissions for Longest Substring Without Repeating Characters.
 * 
 */

public class LongestSubstringWithoutRepeatingCharacters {
	
	public int lengthOfLongestSubstring(String s) {
		Set<Character> set = new HashSet<Character>();
	    Queue<Character> q = new ArrayDeque<Character>();
	    int max = 0;
	    
	    for(int i=0; i<s.length(); i++){
	        Character c = s.charAt(i);
	        if(set.contains(c)){
	            if(set.size() == 1){
	                continue;
	            }
	            max = Math.max(max, set.size());
	            Character head = null;
	            while(!c.equals(head)){
	                head = q.poll();
	                set.remove(head);
	            }
	        }
	        q.offer(c);
	        set.add(c);
	    }
	    
	    return Math.max(max, set.size());
	}
	
}
