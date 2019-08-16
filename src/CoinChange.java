/**
 * @author Shogo Akiyama 
 * Solved on 08/15/2019
 * 
 * 322. Coin Change
 * https://leetcode.com/problems/coin-change/
 * 
 * To run the code in LeetCode, take the codes from the following method(s):
 * - int coinChange(int[] coins, int amount).
 * 
 * Runtime: 10 ms, faster than 71.40% of Java online submissions for Coin Change.
 * Memory Usage: 36 MB, less than 94.08% of Java online submissions for Coin Change.
 * 
 */

public class CoinChange {

	public int coinChange(int[] coins, int amount) {
        int[] mins = new int[amount+1];
        for(int i=1; i<amount+1; i++){
            int min = Integer.MAX_VALUE;
            for(int j=0; j<coins.length; j++){
                int index = i - coins[j];
                if(index >= 0 && mins[index] != -1 && mins[index] < min){
                    min = mins[index];
                }
            }
            if(min != Integer.MAX_VALUE){
                mins[i] = min + 1;
            }else{
                mins[i] = -1;
            }
        }
        return mins[amount];
    }
	
}
