import java.util.*;

/**
 * @author Shogo Akiyama 
 * Solved on 06/10/2019
 * 
 * 912. Sort an Array
 * https://leetcode.com/problems/sort-an-array/
 * 
 * To run the code in LeetCode, take the codes from 
 * int[] sortArray(int[] nums) method.
 * 
 * Runtime: 11 ms, faster than 22.15% of Java online submissions for Sort an Array.
 * Memory Usage: 44.6 MB, less than 93.44% of Java online submissions for Sort an Array.
 * 
 */

class SortAnArray {
    public int[] sortArray(int[] nums) {
        Queue<int[]> list = new LinkedList<int[]>();
        
        for(int i=0; i<nums.length; i++){
            list.add(new int[]{nums[i]});
        }
        
        while(list.size()>1){
            int[] a = list.poll();
            int[] b = list.poll();
            list.add(merge(a, b));
        }
        
        return list.poll();
    }
    
    int[] merge(int[] a, int[] b){
        int[] result = new int[a.length + b.length];
        int i = 0;
        int j = 0;
        int k = 0;
        
        while(i<a.length && j<b.length){
            if(a[i] < b[j]){
                result[k] = a[i];
                i++;
            }else{
                result[k] = b[j];
                j++;
            }
            k++;
        }
        
        while(i < a.length){
            result[k] = a[i];
            i++;
            k++;
        }
        
        while(j < b.length){
            result[k] = b[j];
            j++;
            k++;
        }

        return result;
    }
}