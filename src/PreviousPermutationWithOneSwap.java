/**
 * @author Shogo Akiyama 
 * Solved on 06/11/2019
 * 
 * 1053. Previous Permutation With One Swap
 * https://leetcode.com/problems/previous-permutation-with-one-swap/
 * 
 * To run the code in LeetCode, take the codes from the following method(s):
 * - int[] prevPermOpt1(int[] A)
 * - int[] helper(int[] A).
 * 
 * Runtime: 572 ms, faster than 5.00% of Java online submissions for Previous Permutation With One Swap.
 * Memory Usage: 326.2 MB, less than 100.00% of Java online submissions for Previous Permutation With One Swap.
 * 
 * Note: the solution can probably be improved, so try this problem again in the future.
 * 
 */

public class PreviousPermutationWithOneSwap {

    public int[] prevPermOpt1(int[] A) {
        int[] res = helper(A);
        return res==null? A: res;
    }
    
    int[] helper(int[] A){
        int[] sliced = new int[A.length-1];
        for(int i=0; i<A.length-1; i++){
            sliced[i] = A[i+1];
        }
        
        int[] result = null;
        if(sliced.length>1){
            result = helper(sliced);
        }
        
        if(result != null){
            for(int i=0; i<A.length-1; i++){
                A[i+1] = result[i];
            }
            return A;
            
        }else{
            int index = -1;
            int value = -1;
            for(int i=0; i<sliced.length; i++){
                if(A[0] > sliced[i] && value < sliced[i]){
                    index = i;
                    value = sliced[i];
                }
            }
            
            if(index != -1){
                A[index+1] = A[0];
                A[0] = value;
                return A;
            }else{
                return null;
            }
        }
    }

}
