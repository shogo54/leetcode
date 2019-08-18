/**
 * @author Shogo Akiyama 
 * Solved on 08/18/2019
 * 
 * 9. Palindrome Number
 * https://leetcode.com/problems/palindrome-number/
 * Difficulty: Easy
 * 
 * To run the code in LeetCode, take the codes from the following method(s):
 * - boolean isPalindrome(int x)
 * - boolean check(char[] arr, int i, int j).
 * 
 * Runtime: 8 ms, faster than 40.58% of Java online submissions for Palindrome Number.
 * Memory Usage: 36.7 MB, less than 5.02% of Java online submissions for Palindrome Number.
 * 
 */

public class PalindromeNumber {

	public boolean isPalindrome(int x) {
        if(x < 0){
            return false;
        }
        char[] array = ("" + x).toCharArray();
        return check(array, 0, array.length-1);
    }
    
    private boolean check(char[] arr, int i, int j){
        if(i >= j){
            return true;
        }
        if(arr[i] == arr[j]){
            return check(arr, ++i, --j);
        }
        return false;
    }
	
}
