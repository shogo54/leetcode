import java.util.*;

/**
 * @author Shogo Akiyama 
 * Solved on 06/10/2019
 * 
 * 260. Single Number III
 * https://leetcode.com/problems/single-number-iii/
 * 
 * To run the code in LeetCode, take the codes from 
 * singleNumber(int[] nums) method.
 * 
 * Runtime: 4 ms, faster than 34.11% of Java online submissions for Single Number III.
 * Memory Usage: 37.4 MB, less than 68.48% of Java online submissions for Single Number III.
 * 
 */

class SingleNumberIII {
    public int[] singleNumber(int[] nums) {
        Set<Integer> set = new HashSet<Integer>();
        
        for(int i=0; i<nums.length; i++){
            if(set.contains(nums[i])){
                set.remove(nums[i]);
            }else{
                set.add(nums[i]);
            }
        }
        
        int[] result = new int[2];
        int i = 0;
        for(Integer n: set){
            result[i++] = n;
        }
        
        return result;
    }
}