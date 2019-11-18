package array;

import java.util.*;

/**
 * @author Shogo Akiyama 
 * Solved on 08/27/2019
 * 
 * 217. Contains Duplicate
 * https://leetcode.com/problems/contains-duplicate/
 * Difficulty: Easy
 * 
 * Approach: Hash Table & Iteration
 * Runtime: 257 ms, faster than 5.08% of Java online submissions for Find All Numbers Disappeared in an Array.
 * Memory Usage: 50.7 MB, less than 32.08% of Java online submissions for Find All Numbers Disappeared in an Array.
 * 
 * @see ArrayTest#testContainsDuplicate()
 */
public class FindAllNumbersDisappearedInAnArray {

	public List<Integer> findDisappearedNumbers(int[] nums) {
        List<Integer> list = new ArrayList<Integer>();
        
        for(int i=0; i<nums.length; i++){
            list.add(i+1);
        }
        
        for(int num: nums){
            list.set(num-1, -1);
        }
        
        int index = 0;
        while(index < list.size()){
            if(list.get(index).intValue() == -1){
                list.remove(index);
            }else{
                index++;
            }
        }
        
        return list;
    }
	
}
