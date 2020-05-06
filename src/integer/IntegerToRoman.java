package integer;

/**
 * @author Shogo Akiyama 
 * Solved on 05/05/2020
 * 
 * 12. Integer to Roman
 * https://leetcode.com/problems/integer-to-roman/
 * Difficulty: Medium
 * 
 * Approach: Iteration
 * Runtime: 5 ms, faster than 56.97% of Java online submissions for Integer to Roman.
 * Memory Usage: 40 MB, less than 16.25% of Java online submissions for Integer to Roman.
 * 
 * Time Complexity: O(1)
 * Space Complexity: O(1)
 * Because the even worst case will go through the while loop 15 times which is constant. 
 * 
 * @see IntegerTest#testIntegerToRoman()
 */
public class IntegerToRoman {
	
	public String intToRoman(int num) {
        String[] symbols = new String[]{"M", "CM", "D", "CD", "C", "XC", "L", "XL", "X", "IX", "V", "IV", "I"};
        int[] values = new int[]{1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1};
        String res = "";
        
        for(int i=0; i<values.length; i++){
            while(num >= values[i]){
                res += symbols[i];
                num -= values[i];
            }
        }
        
        return res;
    }
	
}
