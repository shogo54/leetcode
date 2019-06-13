/**
 * 
 * @author Shogo Akiyama 
 * Solved on 04/20/2019
 * 
 * 905. Sort Array By Parity
 * https://leetcode.com/problems/sort-array-by-parity/
 * 
 * To run the code in LeetCode, take the codes from the following method(s):
 * int[] sortArrayByParity(int[] A).
 * 
 * Runtime: 1 ms, faster than 100.00% of Java online submissions for Sort Array By Parity.
 * Memory Usage: 42.2 MB, less than 21.75% of Java online submissions for Sort Array By Parity.
 * 
 */

public class SortArrayByParity {

	public static String convertArrayToString(int[] array) {
		String result = "[";
		for (int i = 0; i < array.length; i++) {
			result += array[i] + ",";
		}
		result = result.substring(0, result.length() - 1) + "]";

		return result;
	}

	public static void main(String[] args) {
		int[] test = { 3, 1, 2, 4 };
		int[] result = new SortArrayByParity().sortArrayByParity(test);

		System.out.println("Test case: " + SortArrayByParity.convertArrayToString(test));
		System.out.println("Result: " + SortArrayByParity.convertArrayToString(result));
	}

	public int[] sortArrayByParity(int[] A) {
		int evenIndex = 0;
		int oddIndex = A.length - 1;
		int[] result = new int[A.length];

		for (int i = 0; i < A.length; i++) {
			if (A[i] % 2 == 0) {
				result[evenIndex] = A[i];
				evenIndex++;
			} else {
				result[oddIndex] = A[i];
				oddIndex--;
			}
		}
		return result;
	}
	
}
