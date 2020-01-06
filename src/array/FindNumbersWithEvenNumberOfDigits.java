package array;

/**
 * @author Shogo Akiyama 
 * Solved on 01/05/2020
 * 
 * 1295. Find Numbers with Even Number of Digits
 * https://leetcode.com/problems/find-numbers-with-even-number-of-digits/
 * Difficulty: Easy
 * 
 * Approach: Iteration
 * Runtime: 2 ms, faster than 37.30% of Java online submissions for Find Numbers with Even Number of Digits.
 * Memory Usage: 38.5 MB, less than 100.00% of Java online submissions for Find Numbers with Even Number of Digits.
 * 
 * Time Complexity: O(n)
 * Space Complexity: O(1)
 * Where n is the number of elements in an array
 * 
 * @see ArrayTest#testFindNumbersWithEvenNumberOfDigits()
 */
public class FindNumbersWithEvenNumberOfDigits {
	public int findNumbers(int[] nums) {
		int count = 0;

		for (int num : nums) {
			if (String.valueOf(num).length() % 2 == 0) {
				count++;
			}
		}

		return count;
	}
}
