/**
 * @author Shogo Akiyama 
 * Solved on 06/13/2019
 * 
 * 509. Fibonacci Number
 * https://leetcode.com/problems/fibonacci-number/
 * Difficulty: Easy
 * 
 * To run the code in LeetCode, take the codes from the following method(s):
 * - int fib(int N).
 * 
 * Runtime: 0 ms, faster than 100.00% of Java online submissions for Fibonacci Number.
 * Memory Usage: 32.8 MB, less than 39.76% of Java online submissions for Fibonacci Number.
 * 
 */

public class FibonacciNumber {
	
	public int fib(int N) {
        int[] record = new int[N+2]; //N+2 for the case of N=0. if we use N+1, record[1] will not exist.
        record[0] = 0;
        record[1] = 1;
        for(int i=2; i<N+1; i++){
            record[i] = record[i-1] + record[i-2];
        }
        return record[N];
    }
	
}