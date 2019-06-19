import java.util.*;

/**
 * @author Shogo Akiyama 
 * Solved on 06/19/2019
 * 
 * 136. Single Number
 * https://leetcode.com/problems/single-number/
 * 
 * To run the code in LeetCode, take the codes from the following method(s):
 * - int singleNumber(int[] nums).
 * 
 * Runtime: 7 ms, faster than 33.18% of Java online submissions for Single Number.
 * Memory Usage: 39.2 MB, less than 81.27% of Java online submissions for Single Number.
 * 
 */

public class SingleNumber {
	
	public int singleNumber(int[] nums) {
        Set<Integer> set = new HashSet<Integer>();
        for(int n: nums){
            if(set.contains(n)){
                set.remove(n);
            }else{
                set.add(n);
            }
        }
        return set.iterator().next();
    }

}
