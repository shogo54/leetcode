/**
 * @author Shogo Akiyama 
 * Solved on 06/13/2019
 * 
 * 20. Valid Parentheses
 * https://leetcode.com/problems/valid-parentheses/
 * Difficulty: Easy
 * 
 * To run the code in LeetCode, take the codes from the following method(s):
 * - boolean isValid(String s).
 * 
 * Runtime: 58 ms, faster than 7.28% of Java online submissions for Valid Parentheses.
 * Memory Usage: 36.3 MB, less than 42.56% of Java online submissions for Valid Parentheses.
 * 
 * Note: Can I solve it faster? I think this solution takes O(n^2). Can I do it in O(n)?
 * 
 */

public class ValidParentheses {
	
	public boolean isValid(String s) {
        if(s.equals("")){
            return true;
        }
        for(int i=0; i<s.length()-1; i++){
            if(s.charAt(i) == '(' && s.charAt(i+1) == ')'
              || s.charAt(i) == '{' && s.charAt(i+1) == '}'
              || s.charAt(i) == '[' && s.charAt(i+1) == ']'){
                return isValid(s.substring(0, i)+ s.substring(i+2, s.length()));
            }
        }
        return false;
    }
	
}