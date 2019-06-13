/**
 * @author Shogo Akiyama 
 * Solved on 06/12/2019
 * 
 * 1047. Remove All Adjacent Duplicates In String
 * https://leetcode.com/problems/remove-all-adjacent-duplicates-in-string/
 * 
 * To run the code in LeetCode, take the codes from the method
 * String removeDuplicates(String S).
 * 
 * Runtime: 166 ms, faster than 17.36% of Java online submissions for Remove All Adjacent Duplicates In String.
 * Memory Usage: 45.5 MB, less than 100.00% of Java online submissions for Remove All Adjacent Duplicates In String.
 * 
 */

public class RemoveAllAdjacentDuplicatesInString {

    public String removeDuplicates(String S) {
        String result = S;
        for(int i=0; i<S.length()-1; i++){
            if(S.charAt(i) == S.charAt(i+1)){
                result = S.substring(0, i) + S.substring(i+2, S.length());
                return removeDuplicates(result);
            }
        }
        return result;
    }
    
}
